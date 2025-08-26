package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HolaMundoTest {

    @Test
    void metodo1_alen() {
        assertEquals("Hola Alen!", App.holaMundo("Alen"));
    }

    @Test
    void metodo2_alen() {
        assertEquals("Hola mundo!", App.holaMundo(null));
        assertEquals("Hola mundo!", App.holaMundo(""));
        assertEquals("Hola mundo!", App.holaMundo("  "));
    }
}