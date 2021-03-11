from django.shortcuts import  render, HttpResponse, redirect, render_to_response

def index(request):
        return render(request, "index.html")

def create_user(request):
    # this is the route that processes the form
    name_from_form = request.POST['name']
    last_from_form = request.POST['last']
    email_from_form = request.POST['email']
    comments_from_form = request.POST['comments']
    context={ 
        'name':name_from_form,
        'last':last_from_form,
        'email':email_from_form,
        'comments':comments_from_form,
    }
    return render(request, 'filler.html', context)

