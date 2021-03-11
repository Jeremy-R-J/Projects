from django.db import models
from django.db.models.aggregates import Max


# Create your models here.
class Dojo(models.Model):
    dojo_name = models.CharField(max_length=255)
    dojo_city = models.CharField(max_length=255)
    dojo_state = models.CharField(max_length=255)
    desc =models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    # ninjas is related name


class Ninja(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    dojo = models.ForeignKey(Dojo, related_name ="ninjas", on_delete = models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


#
# last_dojo=