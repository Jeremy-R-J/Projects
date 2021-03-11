from django.shortcuts import  render, HttpResponse, redirect, render_to_response
from .models import User
from .models import  Trip
from django.contrib import messages
import bcrypt



def login_page(request):
    if 'user_id' in request.session:
        return redirect( "/dashboard")
    return render(request, "login_page.html")
def view_page(request):
    context = {
        "trip": Trip.objects.filter(id=request.session['user_id'])
    }
    return render(request, "dashboard.html", context)

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
        return redirect( "/dashboard")

def login_user(request):
    print('$$$$$$$$$$$$$$$$$$$$$$$$$$')
    print(request.POST)
    # # errors = User.objects.login_validator(request.POST)
    # if len(errors) > 0:
    #     for i, value in errors.items():
    #         messages.error(request, value)
    #     return redirect('/')
    user=User.objects.filter(email=request.POST['email'])
    if user:
        logged_user= user[0]
        if bcrypt.checkpw(request.POST["password"].encode(), logged_user.password.encode()):
            request.session['user_id'] = logged_user.id
            return redirect('/dashboard')
        else:
            messages.add_message(request, messages.INFO, 'Incorrect User no access for you, foo!')    
            return redirect("/")
            def delete_session(request):
                del request.session['user_id']
    return redirect("/")   

def dashboard(request):
    if 'user_id' not in request.session:
        return redirect("/")
    context = {
        "log_id": User.objects.get(id=request.session['user_id']),
        "trip": Trip.objects.all(),
    }
    return render(request, 'dashboard.html', context)
def create_trip(request):
    # errors = Trip.objects.basic_validator(request.POST)
    # if len(errors) > 0:
    #     for i, value in errors.items():
    #         messages.error(request, value)
    #     return redirect('/new_trip')
    # else:
        this_user=User.objects.get(id=request.session['user_id'])
        new_trip= Trip.objects.create(
            destination = request.POST['destination'],
            start_date = request.POST['start_date'],
            end_date = request.POST['end_date'],
            plan = request.POST['plan'],
            user= this_user,
        )
        print("dam2")
        return redirect (f"/dashboard")
def new_trip(request):
    context = {
        "log_id": User.objects.get(id=request.session['user_id'])
    }
    return render(request, "new_trip.html", context)
def read_page(request, id):
    
    context = {
        "trip":Trip.objects.get(id=id),
        "trips": Trip.objects.filter(id=request.session['user_id'])
    }
    return render(request, "view_trip.html", context)

def edit_trip(request, id):
        edit_trip=Job.objects.get(id=id)
        context ={
        "log_id": User.objects.get(id=request.session['user_id']),
        'edit_trip' : edit_trip,
        }
        return render(request, "edit_page.html", context)
def update_trip(request,id):
    errors = Trip.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for i, value in errors.items():
            messages.error(request, value)
        return redirect(f"/edit_trip/{id}")
    else:
        request.method =='POST'
        update= Trip.objects.get(id=id)
        update.destination = request.POST['destination']
        update.start_date = request.POST['start_date']
        update.end_date = request.POST['end_date']
        update.plan = request.POST['plan']
        update.save()    
    print("dam2")
    return redirect (f"/dashboard")
def delete_trip(request, id):
    print("Making progress")
    go_away=Trip.objects.get(id=id)
    go_away.delete()
    return redirect("/dashboard") 