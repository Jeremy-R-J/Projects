from django.shortcuts import render


class Book(models.Model):
    def __str__(self):
        return f"<Book object: {self.title} ({self.id})>"

class Author(models.Model):
    def __str__(self):
        return f"<Book object: {self.title} ({self.id})>"
