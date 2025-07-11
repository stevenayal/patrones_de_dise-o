package com.spaceinvaders.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GestorJuegoTest {
    @Test
    void instanciaSingleton() {
        GameManager gestor1 = GameManager.getInstance();
        GameManager gestor2 = GameManager.getInstance();
        assertSame(gestor1, gestor2, "Ambas instancias deben ser la misma (singleton)");
    }

    @Test
    void puntajeYVidas() {
        GameManager gestor = GameManager.getInstance();
        gestor.setPlayerName("Prueba");
        gestor.startGame();
        gestor.addScore(100);
        assertEquals(100, gestor.getScore(), "El puntaje debe ser 100");
        gestor.loseLife();
        assertEquals(2, gestor.getLives(), "Las vidas deben ser 2");
        gestor.gainLife();
        assertEquals(3, gestor.getLives(), "Las vidas deben ser 3");
    }

    @Test
    void nivel() {
        GameManager gestor = GameManager.getInstance();
        gestor.startGame();
        gestor.nextLevel();
        assertEquals(2, gestor.getLevel(), "El nivel debe ser 2");
    }
} 