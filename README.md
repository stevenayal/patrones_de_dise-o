# Space Invaders - Patrones de Diseño 🚀

¡Hola angiru! Este proyecto implementa el clásico juego Space Invaders utilizando tres patrones de diseño fundamentales: **Strategy**, **Factory** y **Singleton**. ¡Todo en Java y con pruebas unitarias incluidas!

## 📁 Estructura del Proyecto

```
src/main/java/com/spaceinvaders/
├── strategy/
│   ├── Flies.java              # Interfaz para el patrón Strategy
│   ├── ItFlys.java             # Implementación para volar
│   └── CantFly.java            # Implementación para no volar
├── entities/
│   ├── Animal.java             # Clase abstracta que usa Strategy
│   ├── Dog.java                # Subclase que no puede volar
│   └── Bird.java               # Subclase que puede volar
├── factory/
│   ├── EnemyShip.java          # Clase abstracta para naves enemigas
│   ├── UFOEnemyShip.java       # Nave enemiga tipo UFO
│   ├── RocketEnemyShip.java    # Nave enemiga tipo Rocket
│   ├── BigUFOEnemyShip.java    # Nave enemiga tipo Big UFO
│   └── EnemyShipFactory.java   # Factory para crear naves enemigas
├── singleton/
│   └── GameManager.java        # Singleton para gestionar el estado del juego
└── SpaceInvadersGame.java      # Clase principal con demostración
```

## 🎯 Patrones de Diseño Implementados

### 1. Patrón Strategy

**¿Para qué sirve?**: Te permite cambiar el comportamiento de los objetos "al toque" mientras el programa está corriendo.

**¿Qué tenemos acá?**:
- **Interfaz `Flies`**: Define cómo debe comportarse el vuelo
- **Clases `ItFlys` y `CantFly`**: Una para volar y otra para no volar (¡obvio!)
- **Clase `Animal`**: La que usa el comportamiento de vuelo
- **Subclases `Dog` y `Bird`**: Cada una con su estrategia de vuelo

**¿Por qué es bueno?**:
- No necesitás herencia múltiple (que es un lío)
- Podés cambiar el comportamiento "al vuelo"
- Es fácil agregar nuevos comportamientos

### 2. Patrón Factory

**¿Para qué sirve?**: Es como una fábrica que te crea las naves enemigas sin que vos te preocupes de cómo hacerlas.

**¿Qué tenemos acá?**:
- **Clase abstracta `EnemyShip`**: Define cómo debe ser toda nave enemiga
- **Subclases concretas**: `UFOEnemyShip`, `RocketEnemyShip`, `BigUFOEnemyShip` (¡cada una con su onda!)
- **`EnemyShipFactory`**: La fábrica que te crea las naves según lo que necesites

**¿Por qué es bueno?**:
- Te ahorra el lío de crear objetos complicados
- Es fácil agregar nuevos tipos de naves
- Tu código queda más limpio y desacoplado

### 3. Patrón Singleton

**¿Para qué sirve?**: Te asegura que solo haya una "copia" del gestor del juego en toda la aplicación (¡no más líos con múltiples instancias!).

**¿Qué tenemos acá?**:
- **`GameManager`**: La clase que maneja todo el estado del juego
- Constructor privado para que no puedas crear más de una instancia
- Método `getInstance()` para obtener la única instancia que existe

**¿Por qué es bueno?**:
- Tenés control centralizado del estado del juego
- Podés acceder desde cualquier parte de la aplicación
- Te garantiza que los datos del juego sean consistentes

## 🚀 Cómo Ejecutar

### Opción 1: Scripts Automatizados (Recomendado)

**Windows (PowerShell)**:
```powershell
# Compilar y ejecutar
.\compile.ps1

# O usar Maven (si está instalado)
.\compile_maven.ps1

# Limpiar archivos compilados
.\clean.ps1
```

**Linux/Mac**:
```bash
# Compilar y ejecutar
./compile_and_run.sh

# Limpiar archivos compilados
rm -rf bin/
```

### Opción 2: Maven (Recomendado para desarrollo)

```bash
# Compilar
mvn clean compile

# Ejecutar
mvn exec:java

# Crear JAR ejecutable
mvn clean package
java -jar target/space-invaders-patterns-1.0.0.jar
```

### Opción 3: Compilación Manual

```bash
# Compilar
javac -source 11 -target 11 -d bin src/main/java/com/spaceinvaders/**/*.java

# Ejecutar
java -cp bin com.spaceinvaders.SpaceInvadersGame
```

## 📋 Funcionalidades del Juego

### Gestión del Estado (Singleton)
- Control de puntuación (¡para ver quién es el mejor!)
- Gestión de vidas (¡no te quedes sin vidas!)
- Control de niveles (¡cada vez más difícil!)
- Estado del juego (pausado/ejecutándose)

