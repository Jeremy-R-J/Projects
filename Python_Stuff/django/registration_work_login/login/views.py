from django.shortcuts import  render, HttpResponse, redirect, render_to_response
from .models import User
from django.contrib import messages
import bcrypt

def login_page(request):
    if 'user_id' in request.session:
        return redirect( "/success_page")
    return render(request, "login_page.html")

def register_user(request):
    print ("!!!!!!!!!!!!!!!!!!!!!!!!")
    print(request.POST)
    errors = User.objects.register_validator(request.POST)
    if len(errors) > 0:
        for i, value in errors.items():
            messages.error(request, value)
        return redirect('/')
    else:
        print('work please')
        print(request.POST)
        pw_hash = bcrypt.hashpw(request.POST.get('password').encode(), bcrypt.gensalt()).decode()
        if request.method=="POST":
            new_user = User.objects.create(
                first_name = request.POST['first_name'],
                last_name = request.POST['last_name'],
                email = request.POST['email'],
                password = pw_hash,
                )
            request.session['user_id'] =new_user.id
            print("Bitchin2")
        return redirect( "/")

def login_user(request):
    print('$$$$$$$$$$$$$$$$$$$$$$$$$$')
    print(request.POST)
    errors = User.objects.login_validator(request.POST)
    if len(errors) > 0:
        for i, value in errors.items():
            messages.error(request, value)
        return redirect('/')
    user=User.objects.filter(email=request.POST['email'])
    if user:
        logged_user= user[0]
        if bcrypt.checkpw(request.POST["password"].encode(), logged_user.password.encode()):
            request.session['user_id'] = logged_user.id
            return redirect('/success_page')
        else:
            messages.add_message(request, messages.INFO, 'Incorrect User no access for you, foo!')    
            return redirect("/")

def delete_session(request):
    del request.session['user_id']
    return redirect("/")   

def success_page(request):
    if 'user_id' not in request.session:
        return redirect("/")
    context = {
        "log_id": User.objects.filter(id=request.session['user_id']).first()
    }
    return render(request, 'success_page.html', context)