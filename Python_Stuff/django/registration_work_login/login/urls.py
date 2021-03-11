from django.urls import path
from .import views


urlpatterns = [
    path('', views.login_page),
    path('register_user', views.register_user),
    path('login_user', views.login_user),
    path('success_page', views.success_page),
    path('delete_session', views.delete_session),
    
]