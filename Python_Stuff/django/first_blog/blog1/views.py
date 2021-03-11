from django.shortcuts import redirect, render, HttpResponse

def index(request):
    return HttpResponse("placeholder to later display list of blogs1")

def root(request):
    return redirect("/blogs")

def new(request):
    return HttpResponse("placeholder to display a new form to create a new blog2")

def create(request):
    return redirect('/')

def show(request, my_val):
    return HttpResponse(f"placeholder to display a blog number:{my_val}")

def edit(request, my_val):
    return HttpResponse(f"placeholder to edit a blog number:{my_val}")    

def destroy(request, my_val):
    return redirect("/blogs")