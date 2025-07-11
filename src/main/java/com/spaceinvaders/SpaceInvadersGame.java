package com.spaceinvaders;

import com.spaceinvaders.entities.Animal;
import com.spaceinvaders.entities.Bird;
import com.spaceinvaders.entities.Dog;
import com.spaceinvaders.factory.EnemyShip;
import com.spaceinvaders.factory.EnemyShipFactory;
import com.spaceinvaders.singleton.GameManager;
import com.spaceinvaders.strategy.ItFlys;

/**
 * Clase principal del juego Space Invaders que demuestra
 * la implementación de los patrones Strategy, Factory y Singleton
 */
public class SpaceInvadersGame {
    
    public static void main(String[] args) {
        System.out.println("=== SPACE INVADERS GAME ===");
        System.out.println("Demostración de Patrones de Diseño\n");
        
        // ===== PATRÓN SINGLETON =====
        System.out.println("1. PATRÓN SINGLETON - GameManager");
        System.out.println("================================");
        
        GameManager gameManager = GameManager.getInstance();
        gameManager.setPlayerName("Space Warrior");
        gameManager.startGame();
        
        // Verificar que es la misma instancia
        GameManager gameManager2 = GameManager.getInstance();
        System.out.println("¿Son la misma instancia? " + (gameManager == gameManager2));
        System.out.println();
        
        // ===== PATRÓN STRATEGY =====
        System.out.println("2. PATRÓN STRATEGY - Comportamiento de Vuelo");
        System.out.println("===========================================");
        
        Animal sparky = new Dog("Sparky", 0.5, 50, "Dog Food", 15.0, "Woof");
        Animal tweety = new Bird("Tweety", 0.2, 3, "Bird Seed", 20.0, "Tweet");
        
        System.out.println("Perro intentando volar:");
        System.out.println(sparky.tryToFly());
        
        System.out.println("\nPájaro intentando volar:");
        System.out.println(tweety.tryToFly());
        
        // Cambio dinámico de comportamiento
        System.out.println("\nCambiando comportamiento del perro dinámicamente:");
        sparky.setFlyingAbility(new ItFlys());
        System.out.println(sparky.tryToFly());
        System.out.println();
        
        // ===== PATRÓN FACTORY =====
        System.out.println("3. PATRÓN FACTORY - Creación de Naves Enemigas");
        System.out.println("==============================================");
        
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        
        // Crear diferentes tipos de naves usando el Factory
        EnemyShip ufo = shipFactory.makeEnemyShip("U");
        EnemyShip rocket = shipFactory.makeEnemyShip("R");
        EnemyShip bigUfo = shipFactory.makeEnemyShip("B");
        
        // Demostrar el comportamiento de las naves
        System.out.println("=== Nave UFO ===");
        ufo.displayEnemyShip();
        ufo.followHero();
        ufo.shoot();
        
        System.out.println("\n=== Nave Rocket ===");
        rocket.displayEnemyShip();
        rocket.followHero();
        rocket.shoot();
        
        System.out.println("\n=== Nave Big UFO ===");
        bigUfo.displayEnemyShip();
        bigUfo.followHero();
        bigUfo.shoot();
        System.out.println();
        
        // ===== SIMULACIÓN DEL JUEGO =====
        System.out.println("4. SIMULACIÓN DEL JUEGO");
        System.out.println("=======================");
        
        // Simular combate
        System.out.println("¡Iniciando combate espacial!");
        gameManager.addScore(100); // Puntos por destruir naves
        
        // Simular pérdida de vida
        gameManager.loseLife();
        
        // Simular ganar vida extra
        gameManager.gainLife();
        
        // Pasar al siguiente nivel
        gameManager.nextLevel();
        
        // Crear más enemigos para el nuevo nivel
        System.out.println("\nNuevos enemigos aparecen en el nivel " + gameManager.getLevel() + ":");
        EnemyShip[] enemies = new EnemyShip[3];
        enemies[0] = shipFactory.makeEnemyShip("U");
        enemies[1] = shipFactory.makeEnemyShip("R");
        enemies[2] = shipFactory.makeEnemyShip("B");
        
        for (EnemyShip enemy : enemies) {
            enemy.displayEnemyShip();
            enemy.shoot();
        }
        
        gameManager.addScore(300);
        
        // Estado final del juego
        System.out.println("\n=== ESTADO FINAL DEL JUEGO ===");
        System.out.println(gameManager);
        
        System.out.println("\n¡Demostración completada!");
    }
} 