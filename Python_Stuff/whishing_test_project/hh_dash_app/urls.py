from django.urls import path
from .import views


urlpatterns = [
    path('', views.login_page),
    path('register_user', views.register_user),
    path('login_user', views.login_user),
    path('hand_helper_dash', views.hand_helper_dash),
    path('delete_session', views.delete_session),
    path('new_job', views.new_job),
    path('view_page', views.view_page),
    path('create_job', views.create_job),
    path('hand_helper_dash', views.hand_helper_dash),
    path('read_page/<int:id>', views.read_page),
    path('edit_job/<int:id>', views.edit_job),
    path('update_job/<int:id>', views.update_job),
    path('delete_job/<int:id>', views.delete_job),
    
]