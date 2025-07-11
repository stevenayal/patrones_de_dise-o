package com.spaceinvaders.entities;

import com.spaceinvaders.strategy.Flies;

/**
 * Clase Animal que utiliza el patrón Strategy para el comportamiento de vuelo
 */
public abstract class Animal {
    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;
    
    // Variable de instancia para el patrón Strategy
    public Flies flyingType;
    
    public Animal() {}
    
    public Animal(String name, double height, int weight, String favFood, double speed, String sound) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.favFood = favFood;
        this.speed = speed;
        this.sound = sound;
    }
    
    /**
     * Método que intenta volar usando el patrón Strategy
     * @return String con el resultado del intento de vuelo
     */
    public String tryToFly() {
        return flyingType.fly();
    }
    
    /**
     * Método para cambiar dinámicamente la capacidad de vuelo
     * @param newFlyType nueva implementación de Flies
     */
    public void setFlyingAbility(Flies newFlyType) {
        this.flyingType = newFlyType;
    }
    
    // Getters y Setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public String getFavFood() {
        return favFood;
    }
    
    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    public String getSound() {
        return sound;
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
} 