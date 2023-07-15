pipeline {
    agent any;
    stages {
        stage("CI Process"){
            steps {
                echo "Demo CI Process"
            }
        }
        stage("Build Docker Image"){
            steps {
                echo "Build Docker Image"
            }
        }
        stage("Push Image to Docker Hub"){
            steps {
                echo "Push Image to Docker Hub"
            }
        }
        stage("CD Process"){
            steps {
                echo "CD Process From This Stage to ON word"
            }
        }
        stage("Docker Hub Login"){
            steps {
                echo "Docker Hub Login"
            }
        }
        stage("Run Docker Image"){
            steps {
                echo "First will pull the Docker image"
                echo "Remove running Docker if already running"
                echo "Docker run with the command --rm and --name as well"
            }
        }
        stage("Check Deployment Status"){
            steps {
                echo "Curl the Page and check if status is 200 Ok."
                echo "Deployment is successful"
            }
        }
        stage("In case of 404"){
            steps {
                echo "Run the Old Docker image"
            }
        }
        stage("Send Email Notification"){
            steps {
                echo "Send Email Notification"
            }
        }
    }
}