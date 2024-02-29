# Event Management Client

This is a Maven-based Java console application that acts as a client to the Event Management System's web service. The client allows users to manage events through a console-based interface.
This project is part of the CI/CD pipeline and is used to demonstrate the deployment of a web service application to AWS.
The project is hosted on AWS for a short period of time and contains functionality to respond to various requests.

### UPDATE: The Web Service for this project is no longer hosted on AWS.

## Features

The client provides the following features:

1. View all events
2. View event by id
3. Add event
4. Update event
5. Delete event

## Technologies Used

- Java
- Maven

## Project Structure

The project has a simple structure:

### `src/main/java/org/example/Main.java`
This is the entry point of the application.

### `src/main/java/org/example/entity/Event.java`
This class represents an Event entity.

### `src/main/java/org/example/service/EventService.java`
This class handles the HTTP requests to the server.

### `src/main/java/org/example/service/EventServiceHandler.java`
This class handles the interaction between the user and the EventService.

### `src/main/java/org/example/menu/MainMenu.java`
This class handles the main menu of the application.

## Setup and Run
Clone the webservice repository [Event Service](https://github.com/clarabrorson/EventWebService/blob/master/README.md)
Run the webservice before running the client.

To setup and run the project:

1. Clone the client repository
2. Open the project in IntelliJ IDEA
3. Run the `Main.java` file

## Note

This project is a simple demonstration of a console-based Event Management System. It does not include any form of authentication or authorization. It is not intended for production use.

## Web Service

This client interacts with a web service hosted on AWS. The web service provides the actual functionality for managing events. The client sends HTTP requests to the web service and displays the responses to the user.

The web service can be accessed at [Event Service](http://event-service-mongodb-env.eba-hux36rjj.us-west-2.elasticbeanstalk.com:8080/events)

For more information about the web service, please refer to its [README.md](https://github.com/clarabrorson/EventWebService/blob/master/README.md) file.