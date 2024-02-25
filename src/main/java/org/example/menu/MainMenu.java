package org.example.menu;

import org.apache.hc.core5.http.ParseException;
import org.example.entity.Event;
import org.example.service.EventServiceHandler;
import org.example.util.InputHandler;
import java.io.IOException;



public class MainMenu {

 public static void RunMenu() throws IOException, ParseException {
    while(true) {
        System.out.println("*************************" );
        System.out.println("Event Management System");
        System.out.println("*************************" );
        System.out.println();
        System.out.println("1. View all events");
        System.out.println("2. View event by id");
        System.out.println("3. Add event");
        System.out.println("4. Update event");
        System.out.println("5. Delete event");
        System.out.println("6. Exit");
        System.out.println();

        try {
            int choice = InputHandler.getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    EventServiceHandler.viewAllEvents();
                    break;
                case 2:
                    String id = InputHandler.getStringInput("Enter event id: ");
                    EventServiceHandler.viewEventById(id);
                    break;
                case 3:
                    Event newEvent = createEvent();
                    EventServiceHandler.addEvent(newEvent);
                    break;
                case 4:
                    Event updatedEvent = updateEvent();
                    EventServiceHandler.updateEvent(updatedEvent);
                    break;
                case 5:
                    deleteEventById();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
 }
private static Event createEvent() {
    System.out.println("Enter the following details to create a new event:");
    String eventName = InputHandler.getStringInput("Event Name: ");
    String eventDescription = InputHandler.getStringInput("Event Description: ");
    String eventDate = "";
    while (true) {
        eventDate = InputHandler.getStringInput("Event Date (YYYY-MM-DD): ");
        if (eventDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            break;
        } else {
            System.out.println("Invalid date format. Please enter in YYYY-MM-DD format.");
        }
    }
    String location = InputHandler.getStringInput("Location: ");
    String organizer = InputHandler.getStringInput("Organizer: ");
    String category = InputHandler.getStringInput("Category: ");
    return new Event("0", eventName, eventDescription, eventDate, location, organizer, category);
}
    private static Event updateEvent() throws IOException, ParseException {
        EventServiceHandler.viewAllEvents();
        String id = InputHandler.getStringInput("Enter the id of the event to update: ");
        System.out.println("Enter the new details for the event:");
        String eventName = InputHandler.getStringInput("Event Name: ");
        String eventDescription = InputHandler.getStringInput("Event Description: ");
        String eventDate = InputHandler.getStringInput("Event Date (YYYY-MM-DD): ");
        String location = InputHandler.getStringInput("Location: ");
        String organizer = InputHandler.getStringInput("Organizer: ");
        String category = InputHandler.getStringInput("Category: ");
        Event event = new Event(id, eventName, eventDescription, eventDate, location, organizer, category);
        EventServiceHandler.updateEvent(event);
        return event;
    }

    public static void deleteEventById() throws IOException, ParseException {
        EventServiceHandler.viewAllEvents();
        String id = InputHandler.getStringInput("Enter event id: ");
        EventServiceHandler.deleteEventById(id);
    }

}