### Comportamiento de Vuelo (Strategy)
- Animales con diferentes capacidades de vuelo (¡algunos vuelan, otros no!)
- Cambio dinámico de comportamiento (¡cambia de estrategia al toque!)
- Extensibilidad para nuevos comportamientos (¡fácil de agregar más!)

### Creación de Enemigos (Factory)
- Creación dinámica de naves enemigas (¡la fábrica no para!)
- Diferentes tipos: UFO, Rocket, Big UFO (¡cada uno con su onda!)
- Cada tipo con características únicas (daño, nombre)

## 🎮 Simulación del Juego

El programa principal (`SpaceInvadersGame.java`) te muestra todo el show:

1. **Inicialización del Singleton**: Verificación de que solo hay una instancia (¡no más líos!)
2. **Uso del Strategy**: Animales con diferentes comportamientos de vuelo (¡algunos vuelan, otros no!)
3. **Uso del Factory**: Creación de diferentes tipos de naves enemigas (¡la fábrica en acción!)
4. **Simulación de combate**: Interacción entre todos los componentes (¡la batalla espacial!)

## 🔧 Extensibilidad

El proyecto está diseñado para que puedas agregar cosas fácilmente:

- **Nuevos comportamientos**: Implementar nuevas estrategias de vuelo (¡más animales voladores!)
- **Nuevos enemigos**: Añadir nuevos tipos de naves al Factory (¡más enemigos para vencer!)
- **Nuevas funcionalidades**: Extender el GameManager con más características (¡más opciones de juego!)

## 📚 Conceptos de Programación Orientada a Objetos

Este proyecto te muestra varios conceptos importantes de POO:

- **Polimorfismo**: Arrays de objetos de la superclase que ejecutan métodos de subclases (¡mágico!)
- **Herencia**: Subclases que extienden clases abstractas (¡como en la vida real!)
- **Composición**: Objetos que contienen otros objetos (Strategy pattern - ¡todo conectado!)
- **Encapsulación**: Ocultación de detalles de implementación (¡no todo se ve!)
- **Abstracción**: Interfaces y clases abstractas (¡pensar en general, no en específico!)

## 🧪 Pruebas Unitarias

¡Angiru! Este proyecto también incluye pruebas unitarias completas para asegurar que todo funcione como debe. Las pruebas están escritas en español para que sea más fácil entenderlas.

### 📁 Estructura de Pruebas

```
src/test/java/com/spaceinvaders/
├── entities/
│   ├── AnimalTest.java           # Pruebas del comportamiento de vuelo
│   ├── PerroTest.java            # Pruebas específicas del perro
│   └── PajaroTest.java           # Pruebas específicas del pájaro
├── factory/
│   └── FabricaNavesTest.java     # Pruebas de la fábrica de naves
└── singleton/
    └── GestorJuegoTest.java      # Pruebas del gestor del juego
```

### 🎯 Cobertura de Pruebas

**Patrón Strategy**:
- ✅ Pruebas de comportamiento de vuelo (puede volar vs no puede volar)
- ✅ Cambio dinámico de estrategia de vuelo
- ✅ Propiedades de animales (perro y pájaro)

**Patrón Factory**:
- ✅ Creación de naves UFO, Rocket y Big UFO
- ✅ Validación de tipos de naves inválidos
- ✅ Verificación de propiedades de cada tipo de nave

**Patrón Singleton**:
- ✅ Verificación de instancia única
- ✅ Gestión de puntaje y vidas
- ✅ Control de niveles del juego

### 🚀 Ejecutar las Pruebas

```bash
# Ejecutar todas las pruebas
mvn test

# Ejecutar pruebas con reporte detallado
mvn test -Dtest=*Test

# Ejecutar una clase de prueba específica
mvn test -Dtest=PerroTest
```

### 📊 Resultados de Pruebas

```
Tests run: 12, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

¡Todas las pruebas pasan! 🎉

## 🎯 Aprendizaje

Este proyecto es ideal para aprender:
- Cómo implementar patrones de diseño en Java (¡sin complicaciones!)
- Cuándo usar cada patrón (¡cada uno tiene su momento!)
- Cómo los patrones se complementan entre sí (¡todo funciona junto!)
- Mejores prácticas de programación orientada a objetos (¡código limpio y mantenible!)
- Cómo escribir pruebas unitarias efectivas (¡código confiable!)

## 🎉 ¡Y Listo!

¡Angiru! Ya tenés todo lo que necesitás para entender y trabajar con patrones de diseño en Java. Este proyecto te muestra cómo implementar Strategy, Factory y Singleton de manera práctica y con pruebas unitarias incluidas.

### 🚀 Próximos Pasos

- **Experimentá**: Modificá el código y agregá nuevas funcionalidades
- **Practicá**: Implementá otros patrones de diseño
- **Compartí**: Usá este proyecto como base para tus propios desarrollos
- **Mejorá**: Agregá más pruebas y funcionalidades

¡Que la fuerza de los patrones de diseño esté con vos! 🚀✨ 