@echo off
echo ========================================
echo    SPACE INVADERS - PATRONES DE DISEÑO
echo ========================================
echo.

echo Compilando el proyecto...
if not exist "bin" mkdir bin
javac -d bin src/main/java/com/spaceinvaders/**/*.java

if %ERRORLEVEL% EQU 0 (
    echo.
    echo Compilación exitosa!
    echo.
    echo Ejecutando el juego...
    echo ========================================
    java -cp bin com.spaceinvaders.SpaceInvadersGame
) else (
    echo.
    echo Error en la compilación!
    echo Asegúrate de tener Java instalado y configurado.
)

echo.
echo Presiona cualquier tecla para salir...
pause >nul 