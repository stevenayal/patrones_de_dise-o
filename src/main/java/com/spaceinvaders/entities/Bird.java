package com.spaceinvaders.entities;

import com.spaceinvaders.strategy.ItFlys;

/**
 * Clase Bird que extiende Animal e inicializa con la estrategia ItFlys
 */
public class Bird extends Animal {
    
    public Bird() {
        super();
        // Inicializa con la estrategia de volar
        flyingType = new ItFlys();
    }
    
    public Bird(String name, double height, int weight, String favFood, double speed, String sound) {
        super(name, height, weight, favFood, speed, sound);
        // Inicializa con la estrategia de volar
        flyingType = new ItFlys();
    }
    
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + getName() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", favFood='" + getFavFood() + '\'' +
                ", speed=" + getSpeed() +
                ", sound='" + getSound() + '\'' +
                '}';
    }
} 