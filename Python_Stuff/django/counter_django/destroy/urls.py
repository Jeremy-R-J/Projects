# 
# from django.contrib import admin
from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('destroys_session', views.destroys_session),
    # path('admin/', admin.site.urls),
]
