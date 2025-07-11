package com.spaceinvaders.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PerroTest {
    @Test
    void perroPorDefecto() {
        Dog perro = new Dog("Firulais", 0.6, 20, "Croquetas", 10.0, "Guau");
        assertEquals("Firulais", perro.getName(), "El nombre del perro debe ser Firulais");
        assertEquals(0.6, perro.getHeight(), 0.0001, "La altura debe ser 0.6");
        assertEquals(20, perro.getWeight(), "El peso debe ser 20");
        assertEquals("Croquetas", perro.getFavoriteFood(), "La comida favorita debe ser Croquetas");
        assertEquals(10.0, perro.getSpeed(), 0.0001, "La velocidad debe ser 10.0");
        assertEquals("Guau", perro.getSound(), "El sonido debe ser Guau");
        assertEquals("No puedo volar, me muevo por el suelo", perro.tryToFly(), "El perro no debe poder volar");
    }
} 