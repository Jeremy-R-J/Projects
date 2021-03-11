from django.db import models
from django.contrib.auth.models import UserManager
import re
import bcrypt

class UserManager(models.Manager):
    def register_validator(self, postData):
        errors = {}
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if 'first_name' in postData and len(postData['first_name']) < 2:
            errors["first_name"] = "First Name should be at least 2 characters"
        if 'last_name' in postData and len(postData['last_name']) < 2:
            errors["last_name"] = "Last Name should be at least 2 characters"
        if not EMAIL_REGEX.match(postData['email']):
            errors['email_pattern'] = 'Invalid email address provided'
        if len(User.objects.filter(email = postData['email'])) > 0:
            errors['email_used'] = "Email already in use"
        if 'password' in postData and len(postData['password']) < 8:
            errors["password"] = "Password must be at least 8 characters"
        if 'con_password' in postData and len(postData['con_password']) != len(postData['password']):
            errors["con_password"] = "Must match previous password check your spelling!"
        return errors
    
    def login_validator(self, postData):
        errors= {}
        user_email= User.objects.filter(email=postData["email"])
        if len(user_email)==0:
            errors['db_email']='You have never logged in before, register first duh!'
        else:
            if bcrypt.checkpw(postData['password'].encode(), user_email[0].password.encode()):
                print("password matches")  
            else:
                errors['user_email'] = "Password is incorrect"
        return errors 

    def basic_validator(self, postData):
        errors = {}
        
        if len(postData['job_name']) < 2:
            errors["job_name"] = "Title should be at least 2 characters"
        if len(postData['location']) < 2:
            errors["location"] = "Location needs to be at least 2 characters"
        if len(postData['start_date']) == False :
            errors["desc"] = "Pick a better day"
        if len(postData['end_date']) == False:
            errors["desc"] = "Pick a better day"
        return errors

class User(models.Model):
    first_name = models.CharField(max_length=50)
    last_name = models.CharField(max_length=50)
    email = models.EmailField(max_length=100)
    password= models.CharField(max_length=50)
    con_password= models.CharField(max_length=50)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects=UserManager()

class Job(models.Model):
    job_name = models.CharField(max_length=50)
    location = models.CharField(max_length=150)
    start_date = models.DateTimeField()
    end_date = models.DateTimeField()
    user = models.ForeignKey(User, related_name ="jobs", on_delete = models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects=UserManager()