# Práctica 3. Ejercicio 3

**Programa a implementar**

El progrma debe mostra  el siguiente menú de operaciones.


1.	Calcular e^x
2.	Calcular cos(x).
3.	Calcular sen(x).
4.	Salir


A continuación, pide seleccionar una opción pulsando 1,2,3 y 4. El programa debe controlar el hecho de introducir un valor erróneo. En ese caso, volverá a mostrar el menú y pedir que se introduzca un valor entre 1 y 4.


Si el valor introducido es 1, 2 ó 3 pedirá el valor de x. Realizará el cálculo de la función indicada y volverá a mostrar el menú.
Si el valor introducido es 4, cerrará el teclado y finalizará la ejecución del programa.

Para el calculo de las funciones e^x, cos(x) y sen(x). Usaremos el Desarrollo de MacLaurin

•	Desarrollo de MacLaurin de la exponencial

(abrir img1.png)

•	Desarrollo de MacLaurin del coseno(x) en radianes

(abrir img2.png)
 
•	Desarrollo de MacLaurin del seno(x) en radianes.

(abrir img3.png)
 
El resultado ha de probarse para cualquier número real, positivo o negativo. Para ello añada esta línea de código, según el caso, para evaluar que el resultado es correcto.


*Verificamos el resultado comparando con el método ya programado en JAVA ```Math.exp()```*

```
System.out.println("\t e^x = " + ex + "---> e^x =" + Math.exp(x));
```


*Verificamos el resultado comparando con el método ya programado en JAVA ```Math.cos()```*

```
System.out.println("\tcos(x) = " + cosx + " ---> cos(x) =" + Math.cos(x));
```

*Verificamos el resultado comparando con el método ya programado en JAVA ```Math.sin()```*

```
System.out.println("\tsen(x) = " + senx + " ---> sen(x) =" + Math.sin(x));
```

**IMPORTANTE:**

Para el cálculo del coseno y del seno. El programa ha de funcionar si la x introducida por teclado es mayor que 2π. Por tanto, en el caso que sea mayor en módulo de 2π quite las vueltas necesarias para que el valor de la x en la serie sea un número en módulo menor que 2π.

