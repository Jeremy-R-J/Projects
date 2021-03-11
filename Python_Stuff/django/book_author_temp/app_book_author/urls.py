from django.urls import path
from .import views

urlpatterns = [
    path('', views.index),
    path('author_maker/', views.author_maker),
    path('author_reader/', views.author_reader),
    path('create_book/', views.author_reader),
    # path('book_reader/', views.book_reader),
]
