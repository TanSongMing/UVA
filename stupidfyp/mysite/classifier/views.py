from django.shortcuts import render
from django.http import HttpResponse
from django.core.files.storage import FileSystemStorage
# Create your views here.
import os
def index(request):
    return HttpResponse("HELLO")

def upload(request):
    p = os.listdir('classifier/static/media')
    if request.method == "POST":
        uploaded_file = request.FILES['document']
        fs = FileSystemStorage()
        fs.save(uploaded_file.name, uploaded_file)
        p_new = os.listdir('classifier/static/media')
        rename_path = [x for x in p_new if x not in p]
        os.rename("classifier/static/media/"+rename_path[0],"classifier/static/media/{}.jpeg".format(str(len(p)+1)))
        num_of_bird = ['great hornbill','black hornbill']
        return render(request, "classify.html", {'path': os.listdir('classifier/static/media')[-1],"num_of_bird":num_of_bird,"count":len(num_of_bird)})
    return render(request,'upload.html',{"path":p[0]})

def classify(request):
    return render(request)

