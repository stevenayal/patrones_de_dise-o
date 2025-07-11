package com.spaceinvaders.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FabricaNavesTest {
    @Test
    void crearNaveUFO() {
        EnemyShipFactory fabrica = new EnemyShipFactory();
        EnemyShip nave = fabrica.makeEnemyShip("U");
        assertNotNull(nave, "La nave no debe ser nula");
        assertEquals("UFO Enemy Ship", nave.getName(), "El nombre debe ser UFO Enemy Ship");
        assertEquals(20.0, nave.getDamage(), 0.0001, "El daño debe ser 20.0");
    }

    @Test
    void crearNaveRocket() {
        EnemyShipFactory fabrica = new EnemyShipFactory();
        EnemyShip nave = fabrica.makeEnemyShip("R");
        assertNotNull(nave, "La nave no debe ser nula");
        assertEquals("Rocket Enemy Ship", nave.getName(), "El nombre debe ser Rocket Enemy Ship");
        assertEquals(10.0, nave.getDamage(), 0.0001, "El daño debe ser 10.0");
    }

    @Test
    void crearNaveBigUFO() {
        EnemyShipFactory fabrica = new EnemyShipFactory();
        EnemyShip nave = fabrica.makeEnemyShip("B");
        assertNotNull(nave, "La nave no debe ser nula");
        assertEquals("Big UFO Enemy Ship", nave.getName(), "El nombre debe ser Big UFO Enemy Ship");
        assertEquals(40.0, nave.getDamage(), 0.0001, "El daño debe ser 40.0");
    }

    @Test
    void crearNaveInvalida() {
        EnemyShipFactory fabrica = new EnemyShipFactory();
        EnemyShip nave = fabrica.makeEnemyShip("X");
        assertNull(nave, "La nave debe ser nula para un tipo inválido");
    }
} 