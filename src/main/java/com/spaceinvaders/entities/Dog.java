package com.spaceinvaders.entities;

import com.spaceinvaders.strategy.CantFly;

/**
 * Clase Dog que extiende Animal e inicializa con la estrategia CantFly
 */
public class Dog extends Animal {
    
    public Dog() {
        super();
        // Inicializa con la estrategia de no volar
        flyingType = new CantFly();
    }
    
    public Dog(String name, double height, int weight, String favFood, double speed, String sound) {
        super(name, height, weight, favFood, speed, sound);
        // Inicializa con la estrategia de no volar
        flyingType = new CantFly();
    }
    
    public String getFavoriteFood() {
        return super.getFavoriteFood();
    }
    
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", favFood='" + getFavFood() + '\'' +
                ", speed=" + getSpeed() +
                ", sound='" + getSound() + '\'' +
                '}';
    }
} 