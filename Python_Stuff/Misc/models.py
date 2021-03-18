class Task(models.Model):
    due_date = models.DateField(max_length=255)
    action = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    # completed_tasks is related name


class Completed_task(models.Model):
    Owner = models.CharField(max_length=255)
    due_date = models.DateField(max_length=255)
    tasks = models.ForeignKey(Task, related_name ="completed_tasks", on_delete = models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


    from django.db import models

#  Many-to-Many and One-to-many Exercises

# 1
# Create the models.py for an Events App

# (Original) Users can organize events, events can only have one organizer
# (Original) Users can attend many events, and events can have many users attending
#Users can organize events and attend events
#Events can have unlimited users, but only one Organizer
class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    # whatever other fields
    created_at = models.DateTimeField(auto_now=True)
    updated_at = models.DateTimeField(auto_now_add=True)
    # events_attending
    # events_organizing

    
    

class Event(models.Model):
    title = models.CharField(max_length=255)
    description = models.CharField(max_length=255)
    event_date = models.DateField()

    # whatever other fields / relationships
    
    organizer = models.ForeignKey(User, related_name="events_organizing")
    attendees = models.ManytoManyField(User, related_name="events_attending")

    created_at = models.DateTimeField(auto_now=True)
    updated_at = models.DateTimeField(auto_now_add=True)