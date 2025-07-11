Write-Host "========================================" -ForegroundColor Green
Write-Host "   SPACE INVADERS - PATRONES DE DISEÑO" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green
Write-Host ""

# Crear directorio bin si no existe
if (!(Test-Path "bin")) {
    New-Item -ItemType Directory -Path "bin"
}

Write-Host "Compilando el proyecto..." -ForegroundColor Yellow

# Compilar todos los archivos Java
try {
    # Compilar en orden de dependencias con Java 11
    javac -source 11 -target 11 -d bin src/main/java/com/spaceinvaders/strategy/Flies.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/strategy/ItFlys.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/strategy/CantFly.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/entities/Animal.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/entities/Dog.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/entities/Bird.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/factory/EnemyShip.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/factory/UFOEnemyShip.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/factory/RocketEnemyShip.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/factory/BigUFOEnemyShip.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/factory/EnemyShipFactory.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/singleton/GameManager.java
    javac -source 11 -target 11 -cp bin -d bin src/main/java/com/spaceinvaders/SpaceInvadersGame.java
    
    Write-Host ""
    Write-Host "Compilación exitosa!" -ForegroundColor Green
    Write-Host ""
    Write-Host "Ejecutando el juego..." -ForegroundColor Yellow
    Write-Host "========================================" -ForegroundColor Green
    
    java -cp bin com.spaceinvaders.SpaceInvadersGame
    
} catch {
    Write-Host ""
    Write-Host "Error en la compilación!" -ForegroundColor Red
    Write-Host "Detalles del error: $($_.Exception.Message)" -ForegroundColor Red
}

Write-Host ""
Write-Host "Presiona Enter para salir..." -ForegroundColor Cyan
Read-Host 