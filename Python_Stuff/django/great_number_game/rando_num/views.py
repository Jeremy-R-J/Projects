from django.shortcuts import render, redirect
import random



def index(request):
    if 'newGame' not in request.session:
        returnText='Welcome, Lets Play'
        request.session['value']=random.randint(1,100)
        request.session['status']=0
        request.session['newGame']=True
    else:
        returnText=''
        if request.session['status']==1:
            returnText='Your Guess is low, buster!'
        elif request.session['status']==2:
            returnText='Shooting for the moon I see!'
    context={
        'returnText': returnText
    }
    return render(request, "index.html", context)


def checkAnswer(request):
    if int(request.POST['guess']) < request.session['value']:
        request.session['status']=1
    if int(request.POST['guess']) > request.session['value']:
        request.session['status']=2
    if int(request.POST['guess'])==request.session['value']:
        return redirect('/winner')
    return redirect('/')

def winning(request):
    return render(request, "winner.html")

def newGame(request):
    request.session.flush()
    return redirect('/')