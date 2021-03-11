from django.shortcuts import  render, HttpResponse, redirect, render_to_response
from .models import Show
from django.contrib import messages


def index(request):
    print("Bitchin")
    return render(request, "index.html")
def read_one(request, id):
    print("Bitchin2")
    context = {
        "show": Show.objects.get(id=id),
    }
    return render (request, "read_one.html", context)
def edit_show(request, id):
    print("Making progress")
    edit_show=Show.objects.get(id=id)
    context = {
        "show": edit_show,
    }
    return render(request, "update.html", context) 
def update(request, id):
    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for i, value in errors.items():
            messages.error(request, value)
        return redirect(f'/edit_show/{id}')
    else:
        new_show = Show.objects.create()
        new_show.title = request.POST['title']
        new_show.network = request.POST['network']
        new_show.desc = request.POST['desc']
        new_show.save()
        messages.success(request, "Show update succsesful")
    print("Bitchin3")
    if request.method == "POST":
        show =Show.objects.get(id=id)
        show.title=request.POST["title"]
        show.network=request.POST["network"]
        show.release_date=request.POST["release_date"]
        show.desc=request.POST["desc"]
        show.save()
    return redirect (f"/read_one/{show.id}")
def read_all(request):
    print("Bitchin4")
    context = {
        "shows": Show.objects.all(),
    }
    return render (request, "read_all.html", context)  
def create_show(request):
    errors = Show.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for i, value in errors.items():
            messages.error(request, value)
        return redirect('/index')
    else:
        new_show = Show.objects.create()
        new_show.title = request.POST['title']
        new_show.network = request.POST['network']
        new_show.desc = request.POST['desc']
        new_show.save()
        messages.success(request, "Show update succsesful")
        print("Bitchin2")
        new_show=Show.objects.create(
        title=request.POST["title"],
        network=request.POST["network"],
        release_date=request.POST["release_date"],
        desc=request.POST["desc"],
        )
    return redirect (f"/read_one/{new_show.id}")



def delete(request, id):
    print("Making progress")
    go_away=Show.objects.get(id=id)
    go_away.delete()
    return redirect("/")    
