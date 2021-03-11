from django.shortcuts import render, HttpResponse

# Create your views here.
def index(request):
    print("HELLO WORLD!!")
    return HttpResponse("Hello World!!!") 

def dog(request):
    print("Mando is my dog")
    return HttpResponse("Mando is my dog")
