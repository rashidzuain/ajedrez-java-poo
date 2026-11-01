# Ajedrez en Java (POO)

Ejercicio de repaso de la materia Programación Java (Universidad de Palermo, 2026). Es la base de un ajedrez de consola armada para practicar programación orientada a objetos.

## Qué hace hoy

- Dibuja un tablero de 8 × 8 en la consola, con casilleros de colores alternados (códigos ANSI) y coordenadas.
- Ubica una torre en un casillero y muestra el tablero.
- Intenta ubicar una segunda pieza en el mismo casillero y lo impide con una excepción propia.

Todavía no hay movimientos, turnos ni el resto de las piezas.

## Conceptos de POO que usa

| Concepto | Dónde |
|---|---|
| Interfaz | `ITablero` define qué tiene que saber hacer un tablero |
| Clase abstracta | `TableroAbstracto` y `Pieza` |
| Herencia | `TableroConsola` extiende `TableroAbstracto`; `Torre` extiende `Pieza` |
| Polimorfismo | `Juego` trabaja con `ITablero` y no con la clase concreta |
| Enumerado | `Color` (blanco y negro) |
| Excepción propia | `CasilleroOcupadoException` al ocupar un casillero con pieza |

## Cómo correrlo

Con Java 17 o posterior, desde la carpeta del proyecto:

```bash
javac -d bin src/*.java
java -cp bin Main
```

La consola tiene que mostrar colores ANSI y caracteres Unicode para ver el tablero y la torre.
