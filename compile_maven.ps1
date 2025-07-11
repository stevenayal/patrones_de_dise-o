Write-Host "========================================" -ForegroundColor Green
Write-Host "   SPACE INVADERS - PATRONES DE DISEÑO" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Green
Write-Host ""

Write-Host "Compilando el proyecto con Maven..." -ForegroundColor Yellow

# Verificar si Maven está instalado
try {
    $mavenVersion = mvn -version 2>$null
    if ($LASTEXITCODE -ne 0) {
        throw "Maven no está instalado o no está en el PATH"
    }
    Write-Host "Maven encontrado: $($mavenVersion | Select-Object -First 1)" -ForegroundColor Green
} catch {
    Write-Host "Error: Maven no está instalado. Instalando dependencias manualmente..." -ForegroundColor Yellow
    
    # Crear directorio bin si no existe
    if (!(Test-Path "bin")) {
        New-Item -ItemType Directory -Path "bin"
    }
    
    # Compilar manualmente con Java 11
    try {
        javac -source 11 -target 11 -d bin src/main/java/com/spaceinvaders/**/*.java
        if ($LASTEXITCODE -eq 0) {
            Write-Host "Compilación manual exitosa!" -ForegroundColor Green
        } else {
            throw "Error en la compilación manual"
        }
    } catch {
        Write-Host "Error en la compilación manual: $($_.Exception.Message)" -ForegroundColor Red
        exit 1
    }
}

# Si Maven está disponible, usarlo
if ($mavenVersion) {
    try {
        # Limpiar y compilar con Maven
        mvn clean compile
        if ($LASTEXITCODE -eq 0) {
            Write-Host "Compilación con Maven exitosa!" -ForegroundColor Green
        } else {
            throw "Error en la compilación con Maven"
        }
    } catch {
        Write-Host "Error en la compilación con Maven: $($_.Exception.Message)" -ForegroundColor Red
        exit 1
    }
}

Write-Host ""
Write-Host "Ejecutando el juego..." -ForegroundColor Yellow
Write-Host "========================================" -ForegroundColor Green

    # Ejecutar el juego
    try {
        if ($mavenVersion) {
            # Usar Maven para ejecutar
            mvn exec:java -Dexec.mainClass="com.spaceinvaders.SpaceInvadersGame"
        } else {
            # Ejecutar directamente desde bin
            java -cp bin com.spaceinvaders.SpaceInvadersGame
        }
    } catch {
        Write-Host "Error al ejecutar el juego, intentando ejecutar directamente..." -ForegroundColor Yellow
        try {
            java -cp target/classes com.spaceinvaders.SpaceInvadersGame
        } catch {
            Write-Host "Error al ejecutar el juego: $($_.Exception.Message)" -ForegroundColor Red
        }
    }

Write-Host ""
Write-Host "Presiona Enter para salir..." -ForegroundColor Cyan
Read-Host 