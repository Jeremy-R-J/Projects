from django.urls import path
from .import views

urlpatterns = [
    path('index', views.index),
    path('read_one/<int:id>', views.read_one),
    # path('read_one/<show.id>', views.read_one),
    path('update/<int:id>', views.update),
    path('update', views.update),
    path('', views.read_all),
    path('create_show', views.create_show),
    path('edit_show/<int:id>', views.edit_show),
    path('delete/<int:id>', views.delete),
]