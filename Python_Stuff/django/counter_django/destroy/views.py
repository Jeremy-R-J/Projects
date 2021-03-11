from django.http import request
from django.shortcuts import render, redirect

#  Create your views here.
def index(request):

    if 'counter' in request.session:
        request.session['counter']+=1;
    
        print('key exists!')
    else:
        print("key 'key_name' does NOT exist")
        request.session['counter'] = 0;
        # request.session['name'] = request.POST['name']

    return render(request, 'index.html')

    


def destroys_session(request):
    del request.session['counter']
    if 'counter' in request.session:
        request.session['counter']+=1;
    
        # print('key exists!')
    else:
        # print("key 'key_name' does NOT exist")
        request.session['counter'] = 0;
    return redirect('/')


    