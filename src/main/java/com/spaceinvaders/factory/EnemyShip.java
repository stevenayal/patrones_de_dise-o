package com.spaceinvaders.factory;

/**
 * Clase abstracta EnemyShip que define las propiedades y métodos comunes
 * para todas las naves enemigas en el juego Space Invaders
 */
public abstract class EnemyShip {
    private String name;
    private double amtDamage;
    
    public EnemyShip() {}
    
    public EnemyShip(String name, double amtDamage) {
        this.name = name;
        this.amtDamage = amtDamage;
    }
    
    /**
     * Método para seguir al héroe
     */
    public void followHero() {
        System.out.println(getName() + " está siguiendo al héroe");
    }
    
    /**
     * Método para mostrar la nave enemiga
     */
    public void displayEnemyShip() {
        System.out.println(getName() + " está en pantalla");
    }
    
    /**
     * Método para disparar
     */
    public void shoot() {
        System.out.println(getName() + " ataca y hace " + getAmtDamage() + " de daño");
    }
    
    // Getters y Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getAmtDamage() {
        return amtDamage;
    }
    
    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }
} 