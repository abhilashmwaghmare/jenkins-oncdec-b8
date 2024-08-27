# Jenkins

SDLC - Software Development Life Cycle
Req Gather and Analysis
Plan and Design
Coding and Implimentation
Test 
Deliver and Deploy
Monitoring and Maintainers

Coding:


java application:

main.java -> syntax check -> integrate -> compile -> .jar -> run 
.java
.java


syntax -> integrate -> compile -> .jar -> Deploy Server


main.java -> .jar (ERP)

dev (server) -> deplpoy


Automate - CI-CD 
--------

Continuous Integration

java - 

pull - git clone
syntax - java check syntax
integrate - javac integrate
compile - javac -o 
packaging - tar -xzf .jar

Continuous Integration Process -> Gitlab-ci, Jenkins, Bamboo, Github Action, AWS Code Pipeline, Azure Pipeline, Cloud Build, etc.

Deployment -> cp .jar /opt/tomcat/webapps/*.jar
Delivery -> aws cp .jar s3://my-bucket/*.jar

Continuous Testing

Continuous Deployment OR Delivery
---------------------------------------------------------------------------

Jenkins - Hudson company
CICD
java, 8080
root dir: /var/lib/jenkins

widqah-wIsveh-2xurje

## Install Jenkins
### install java
```shell
apt-get update
apt install fontconfig openjdk-17-jre -y
java -version
```
### Install Jenkins
```shell
 wget -O /usr/share/keyrings/jenkins-keyring.asc   https://pkg.jenkins.io/debian-stable/jenkins.io-2023.key
 echo "deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc]"   https://pkg.jenkins.io/debian-stable binary/ | sudo tee   /etc/apt/sources.list.d/jenkins.list > /dev/null
 apt-get install jenkins
```
### Start Jenkins
```shell
systemctl start jenkins
systemctl enable jenkins
```

### Practical Summary
1. How to install Jenkins Server
2. Run your first job
    - New item
    - Build Step
3. How to install plugins
    - manage jenkins
    - plugins
    - available plugins
    - search plugin and install
4. Create master slave Jenkins
    - instance launch (on node)
    - java install (on node)
    - manage jenkins
    - node
    - new node
    - remote root dir /home/ubuntu
    - labels node
    - Launch Method - Launch via ssh - 
        host - private IP
        credential - add key (user and private key)
        Host Key Verification Strategy - non
    - Job configure (restric node (label - node))


JOB - Github

Pipeline - Plugin suit Multistage JOB
Declarative and Scripted Pipeline


### Practical Summary
1. Parameterize job
2. Pull code from Github
    plugin: git
    SCM: github url
3. Pipeline
    Plugin: pipeline, pipeline: Stage view
    Create Pipeline Job
    pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                 echo 'Hello World'
            }
        }
        stage('Test') { 
            steps {
                 
            }
        }
        stage('Deploy') { 
            steps {
                
            }
        }
    }
}


Pipeline: 
----------

Java based - Angular - maven 


Pull - Git Clone repo
Build (.war / .jar) - Syntax, integrate, compile, package 
Test (Sonarqube) - test
Deploy (tomcat / Java) - cp .war /tomcat/webapps/


Maven - Automate Build Tool

syntax, integrate, compile, run, test, packaging

Install maven
Create project
Studentapp(java, maven) - student.war

Maven lifecycle
----------------
default ()
clean
site


mvn clean package