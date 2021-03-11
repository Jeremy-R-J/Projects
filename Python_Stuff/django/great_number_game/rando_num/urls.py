from django.urls import path
from . import views




urlpatterns= [
    path('', views.index),
    path('checkAnswer', views.checkAnswer),
    path('winner', views.winning),
    path('newGame', views.newGame),
]
