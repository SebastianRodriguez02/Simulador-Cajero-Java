# 🏧 Simulador de Cajero Automático (Java)

Este es un proyecto de consola desarrollado en Java puro que simula las operaciones básicas de un cajero automático. 

El objetivo principal de este proyecto fue aplicar buenas prácticas de programación, pasando de un código secuencial y aglomerado a una arquitectura modular utilizando **Métodos**.

## 🚀 Funcionalidades

El simulador permite al usuario interactuar con un menú para:
- Consultar el saldo actual.
- Retirar dinero (incluye validación matemática de fondos suficientes).
- Consignar dinero a la cuenta.
- Visualizar un historial dinámico de los movimientos realizados (usando arreglos).

## 🧠 Conceptos y Tecnologías Aplicadas

- **Java Standard Edition (SE).**
- **Modularidad:** Separación de responsabilidades usando métodos estáticos (`void`, `int`, `boolean`).
- **Paso de parámetros:** Inyección de variables a los métodos para procesar datos sin alterar variables globales innecesariamente.
- **Estructuras de control:** Ciclos `while`, `for`, y condicionales `if-else` y `switch`.
- **Estructuras de datos:** Arreglos unidimensionales (`Arrays`) para almacenar el historial de transacciones.

## 🛠️ Cómo ejecutarlo

1. Clona este repositorio en tu máquina local:
   `git clone https://github.com/SebastianRodriguez02/Simulador-Cajero-Java.git`
2. Abre el proyecto en tu IDE favorito (NetBeans, IntelliJ, Eclipse).
3. Ejecuta el archivo principal `AppCajero.java`.
4. El PIN de acceso por defecto es `1234`.
