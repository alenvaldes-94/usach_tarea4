package com.example;

public class App {
    public static String holaMundo(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            return "Hola mundo!";
        }
        return "Hola " + nombre + "!";
    }

    public static void main(String[] args) {
        System.out.println(holaMundo("Alen"));
    }
}