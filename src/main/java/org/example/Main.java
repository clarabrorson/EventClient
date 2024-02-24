package org.example;

import org.apache.hc.core5.http.ParseException;
import org.example.menu.MainMenu;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        Logger.getLogger("org.mongodb.driver")
                .setLevel(Level.SEVERE);

        MainMenu.RunMenu();

    }
}
