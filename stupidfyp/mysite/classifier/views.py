from django.shortcuts import render
from django.http import HttpResponse
from django.core.files.storage import FileSystemStorage
# Create your views here.
def index(request):
    return HttpResponse("HELLO")

def upload(request):
    if request.method == "POST":
        uploaded_file = request.FILES['document']
        #fs = FileSystemStorage()
        #fs.save(uploaded_file.name, uploaded_file)
    return render(request,'upload.html')

