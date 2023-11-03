package Practicas.P1E1;
/* ENUNCIADO PRaCTICA 1: Ejercicio 1
--------------------------------------------
Algunos datos del tipo primitivo han sido implementados
en java como una clase. Conocida como clase envolvente.

Así pues, tenemos:

(dato primitivo)  ---> (su clase envolvente) (wrapper class)
  byte 	               	Byte
  short                	Short
  int                   Integer
  long                  Long
  float                	Float
  double                Double
  char                  Character
  boolean              	No tiene

La creación de esta clase envolvente nos permite disponer de código adicional para realizar operaciones con este tipo de datos. Estas operaciones son métodos implementados para cada clase, así como constantes que nos permiten disponer de mas capacidades la hora de programar.
La practica consiste en conocer las constantes y métodos de interés a usar en cada tipo de dato. Así como las operaciones, conversiones de tipo , etc. sobre los datos primitivos o su equivalente clase envolvente.
*/

//Puedes ir comentando y descomentando las partes con el fin de centrar la ejecución en cada parte. Solo debes borrar ente parte las líneas indicadas.

public class Main {
  public static void main(String args[]) {

    System.out.println("Parte 1: ");
    System.out.println("-----------BYTE-----------");
    // Evaluando las constantes SIZE, MAX_VALUE, MIN_VALUES;
    // Ejemplo para la clase Byte
    System.out.println(Byte.SIZE);
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);

    // Realiza lo mismo para el resto de clases envolventes.
    // Añade aquí el código que falta
    System.out.println("----------SHORT------------");
    System.out.println(Short.SIZE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Short.MIN_VALUE);

    System.out.println("----------INT------------");
    System.out.println(Integer.SIZE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);

    System.out.println("----------LONG------------");
    System.out.println(Long.SIZE);
    System.out.println(Long.MAX_VALUE);
    System.out.println(Long.MIN_VALUE);

    System.out.println("----------FLOAT------------");
    System.out.println(Float.SIZE);
    System.out.println(Float.MAX_VALUE);
    System.out.println(Float.MIN_VALUE);

    System.out.println("----------DOUBLE------------");
    System.out.println(Double.SIZE);
    System.out.println(Double.MAX_VALUE);
    System.out.println(Double.MIN_VALUE);

    System.out.println("----------CHAR------------");
    System.out.println(Character.SIZE);
    // System.out.println(Character.MAX_VALUE);
    // System.out.println(Character.MIN_VALUE);

    // ¿Qué valor esta proporcionando cada uno de ellos?
    // Nos proporcionan el valor maximo, el minimo y su tamaño en bits

    System.out.println("Parte 2: ");
    System.out.println("----------------------");
    // Vamos a dar formato a la salida para nombrar adecuadamente las constantes
    // usadas.
    // Ejemplo para la clase Byte.
    System.out.println("Un byte ocupa en memoria " + Byte.SIZE + " bits");
    System.out.println("Un short ocupa en memoria " + Short.SIZE + " bits");
    System.out.println("Un int ocupa en memoria " + Integer.SIZE + " bits");
    System.out.println("Un long ocupa en memoria " + Long.SIZE + " bits");
    System.out.println("Un float ocupa en memoria " + Float.SIZE + " bits");
    System.out.println("Un double ocupa en memoria " + Double.SIZE + " bits");
    System.out.println("Un char ocupa en memoria " + Character.SIZE + " bits");
    System.out.println("----------------------");
    System.out.println("Un byte tiene como valor maximo de: " + Byte.MAX_VALUE);
    System.out.println("Un short tiene como valor maximo de: " + Short.MAX_VALUE);
    System.out.println("Un int tiene como valor maximo de: " + Integer.MAX_VALUE);
    System.out.println("Un long tiene como valor maximo de: " + Long.MAX_VALUE);
    System.out.println("Un float tiene como valor maximo de: " + Float.MAX_VALUE);
    System.out.println("Un double tiene como valor maximo de: " + Double.MAX_VALUE);
    System.out.println("----------------------");
    System.out.println("Un byte tiene como valor minimo de: " + Byte.MIN_VALUE);
    System.out.println("Un short tiene como valor minimo de: " + Short.MIN_VALUE);
    System.out.println("Un int tiene como valor minimo de: " + Integer.MIN_VALUE);
    System.out.println("Un long tiene como valor minimo de: " + Long.MIN_VALUE);
    System.out.println("Un float tiene como valor minimo de: " + Float.MIN_VALUE);
    System.out.println("Un double tiene como valor minimo de: " + Double.MIN_VALUE);

    // Parte 3:
    System.out.println("Parte 3: ");
    System.out.println("----------------------");
    // Operando con los números del tipo entero.

    // Asígnale a la variable byte valorByte su valor maximo

