package com.spaceinvaders.singleton;

/**
 * Clase GameManager que implementa el patrón Singleton
 * para gestionar el estado global del juego Space Invaders
 */
public class GameManager {
    // Instancia única del Singleton
    private static GameManager instance;
    
    // Variables de estado del juego
    private int score;
    private int level;
    private int lives;
    private boolean gameRunning;
    private String playerName;
    
    // Constructor privado para evitar instanciación directa
    private GameManager() {
        this.score = 0;
        this.level = 1;
        this.lives = 3;
        this.gameRunning = false;
        this.playerName = "Player";
    }
    
    /**
     * Método para obtener la instancia única del GameManager
     * @return GameManager la instancia única
     */
    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }
    
    /**
     * Inicia el juego
     */
    public void startGame() {
        this.gameRunning = true;
        System.out.println("¡Juego iniciado! Nivel: " + level + ", Vidas: " + lives);
    }
    
    /**
     * Pausa el juego
     */
    public void pauseGame() {
        this.gameRunning = false;
        System.out.println("Juego pausado");
    }
    
    /**
     * Termina el juego
     */
    public void endGame() {
        this.gameRunning = false;
        System.out.println("Juego terminado. Puntuación final: " + score);
    }
    
    /**
     * Aumenta la puntuación
     * @param points puntos a añadir
     */
    public void addScore(int points) {
        this.score += points;
        System.out.println("Puntuación actual: " + score);
    }
    
    /**
     * Pasa al siguiente nivel
     */
    public void nextLevel() {
        this.level++;
        System.out.println("¡Nivel " + level + " alcanzado!");
    }
    
    /**
     * Pierde una vida
     */
    public void loseLife() {
        this.lives--;
        if (lives <= 0) {
            endGame();
        } else {
            System.out.println("Vidas restantes: " + lives);
        }
    }
    
    /**
     * Gana una vida extra
     */
    public void gainLife() {
        this.lives++;
        System.out.println("¡Vida extra! Vidas totales: " + lives);
    }
    
    // Getters y Setters
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public int getLives() {
        return lives;
    }
    
    public void setLives(int lives) {
        this.lives = lives;
    }
    
    public boolean isGameRunning() {
        return gameRunning;
    }
    
    public void setGameRunning(boolean gameRunning) {
        this.gameRunning = gameRunning;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    @Override
    public String toString() {
        return "GameManager{" +
                "score=" + score +
                ", level=" + level +
                ", lives=" + lives +
                ", gameRunning=" + gameRunning +
                ", playerName='" + playerName + '\'' +
                '}';
    }
} 