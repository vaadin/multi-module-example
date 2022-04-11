# Vaadin Spring Boot Multi Module Example


This project is a multi-module Vaadin + Spring Boot project. It consists of two modules:

<ol>
  <li>backend: includes JPA entities, repos, and services</li>
  <li>vaadin-app: is the actual runnable application that depends on the backend library</li>
</ol>

## Running the project

From the root directory, run
```terminal
mvn install
```

then to start the project, run
```terminal
mvn spring-boot:run -pl vaadin-app
```