    // Añade el código que imprime el valor al incremetar 1 dicha variable usando el
    // operador ++. Cuidado, primero incrementar y luego imprimir.

    // ¿Qué valor has obtenido. ¿Por qué?
    byte valorByte = Byte.MAX_VALUE; // Volvemos a su valor original
    // imprime valorByte+1;

    System.out.println(valorByte + 1);

    // ¿Por qué el resultado no es el mismo?

    // Si sumamos un integer con un byte el resultado es un integer pero si
    // usamos ++ el resultado sigue siendo byte por lo tanto no puede superar su
    // valor maximo

    // Ejecuta el código descomentando la siguiente línea de código
    // byte vB=valorByte+1;
    // Vuelve a ejecutar comentando la línea anterior y descomentando la siguiente

    // ¿Por qué una da error y la otra no? ¿Entiendes ahora porqué el resultado es
    // distinto al usar la orden de incremento frente a la de sumar 1.

    // Da error porque al estar sumando un int el resultado es un int.

    // Si quieres incrementar la variable en 3 manteniendo el tipo de dato inicial
    // debes usar +=. Prueba..
    valorByte = 126;
    // Añade aquí la instrucción con +=
    valorByte += 3;
    System.out.println(valorByte);
    // Comparamos
    valorByte = 126;
    System.out.println(valorByte + 3);

    // Parte 4:
    System.out.println("Parte 4: ");
    System.out.println("----------------------");

    // Sabemos que el signo + provoca si los datos son numéricos la suma de ambos,
    // pero si los datos son del tipo String concatena ambas cadenas.

    // Crea una varible del tipo int llamada x con valor 12;
    int x = 12;
    // Crea una variable del tipo int llamada y con valor 13;
    int y = 13;
    // Imprime la suma

    System.out.println(x + y);

    // Crea una variable del tipo String llamada str1 de valor "13";
    String str1 = "13";
    // Imprime x+str
    System.out.println(x + str1);
    // ¿Por qué se obtiene 1213 en vez de dar un error? ¿Qué sucede pues?
    // Lo que ocurre es que java transforma x en un string para poder concatenarlo
    // con otro string (str1).
    // De las siguientes instrucciones comentadas, descomenta las que son correctas,
    // e indica el error que se dara en las incorrectas.

    byte b1, b2, b3;
    short s1, s2, s3;
    int n1, n2, n3;
    long l1, l2, l3;
    float f1, f2, f3;
    double d1, d2, d3;

    // Comenta y descomenta de una en una para verificar tu respuesta.

    // b1=1; b2=5; b3=b2+b3; System.out.println("El valor de b3 es: "+b3);
    // Da error porque al sumar un int el resultado es un integer por lo que
    // no concuerda con el tipo de dato de b3 (byte).

    // s1=1; s2=5; s3=s1+s2; System.out.println("El valor de s3 es: "+s3);
    // Da error porque al sumar un int el resultado es un integer por lo que
    // no concuerda con el tipo de dato de s3 (short).

    n1 = 1;
    n2 = 5;
    n3 = n1 + n2;
    System.out.println("El valor de n3 es: " + n3);
    // n1=1L;
    // Da error porque 1L es un long pero n1 es un int.

    l1 = 1L;
    l2 = 5L;
    l3 = l1 + l2;
    System.out.println("El valor de l3 es: " + l3);
    l1 = 100;

    f1 = 5.3f;
    f2 = 4.6F;
    f3 = f2 + f1;
    System.out.println("El valor de f3 es: " + f3);
    // f1=5.4;
    // Da error porque 5.4 es de tipo double y lo queremos asignar a una variable de
    // tipo float(tipo de dato más pequeño que double) para que no diera error
    // deberia de ser 5.4f

    f1 = 5.4f;
    f2 = 4.6f;
    d3 = f1 + f2;
    System.out.println("El valor de d3 es: " + d3);
    d1 = 5.8f;
    d1 = 5.8;
    d2 = 3.45;
    d3 = d1 + d2;
    System.out.println("El valor de d3 es: " + d3);

    // Sustituye el (*) por (b3 o s3 o n3 o l3 o f3 o d3). Criterio el tipo de dato
    // de menor memoria da validez a la asignación. Descomenta previamente.

    b1 = 5;
    l3 = b1 + 1L;
    System.out.println("Debe ser del tipo long");
    d1 = 4.6;
    d3 = 2.4F / d1 + 3L;
    System.out.println("Debe ser del tipo double");

    // Parte 5:
    System.out.println("Parte 5: ");
    System.out.println("----------------------");

    // Observa el resultado de estas operaciones:
    float f4 = 5f / 0.0f;
    System.out.println(f4);
    float f5 = -5f / 0.0F;
    System.out.println(f5);
    float f6 = 0.0f / 0.0f;
    System.out.println(f6);
    float f7 = Float.MAX_VALUE * 10;
    System.out.println(f7);
    System.out.println("----------------------");
    // ¿Hay desbordamiento?¿La ejecución del programa se ha parado?

