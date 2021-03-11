from django.shortcuts import  render, HttpResponse, redirect, render_to_response
from .models import Book
from .models import Author
def index(request):
    print("Bitchin")
    context = {
        "books": Book.objects.all(),
    }
    return render(request, "index.html")

def create_book(request):
    # creation function for book info
    print('work dammit')
    book_name_from_form = request.POST['book_name']
    desc_book_from_form = request.POST['desc_book']
    context={ 
        'book_name':book_name_from_form,
        'desc_book':desc_book_from_form,
        'authors':{'author_from_form'},
        
    }
    return render(request, 'index.html', context)

    
# def author_maker(request):
#         return render(request, "author_maker.hmtl")   


def author_maker(request):
    # creation function for author info
    print('work dammit')
    first_name_from_form = request.POST['first_name']
    last_name_from_form = request.POST['last_name']
    notes_from_form = request.POST['notes']
    context={ 
        'first_name':first_name_from_form,
        'last_name':last_name_from_form,
        'notes':notes_from_form, 
    }
    return render(request, 'author_maker.html')

def author_reader(request):
        # creation function for book info
    print('work dammit')
    return redirect ('/')