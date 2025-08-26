package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HolaMundoTest {
    @Test
    void metodo1_alen() {
        assertEquals("Hola mundo1", App.holaMundo("Alen"));
    }

    @Test
    void metodo2_alen() {
        assertEquals("Hola mundo2", App.holaMundo(null));
        assertEquals("Hola mundo2", App.holaMundo(""));
        assertEquals("Hola mundo2", App.holaMundo("  "));
    }
}