    // El programa se ha ejecutado sin problema.

    // Procede de la misma forma con datos del tipo double. Añade las líneas de
    // código
    // para crear d4,d5,d6 y d7 del tipo double.

    double d4 = 5.0 / 0.0;
    System.out.println(d4);
    double d5 = -5.0 / 0.0;
    System.out.println(d5);
    double d6 = 0.0 / 0.0;
    System.out.println(d6);
    double d7 = Double.MAX_VALUE * 10;
    System.out.println(d7);
    System.out.println("----------------------");
    // Métodos de las clases envolventes Float y Double para gestionar estos
    // valores. Analiza el valor que devuelve. Y piensa su futura utilidad //

    System.out.println(Float.isNaN(f6));
    System.out.println(Float.isFinite(f6));
    System.out.println(Float.isInfinite(f6));

    // Haz los mismo para f4, f5 y f7. Añade las líneas de código aquí.
    System.out.println("----------------------");
    System.out.println(Float.isNaN(f4));
    System.out.println(Float.isFinite(f4));
    System.out.println(Float.isInfinite(f4));
    System.out.println("----------------------");
    System.out.println(Float.isNaN(f5));
    System.out.println(Float.isFinite(f5));
    System.out.println(Float.isInfinite(f5));
    System.out.println("----------------------");
    System.out.println(Float.isNaN(f7));
    System.out.println(Float.isFinite(f7));
    System.out.println(Float.isInfinite(f7));
    System.out.println("----------------------");

    // Si ademas queremos saber si es +Infinito o -Infinito qué podemos hacer. La
    // clase envolvente también nos los facilita en ese caso comparamos con la
    // constante Float.NEGATIVE_INFINITY

    System.out.println(f5 == Float.NEGATIVE_INFINITY);

    // Cómo evaluarías sí d4, d5 d6 y d7 son +infinite. Añade a continuación el
    // código.
    System.out.println("----------------------");
    System.out.println(d4 == Double.POSITIVE_INFINITY);
    System.out.println(d5 == Double.POSITIVE_INFINITY);
    System.out.println(d6 == Double.POSITIVE_INFINITY);
    System.out.println(d7 == Double.POSITIVE_INFINITY);

    // Parte 6:
    System.out.println("Parte 6: ");
    System.out.println("----------------------");

    // Crea una variable del tipo int llamada e1 de valor 7 y otra llamada e2 de
    // valor 2

    int e1 = 7;
    int e2 = 2;

    // Imprime el resultado de división, ¿Es el resultado el esperado, por qué?

    System.out.println(e1 / e2);

    // El resultado no es el esperado ya que al estar dividiendo integers el
    // resultado es un integer por lo que no tenemos decimales.

    // ¿Puedes afirmar que el resultado obtenido es el cociente? Para ello cambia
    // los valores asignados a e1 y e2.

    e1 = 11;
    e2 = 2;

    System.out.println(e2 / e1);

    // Si el resultado es el cociente

    // Imprime el resultado de e1%e2. ¿Qué has obtenido?

    System.out.println(e1 % e2);
    // He obtenido el resto de la division.

    // Imprime la siguiente operación 1.0*e1/e2. ¿Por qué el resultado es un número
    // real?

    System.out.println(1.0 * e1 / e2);

    // Porque al estar multiplicando e1 por 1.0 este se convierte un un double el
    // cual al dividir por e2 nos da como resultado de la division un double.

    // Dada las siguientes operaciones determina antes de comprobar (descomentando y
    // ejecutando) si el resultado es int o double. Y cual sera el resultado
    // numérico. Explica el porqué del resultado en cada caso insertado como
    // comentario.

    // Descomenta todo de una vez hayas pensado las respuestas en cada caso

    System.out.println("**************");

    System.out.println(e1 + e2 + 2.5);
    // double porque esta el 2.5

    int e3 = 3;
    System.out.println(e1 + e2 / e3);
    // int porque todos los miembros de la operacion son int

    System.out.println((e1 + e2) / e3);
    // int porque todos los miembros de la operacion son int

    double dd1 = 3.5;
    System.out.println((int) dd1);
    // int porque estamos transformando dd1 de double a int

    System.out.println((int) dd1 * 3);
    // int porque estamos transformando dd1 de double a int y luego lo multiplicamos
    // por 3

    System.out.println((int) (dd1 * 3));
    // int porque estamos transformando dd1*3 de double a int
    System.out.println(3.5 * e1 / 8 + 12);
    // double porque un miembro de la operacion es un double

    System.out.println((double) e1);
    // double porque estamos transformando e1 a un double

  }
}
