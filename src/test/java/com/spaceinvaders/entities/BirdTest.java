package com.spaceinvaders.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PajaroTest {
    @Test
    void pajaroPorDefecto() {
        Bird pajaro = new Bird("Piolín", 0.2, 2, "Semillas", 15.0, "Pío");
        assertEquals("Piolín", pajaro.getName(), "El nombre del pájaro debe ser Piolín");
        assertEquals(0.2, pajaro.getHeight(), 0.0001, "La altura debe ser 0.2");
        assertEquals(2, pajaro.getWeight(), "El peso debe ser 2");
        assertEquals("Semillas", pajaro.getFavoriteFood(), "La comida favorita debe ser Semillas");
        assertEquals(15.0, pajaro.getSpeed(), 0.0001, "La velocidad debe ser 15.0");
        assertEquals("Pío", pajaro.getSound(), "El sonido debe ser Pío");
        assertEquals("¡Puedo volar alto en el espacio!", pajaro.tryToFly(), "El pájaro debe poder volar");
    }
} 