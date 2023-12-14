# Práctica 4. Ejercicio 1: 

**Métodos**
```
Objetivos:
```

En esta primera práctica el alumno adquiere conocimientos:

- Implementar un nuevo método para ser llamado por el método principal (```main()```) o por otro método.

- Declarar su cabezera y su cuerpo.

- Definir sus parámetros de entrada.

-	Devolver (```return```) su parámetro de salida.

- Llamada a un método desde otro método, como por ejemplo el método main

- Entender el concepto de métodos sobrecargados

```
Programa a realizar:
```
Consta de 6 métodos: 


**Método 1:**

Programe un método que reciba como parámetro de entrada un String y devuelve un entero. El método recibe un texto con el fin de solicitar un número entero por teclado. Leerá el número y lo devolverá.

Con la cabecera:
```
public static int readInt(String ask)
```

>p.ej.  Supongamos ask es " Introduce un número entero ". El método preguntará "Introduce un número entero:". Observa el método elimina los espacios en blanco del principio y del final y ha añadido dos puntos. Importante: Si en la pregunta ya están los dos puntos no deberá añadirlos.
En definitiva estamos programando el método de Java nextInt(), pero con la diferencia que lleva integrada la pregunta a hacer.

**Métodos 2 y 3:**

Igual al método uno, pero solicita un número real, del tipo double y un String.

```
public static double readDouble(String ask) Método 2
```
```
public static String readString(String ask) Método 3
```


**Importante: Tras leer por teclado un dato del tipo numérico es necesario vaciar el buffer del teclado. Ya que el carácter salto de línea se queda en el buffer y los métodos nexInt(), nextDouble(), nextFloat(), etc, consideran número todo lo que hay antes del código de salto de línea. Para vaciar el buffer use tras leer el número el método nextLine(), ya que este leerá el salto de línea vaciando el buffer.** 
    
      p.ej.
          int p=kyb.nextInt();
          kyb.nexLine(); //No se almacena lo leído en ninguna variable


Por tanto, el buffer del teclado ahora está vacío, en *p* ha quedado el número y ```nextline()``` ha leído el código de salto de línea (observa queno hace falta almacenar esa información en ninguna variable)

**Métodos 4,5 y 6:**

Aplicando sobrecarga implemente tres métodos con el mismo nombre (```show()```). Los tres no devuelven nada (```void```) y los tres tienen dos parámetros de entrada, el primero es común a los tres y es un ```String```, y el segundo es diferente, para el método 4, es un entero ```int```, para el método 5, es un número real ```double``` y para el 6 es un ```String```.

Los métodos 4,5,6 imprimen la cadena de texto introducida como parámetro 1 seguido del valor introducido en el parámetro 2.

    Ejemplo:

      show("El número es", 5)
      El númeroe es: 5

