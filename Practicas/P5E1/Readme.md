# Práctica 5. Ejercicio 1: Arrays

```
Objetivos:
```

Se pretende que el alumno aprenda a construir estructuras multidimensionales de datos o de objetos.
Existen muchas estructuras en Java que irás aprendiendo a mediada vayas avanzando en este maravilloso mundo. Empecemos por la más sencilla los ```arrays```.

```
Desarrollo de la Práctica:
```

**Actividad 1**

Pasos:

1. Cree una nueva clase con el nombre ```MyArrays1``` (donde iremos creando los métodos de esta práctica). Para ello, en la ventana de ficheros (Files) pulse sobre el primer icono +. Al pulsar nos permite **add file**. Nómbrela MyArrays1.java.
2. En ese fichero cree una clase pública (ya debe saber que nombre debe tener).
3. Cree, aplicando sobrecarga, un método público, llamado ```printVector()```, que imprima un vector de los siguientes tipos de datos (int, long, float, double, String, char). El método debe imprimir en este formato. Por ejemplo si v={1,2,3} por consola se mostrará [1, 2, 3]. Es decir, además de incluir los corchete, los datos deben estar separados por un coma más un espacio en blanco.
4. Cree, aplicando sobrecarga, métodos que impriman un array bidimensional, ```printMatrix()```. Este método llamará a ```printVector()```, para imprimir cada fila de la matriz como un vector.
5. Vaya a la clase Main. Cambia el vector de String para que los datos sean su nombre y sus apellidos y proceda a realizar la llamada a los métodos para imprimir los arrays que aparecen.

**Actividad 2**

Pasos:

1. Cree una nueva clase llamada MyArrays2. Debe estar en el *package* *myarrays2*. Cree por tanto la correspondiente carpeta y coloque en el código de esa clase la línea de código adecuada para indicar está en ese *package*.

2. En ese fichero cree la clase pública con el nombre adecuado. Y dentro de ello cree los siguientes métodos:

```
sumElemntsOfArray()

```

>Que reciba un vector y devuelva la suma de los elementos. Programe usando bucles. Aplique sobrecarga para que pueda aplicarse a los tipos numéricos (int, long, float, double).

```
sumElementsOfArrayRec()
```

>Que reciba un vector y devuelva la suma de los elementos. Programe usando recursividad. Aplique sobrecarga pque pueda aplicarse a los tipos numéricos (int, long, float, double)

```
 foundElement()
```

 >Que recibe un vector y un valor y devuelve la posición (índice) donde se aloja dicho valor. Mostrará el índice de la primera aparición. Si no se encuentra retornará -1. Aplique sobrecarga para poder aplicar a los arrays mostrados en la actividad 1 del método main. Programe usando bucles. Añada también, aplicando sobrecarga, para que este método pueda tener dos parámetros de entrada. Este segundo es un valor entero para que realice la búsqueda a partir de ese valor hacia el final del array.

```
foundElementR()
```

>Realice lo mismo que ```foundElement()``` pero de manera recursiva.

```
foundElement2D()
```

>Recibe una estructura bidemensional y un valor y devuelve un vector de dos dimensiones, donde el primer elemento es la fila y el segundo la columna donde se encuentra el valor. Suponga que el valor seguro que esta. Haga el método para sólo el tipo de dato entero.

3. Vaya a la clase Main y en la parte actividad 2 realice la llamada a todos los métodos implementados, mostrando en consola el resultado. Puede crear nuevos arrays o usar los arrays de la actividad 1.
