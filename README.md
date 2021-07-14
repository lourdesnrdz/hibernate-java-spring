# hibernate-java-spring
Hibernate and Java Spring Course

## Table of contents

* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
<!-- * [Concepts](#concepts) -->

## General info

On this course I learned how to use the Spring framework to create a web application. We implemented our project using the Spring framework, Spring Boot, Spring Data and Spring Security.

I learned that a web aplication is composed of 3 main components:
1. Client: represented by a browser
2. Web server: it resides on the web app and receives the client's peticions
3. Database: where all the information is stored and managed

Also, they have a modular structure with multiple components that are distributed in layers and have many advantages, such as:
* Easy instalation and actualization
* Saves resources
* Independence from the operating system
* Supports multiple concurrent users
* Supports multi-device access

The difference with an application server, is that the users access the web app through a browser and sends the requirements and petitions to a web server, which is responsible of sending the queries to the database and return the response to the user.

The arquitecture patterns help to reduce code duplicity and facilitate maintenance. The MVC arquitecture pattern consist of the following elements:
* Model layer: structure of all the classes and components related to the database
* Business layer: rules, analysis and functional requitrements of the app
* View layer: UI, forms and visual components that the users interact with

Throughout the course we developed a project using the Spring Framework, whose main characteristic is managing the dependencies inyection. Other important characteristics are:
* Development based on POJOS
* Low coupling
* Declarative programming
* Boilerplate code reduction
* Layered architecture

Spring Data provides a easy way to implemment the access layer to the data using JPA specification. Spring Sata JPA can manage Relational and non-Relation DBs, unlike ORMS such as Hibernate that can only manage Relational DBs.

Spring Security is a framework that helps us manage the security of our Java applications in several levels. We used it to configure the user's credentials instead of using the default configuration.

After our app was complete we created a docker image of it and stored it on Docker Hub.

For the documentation we used Swagger, which is a tool that allows us to document and execute our Web API's interactively.

## Technologies

On this course I used the following development technologies:
 <!-- - Visual Studio Code -->
 - Git
 - Github
 - Java SE Development Kit 8
 - SpringToolSuite4
 - Docker
 - OmniDB

## Setup

The setup for this project was made on a Windows 10 OS.

### Java SE Development Kit 8

1. Go to [https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
2. Download the JDK for your OS

### SpringToolSuite4
For this course we used 2 versions of OpenJDK.

1. Go to [https://adoptopenjdk.net/](https://spring.io/tools)
2. Select the version for you OS

### Docker
1. Go to [https://www.docker.com/products/docker-desktop](https://www.docker.com/products/docker-desktop)
2. Download version for your OS.


### OmniDB
1. Go to [https://www.omnidb.org/en/](https://www.omnidb.org/en/) to download