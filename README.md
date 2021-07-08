# Stakater Task Backend


## Requirements

- A favorite text editor or IDE

- JDK 1.8 or later

- Gradle 4+ or Maven 3.2+

- You can also import the code straight into your IDE: Spring Tool Suite (STS)


## Setup instructions

### 1. Install dependencies

```sh
# install Java.
```

### 2. Setup up for creating Web Service

- Navigate to https://start.spring.io. This service pulls in all the dependencies you need for an application and does most of the setup for you.

- Choose either Gradle or Maven and the language you want to use. This guide assumes that you chose Java.

- Click Dependencies and select Spring Web and Spring Web Services.

- Click Generate.

- Download the resulting ZIP file, which is an archive of a web application that is configured with your choices.


### 4. Start your app

Web services can be accessed using any of the below mentioned instructions:
                
  - Run web service([ backend ]( https://github.com/dhirendra-singh5/stakater_task_backend/)) using application server, then hit the [URL](http://localhost:9090/view.html). Before starting the server, set the Environment variable.
                
  - Create the Docker image using maven plugin or maven file which is in project, then run the camand "docker run -p 9090:9090 hubid/imageName" or we can  provide the tag instead of image name as well, if we have done tagging. Then, hit the url "http://localhost:9090/view.html".
                
  - **a:** Install the minikube for single node cluster on local machine and run the command "minikube start" so that cluster will create. Inside cluster, there  are few things that will also get created: cluster>Node>pod>container.
  
    **b:** Download and set the kubectl.exe path in Environment variable of the local machine so that we can use the client through powerShell.
    
    **c:** Now we need to run our Kubernetes command "kubectl create deployment ServiceName --image=ImageNmae or tag ", I have uploaded the Docker image in my public repository of  [docker registry](https://hub.docker.com/repository/docker/dhirid/webservice), it will get the image from this repository or we can use deployment.yaml which is in project to deploy this application.
    
    **d:** Now we need to Expose the service using this command "kubectl expose deployment serviceName --type=LoadBalancer --port=9090".
    
    **e:** Finally we can access our Web page or service through Browser.
