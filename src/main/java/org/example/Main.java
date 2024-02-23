package org.example;

import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

import static org.example.service.EventService.getAllEvents;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Hello world!");

        String allEvents = getAllEvents();
        if (allEvents != null) {
            System.out.println(allEvents);
        }


    }
}
