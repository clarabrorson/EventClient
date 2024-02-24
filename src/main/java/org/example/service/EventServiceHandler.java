package org.example.service;

import org.apache.hc.core5.http.ParseException;
import org.example.entity.Event;

import java.io.IOException;
import java.util.List;

public class EventServiceHandler {


    public static void viewAllEvents() throws IOException, ParseException {
        List<Event> events = EventService.getAllEvents();
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public static void viewEventById(Long id) throws IOException, ParseException {
        String event = EventService.getEventById(id);
        System.out.println(event);
    }

    public static void addEvent(Event event) throws IOException, ParseException {
        String response = EventService.addEvent(event);
        System.out.println(response);
    }

    public static void updateEvent(Event event) throws IOException, ParseException {
        EventService.updateEvent(event);

    }

    public static void deleteEventById(String id) throws IOException, ParseException {
        EventService.deleteEventById(id);
    }
}
