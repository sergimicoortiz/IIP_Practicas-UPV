# Práctica 5. Ejercicio 2

```
Objetivo:
```

En este ejercicio de la práctica 5 vamos a aprender a definir arrays con más de dos dimensiones y Tuplas.

**Actividad 1**

Abre un nuevo fichero para crear la clase pública ArraysM.java. Que se encuentre en el package p5p2;

Esta clase declara en primer lugar el teclado para poder ser usado por todos los métodos que lo requieran. Debe ser global, por tanto, static.

A continuación, por sobrecarga, defina el método Array3D. Método que devuelve un array 3D, con f filas, c columnas, y p de profundidad. Por tanto de dimensión fxcxp. Pero en tres situaciones.

>Situación 1:

Todas las filas, tienen el mismo número de columnas y la misma profundidad, por ejemplo 3x2x5;

```public static int[][][] Array3D(int filas, int col, int prof);```

>Situación 2:

Todas las filas, tienen la mismas columnas, pero cada columna tiene profundidad distinta. Por tanto, el método debe preguntar qué profundidad hay en cada par fila-columna.

```public static int[][][] Array3D(int filas, int col);```

>Situación 3:

Cada fila, tiene columnas y profundidades distintas, para ello. Debe pedir en primer lugar, cuántas columnas tiene cada fila. Y una vez definidas, preguntar por la profundidad de cada par fila-columna.

```public static int[][][] Array3D(int filas);```

*Ejecute el método principal descomentando cada vez uno de los métodos. Recuerde que la clase ArraysM, está en el package p5p2.*

**Actividad2: Tuplas**

Abra un nuevo fichero, y cree la clase pública Edificio. En ella vamos a crear la tupla Edificio. La tupla tendrá tres variables:

```
String calle; 
int num; 
int numVecinos;

````

Además tendrá:

- 3 métodos para obtener el valor de dichas variables: ```getAddress()```, ```getNum()```, ```getNumNeighbors()```, que devolverá la calle, el número de la calle y el número de vecinos respectivamente.
- 3 métodos para dar valor a las variables calle, num, numVecinos, métodos ```adress()```, ```num()```,```numNeighbors()```

*Ejecute el código del main correspondiente a la actividad 2*

Una vez ejecutado, comente de nuevo, el trozo de código de la actividad 2.

Posteriormente crea un array de 3 elementos de la tupla edificio. Añada las instrucciones adecuadas para crear dicho arrays de Tuplas.

Use un bucle for para crearlo según lo especificado en teoría.

Descomente el código final para verificar que ha creado el arrays de la tupla Edifico de forma correcta.
