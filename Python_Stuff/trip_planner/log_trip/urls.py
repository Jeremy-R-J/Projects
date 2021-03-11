from django.urls import path
from .import views


urlpatterns = [
    path('', views.login_page),
    path('register_user', views.register_user),
    path('login_user', views.login_user),
    path('dashboard', views.dashboard),
    # path('delete_session', views.delete_session),
    path('new_trip', views.new_trip),
    # path('view_page', views.view_page),
    # path('edit_page', views.edit_page),
    path('create', views.create_trip),
    path('read_page/<int:id>', views.read_page),
    path('edit_trip/<int:id>', views.edit_trip),
    path('update_trip/<int:id>', views.update_trip),
    # path('delete_trip/<int:id>', views.delete_trip),
    
]