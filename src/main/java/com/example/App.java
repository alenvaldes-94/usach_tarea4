package com.example;

import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static String holaMundo(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Hola mundo!";
        }
        return "Hola " + nombre + "!";
    }

    public static void main(String[] args) {
        String nombre = (args != null && args.length > 0) ? args[0] : null;
        // Antes: System.out.println(holaMundo(nombre));
        LOGGER.info(holaMundo(nombre));
    }
}
