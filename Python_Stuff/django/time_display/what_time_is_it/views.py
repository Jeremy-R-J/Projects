from django.shortcuts import  render, HttpResponse
from time import gmtime, strftime
    
def index(request):
    context = {
        "time": strftime("%b-%d-%y %H:%M %p", gmtime())
    }
    return render(request,'index.html', context)
# def root(request):
    
#     return HttpResponse("/")

# def index(request):
    
#     return HttpResponse(render, 'index.html')