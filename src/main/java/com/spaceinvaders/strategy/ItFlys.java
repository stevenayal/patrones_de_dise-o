package com.spaceinvaders.strategy;

/**
 * Implementación de Flies para objetos que pueden volar
 */
public class ItFlys implements Flies {
    
    @Override
    public String fly() {
        return "¡Puedo volar alto en el espacio!";
    }
} 