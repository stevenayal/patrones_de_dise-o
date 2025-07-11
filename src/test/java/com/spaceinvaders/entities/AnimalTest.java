package com.spaceinvaders.entities;

import com.spaceinvaders.strategy.CantFly;
import com.spaceinvaders.strategy.ItFlys;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    static class AnimalPrueba extends Animal {
        public AnimalPrueba(String nombre, double altura, int peso, String comidaFavorita, double velocidad, String sonido) {
            super(nombre, altura, peso, comidaFavorita, velocidad, sonido);
        }
    }

    @Test
    void noPuedeVolar() {
        Animal animal = new AnimalPrueba("Prueba", 1.0, 10, "Comida", 5.0, "Sonido");
        animal.setFlyingAbility(new CantFly());
        assertEquals("No puedo volar, me muevo por el suelo", animal.tryToFly(), "El animal no debe poder volar");
    }

    @Test
    void puedeVolar() {
        Animal animal = new AnimalPrueba("Prueba", 1.0, 10, "Comida", 5.0, "Sonido");
        animal.setFlyingAbility(new ItFlys());
        assertEquals("¡Puedo volar alto en el espacio!", animal.tryToFly(), "El animal debe poder volar");
    }

    @Test
    void cambiarNombre() {
        Animal animal = new AnimalPrueba("Prueba", 1.0, 10, "Comida", 5.0, "Sonido");
        animal.setName("NuevoNombre");
        assertEquals("NuevoNombre", animal.getName(), "El nombre debe ser NuevoNombre");
    }
} 