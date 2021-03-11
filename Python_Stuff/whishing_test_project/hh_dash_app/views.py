from django.shortcuts import  render, HttpResponse, redirect, render_to_response
from .models import User
from .models import  Job
from django.contrib import messages
import bcrypt

def login_page(request):
    if 'user_id' in request.session:
        return redirect( "/hand_helper_dash")
    return render(request, "login_page.html")
def view_page(request):
    context = {
        "job": Job.objects.all(id=request.session['user_id'])
    }
    return render(request, "hand_helper_dash.html", context)
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
        return redirect( "/hand_helper_dash")

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
            return redirect('/hand_helper_dash')
        else:
            messages.add_message(request, messages.INFO, 'Incorrect User no access for you, foo!')    
            return redirect("/")

def delete_session(request):
    del request.session['user_id']
    return redirect("/")   

def hand_helper_dash(request):
    if 'user_id' not in request.session:
        return redirect("/")
    context = {
        "log_id": User.objects.get(id=request.session['user_id']),
        "jobs": Job.objects.all(),
    }
    return render(request, 'hand_helper_dash.html', context)
def create_job(request):
    errors = Job.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for i, value in errors.items():
            messages.error(request, value)
        return redirect('/new_job')
    else:
        this_user=User.objects.get(id=request.session['user_id'])
        new_job= Job.objects.create(
            job_name = request.POST['job_name'],
            start_date = request.POST['start_date'],
            end_date = request.POST['end_date'],
            location = request.POST['location'],
            user= this_user,
        )
    print("dam2")
    return redirect (f"/hand_helper_dash")
def new_job(request):
    context = {
        "log_id": User.objects.get(id=request.session['user_id'])
    }
    return render(request, "new_job.html", context)
def read_page(request, id):
    
    context = {
        "job":Job.objects.get(id=id),
        "jobs": Job.objects.filter(id=request.session['user_id'])
    }
    return render(request, "view_page.html", context)

def edit_job(request, id):
        edit_job=Job.objects.get(id=id)
        context ={
        "log_id": User.objects.get(id=request.session['user_id']),
        'edit_job' : edit_job,
        }
        return render(request, "edit_page.html", context)
def update_job(request,id):
    errors = Job.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for i, value in errors.items():
            messages.error(request, value)
        return redirect(f"/edit_job/{id}")
    else:
        request.method =='POST'
        update= Job.objects.get(id=id)
        update.job_name = request.POST['job_name']
        update.start_date = request.POST['start_date']
        update.end_date = request.POST['end_date']
        update.location = request.POST['location']
        update.save()    
        print("dam2")
        return redirect (f"/hand_helper_dash")
def delete_job(request, id):
    print("Making progress")
    go_away=Job.objects.get(id=id)
    go_away.delete()
    return redirect("/hand_helper_dash") 