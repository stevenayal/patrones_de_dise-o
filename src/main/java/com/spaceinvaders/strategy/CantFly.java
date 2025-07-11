package com.spaceinvaders.strategy;

/**
 * Implementación de Flies para objetos que no pueden volar
 */
public class CantFly implements Flies {
    
    @Override
    public String fly() {
        return "No puedo volar, me muevo por el suelo";
    }
} 