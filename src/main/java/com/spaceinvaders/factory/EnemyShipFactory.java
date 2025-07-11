package com.spaceinvaders.factory;

/**
 * Clase EnemyShipFactory que implementa el patrón Factory
 * para crear diferentes tipos de naves enemigas
 */
public class EnemyShipFactory {
    
    /**
     * Método que crea dinámicamente la nave enemiga correcta según la entrada
     * @param shipType tipo de nave ("U" para UFO, "R" para Rocket, "B" para Big UFO)
     * @return EnemyShip la nave enemiga creada
     */
    public EnemyShip makeEnemyShip(String shipType) {
        EnemyShip theEnemy = null;
        
        if (shipType.equals("U")) {
            return new UFOEnemyShip();
        } else if (shipType.equals("R")) {
            return new RocketEnemyShip();
        } else if (shipType.equals("B")) {
            return new BigUFOEnemyShip();
        } else {
            return null;
        }
    }
} 