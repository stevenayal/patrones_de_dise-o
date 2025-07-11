# Space Invaders - Patrones de Diseño 🚀

Este proyecto implementa el clásico juego Space Invaders utilizando tres patrones de diseño fundamentales: **Strategy**, **Factory** y **Singleton**. Desarrollado en Java con pruebas unitarias incluidas.

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

**Propósito**: Permite cambiar el comportamiento de los objetos dinámicamente durante la ejecución.

**Implementación**:
- **Interfaz `Flies`**: Define el contrato para el comportamiento de vuelo
- **Clases `ItFlys` y `CantFly`**: Implementaciones para volar y no volar
- **Clase `Animal`**: Contexto que utiliza el comportamiento de vuelo
- **Subclases `Dog` y `Bird`**: Cada una con su estrategia específica

**Ventajas**:
- Evita la necesidad de herencia múltiple
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

Este proyecto demuestra varios conceptos importantes de POO:

- **Polimorfismo**: Arrays de objetos de la superclase que ejecutan métodos de subclases
- **Herencia**: Subclases que extienden clases abstractas
- **Composición**: Objetos que contienen otros objetos (Strategy pattern)
- **Encapsulación**: Ocultación de detalles de implementación
- **Abstracción**: Interfaces y clases abstractas

## 🧪 Pruebas Unitarias

Este proyecto incluye pruebas unitarias completas para validar la funcionalidad. Las pruebas están escritas en español para facilitar su comprensión.

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

Todas las pruebas pasan exitosamente.

## 🎯 Aprendizaje

Este proyecto es ideal para aprender:
- Cómo implementar patrones de diseño en Java
- Cuándo usar cada patrón
- Cómo los patrones se complementan entre sí
- Mejores prácticas de programación orientada a objetos
- Cómo escribir pruebas unitarias efectivas

## Conclusión

Este proyecto proporciona una implementación completa de los patrones Strategy, Factory y Singleton en Java, incluyendo pruebas unitarias para validar la funcionalidad.

### Próximos Pasos

- Experimentar con modificaciones al código
- Implementar otros patrones de diseño
- Usar este proyecto como base para desarrollos propios
- Agregar más pruebas y funcionalidades 