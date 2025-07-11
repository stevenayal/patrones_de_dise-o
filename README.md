# Space Invaders - Patrones de Diseño

Este proyecto implementa el clásico juego Space Invaders utilizando tres patrones de diseño fundamentales: **Strategy**, **Factory** y **Singleton**.

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

**Propósito**: Permite cambiar dinámicamente el comportamiento de los objetos en tiempo de ejecución.

**Implementación**:
- **Interfaz `Flies`**: Define el contrato para el comportamiento de vuelo
- **Clases `ItFlys` y `CantFly`**: Implementaciones concretas del comportamiento
- **Clase `Animal`**: Contexto que usa el comportamiento de vuelo
- **Subclases `Dog` y `Bird`**: Inicializan con diferentes estrategias

**Ventajas**:
- Elimina la necesidad de herencia múltiple
- Permite cambiar comportamiento en tiempo de ejecución
- Facilita la adición de nuevos comportamientos

### 2. Patrón Factory

**Propósito**: Encapsula la lógica de creación de objetos, facilitando la creación de diferentes tipos de naves enemigas.

**Implementación**:
- **Clase abstracta `EnemyShip`**: Define la interfaz común para todas las naves
- **Subclases concretas**: `UFOEnemyShip`, `RocketEnemyShip`, `BigUFOEnemyShip`
- **`EnemyShipFactory`**: Centraliza la creación de naves enemigas

**Ventajas**:
- Encapsula la lógica de creación
- Facilita la adición de nuevos tipos de naves
- Reduce el acoplamiento en el código cliente

### 3. Patrón Singleton

**Propósito**: Garantiza que solo exista una instancia del gestor del juego en toda la aplicación.

**Implementación**:
- **`GameManager`**: Clase singleton que gestiona el estado global del juego
- Constructor privado para evitar instanciación directa
- Método `getInstance()` para obtener la instancia única

**Ventajas**:
- Control centralizado del estado del juego
- Acceso global desde cualquier parte de la aplicación
- Garantiza consistencia en los datos del juego

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
- Control de puntuación
- Gestión de vidas
- Control de niveles
- Estado del juego (pausado/ejecutándose)

### Comportamiento de Vuelo (Strategy)
- Animales con diferentes capacidades de vuelo
- Cambio dinámico de comportamiento
- Extensibilidad para nuevos comportamientos

### Creación de Enemigos (Factory)
- Creación dinámica de naves enemigas
- Diferentes tipos: UFO, Rocket, Big UFO
- Cada tipo con características únicas (daño, nombre)

## 🎮 Simulación del Juego

El programa principal (`SpaceInvadersGame.java`) demuestra:

1. **Inicialización del Singleton**: Verificación de instancia única
2. **Uso del Strategy**: Animales con diferentes comportamientos de vuelo
3. **Uso del Factory**: Creación de diferentes tipos de naves enemigas
4. **Simulación de combate**: Interacción entre todos los componentes

## 🔧 Extensibilidad

El proyecto está diseñado para ser fácilmente extensible:

- **Nuevos comportamientos**: Implementar nuevas estrategias de vuelo
- **Nuevos enemigos**: Añadir nuevos tipos de naves al Factory
- **Nuevas funcionalidades**: Extender el GameManager con más características

## 📚 Conceptos de Programación Orientada a Objetos

Este proyecto demuestra varios conceptos importantes:

- **Polimorfismo**: Arrays de objetos de la superclase que ejecutan métodos de subclases
- **Herencia**: Subclases que extienden clases abstractas
- **Composición**: Objetos que contienen otros objetos (Strategy pattern)
- **Encapsulación**: Ocultación de detalles de implementación
- **Abstracción**: Interfaces y clases abstractas

## 🎯 Aprendizaje

Este proyecto es ideal para aprender:
- Cómo implementar patrones de diseño en Java
- Cuándo usar cada patrón
- Cómo los patrones se complementan entre sí
- Mejores prácticas de programación orientada a objetos 