package org.example.service;

import org.apache.hc.core5.http.ParseException;
import org.example.entity.Event;

import java.io.IOException;

public class EventServiceHandler {

    public static void viewAllEvents() throws IOException, ParseException {
        String events = EventService.getAllEvents();
        System.out.println(events);
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

    public static void deleteEventById(Long id) throws IOException, ParseException {
        String response = EventService.deleteEventById(id);
        System.out.println(response);
    }
}
