package org.example;

import org.apache.hc.core5.http.ParseException;
import org.example.menu.MainMenu;

import java.io.IOException;

import static org.example.service.EventService.getAllEvents;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        MainMenu.RunMenu();


    }
}
