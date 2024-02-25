package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.core5.http.ParseException;
import org.example.entity.Event;
import org.example.util.InputHandler;

import java.io.IOException;
import java.util.List;

public class EventServiceHandler {


    public static void viewAllEvents() throws IOException, ParseException {
        List<Event> events = EventService.getAllEvents();
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public static void addEvent(Event event) throws IOException, ParseException {
        String response = EventService.addEvent(event);
        System.out.println(response);
    }

    public static void updateEvent(Event event) throws IOException, ParseException {
        try {
            String response = EventService.updateEvent(event);
            if (response == null || response.contains("Error occurred")) {
                System.out.println("Event with id " + event.getEventId() + " not found.");
            } else {
                System.out.println("Event with id " + event.getEventId() + " updated successfully.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid id.");
        }
    }

    public static void viewEventById(String id) throws IOException, ParseException {
        try {
            String jsonResponse = EventService.getEventById(Long.parseLong(id));
            if (jsonResponse == null || jsonResponse.contains("Error occurred")) {
                System.out.println("Event with id " + id + " not found.");
            } else {
                Event event = new ObjectMapper().readValue(jsonResponse, Event.class);
                System.out.println(event);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid id.");
        }
    }

    public static void deleteEventById(String id) throws IOException, ParseException {
        try {
            String response = EventService.deleteEventById(id);
            if (response == null || response.contains("Error occurred")) {
                System.out.println("Event with id " + id + " not found.");
            } else {
                System.out.println("Event with id " + id + " deleted successfully.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid id.");
        }
    }

}
