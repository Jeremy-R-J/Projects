from django.shortcuts import render, redirect, HttpResponse
from .models import Dojo
from .models import Ninja

def index(request):
    print("Bitchin")
    context = {
        "dojos": Dojo.objects.all(),
        "ninjas": Ninja.objects.all(),
    }
    return render(request, "index.html", context)
    
def create_dojo(request):
    print("bitchin2")
    Dojo.objects.create(
        dojo_name=request.POST["dojo_name"],
        dojo_city=request.POST["dojo_city"],
        dojo_state=request.POST["dojo_state"],
    )
    return redirect("/")

def create_ninja(request):
    print(request.POST["dojo"])
    dammit=Dojo.objects.get(id=request.POST["dojo"])
    Ninja.objects.create(
        first_name=request.POST["first_name"],
        last_name=request.POST["last_name"],
        dojo=dammit,
    )
    return redirect("/")