from django.shortcuts import render, redirect
from .models import Users


def index(request):
    context = {
    "all_users": Users.objects.all()
    }
    return render(request, "index.html", context) 



def create(request):
    Users.objects.create(
        first_name=request.POST['first_name'],
        last_name=request.POST['last_name'],
        age=request.POST['age'],
        fav_movie=request.POST['fav_movie'],
    )
    return redirect('/')