#!/bin/bash

echo "========================================"
echo "   SPACE INVADERS - PATRONES DE DISEÑO"
echo "========================================"
echo

echo "Compilando el proyecto..."
mkdir -p bin
javac -d bin src/main/java/com/spaceinvaders/**/*.java

if [ $? -eq 0 ]; then
    echo
    echo "Compilación exitosa!"
    echo
    echo "Ejecutando el juego..."
    echo "========================================"
    java -cp bin com.spaceinvaders.SpaceInvadersGame
else
    echo
    echo "Error en la compilación!"
    echo "Asegúrate de tener Java instalado y configurado."
fi

echo
echo "Presiona Enter para salir..."
read 