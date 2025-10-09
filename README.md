# Ejercicio 7 - Menú de Hamburguesas (Java)

Este proyecto es una aplicación de consola escrita en Java que simula la gestión de un menú de hamburguesas. Permite realizar pedidos, consultar información, buscar hamburguesas por ingredientes, reducir el stock y calcular el promedio de hamburguesas por comensal. Está pensado como ejercicio académico para practicar arrays, condicionales y estructuras de control.

## Codigo fuente

https://github.com/Kl4rkx/MenuDeHamburguesas_Java/blob/main/ejercicio7/src/ejercicio7/ejer7.java

## Características

- **Pedido de hamburguesas:** El usuario puede seleccionar el tipo de hamburguesa y las unidades que desea pedir.
- **Mostrar hamburguesa más barata:** Visualiza el nombre y el precio de la hamburguesa más económica.
- **Información de hamburguesas:** Muestra ingredientes y stock disponible de una hamburguesa específica.
- **Buscar por ingrediente:** Permite consultar qué hamburguesas contienen un ingrediente concreto.
- **Disminuir stock:** Reduce el stock disponible de la hamburguesa tras una compra.
- **Media de hamburguesas por persona:** Calcula cuántas hamburguesas podría comer cada comensal según el stock.
- **Menú interactivo:** La aplicación funciona con un menú de opciones hasta que el usuario decide salir.

## Cómo ejecutar

1. Clona el repositorio o copia el archivo `ejer7.java` en tu entorno Java preferido, dentro de una carpeta con el paquete `ejercicio7`.
2. Compila el archivo:

    ```sh
    javac ejercicio7/src/ejercicio7/ejer7.java
    ```

3. Ejecuta el programa:

    ```sh
    java ejercicio7/src/ejercicio7/ejer7.java
    ```

## Menú de opciones

Al iniciar el programa verás el siguiente menú:
```sh
---------------------------------------
Selecciona una opción: (Ej: 1)
1.PEDIDO
2.LA HAMBURGUESA MAS BARATA
3.INFORMACION HAMBURGUESA
4.BUSCAR INGREDIENTES
5.DISMINUIR STOCK
6.HAMBURGUESAS POR PERSONA
7.SALIR
---------------------------------------
```
## Ejemplo de uso

Para consultar las hamburguesas con "bacon", elige la opción 4 y escribe "bacon" cuando el sistema lo solicite.

## Requisitos

- Java 8 o superior.
- Terminal compatible con ejecución de programas en Java.

## Notas

- El stock y los precios están definidos en el código y no se guardan entre ejecuciones.
- El menú se repite hasta que el usuario seleccione la opción "SALIR".
- Proyecto pensado para aprendizaje. Puedes modificarlo y mejorarlo.


---

