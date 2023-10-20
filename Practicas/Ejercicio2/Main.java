package Practicas.Ejercicio2;

import java.util.Scanner;

/* Práctica 1. Ejercicio 2

Un grupo de turistas va a realizar una excursión para la que debe contratar un número suficiente de microbuses. Se desea saber el coste por turista, suponiendo que cada microbús tiene una capacidad máxima de 8 viajeros y que el coste total se reparte equitativamente entre los componentes del grupo. 

Se debe escribir un programa en Java que lea de la entrada el coste en euros de contratar un microbús (será un número entero) y el número de participantes (será otro número entero). El programa deberá escribir en la salida:
    El número de microbuses necesarios,
    El coste en euros de los microbuses contratados,
    El coste por turista, redondeado a centésimas de euro.
    Escrito y compilado el programa, se deberá probar la corrección de los resultados calculados.  
Por ejemplo, si el coste de un microbús es de 265 euros, el coste por turista en grupo de 38 persones debe dar 34.87 euros.
Para resolver el problema del redondeo con cierta precisión, se sugiere tener en cuenta la siguiente consideración: Supóngase por ejemplo, que se desea redondear con 2 cifras decimales una cantidad como 34.86842105263158; se puede multiplicar la cantidad por 100 (3486.842105263158) y redondearla para eliminar los decimales no deseados (3487). A continuación basta con dividir por 100 para obtener el resultado (34.87 en el ejemplo).

*/

//importa el Scanner

public class Main {

    public static void main(String args[]) {

        // Crea el teclado para leer los datos
        Scanner teclado = new Scanner(System.in);

        // ***Bloque entrada de datos

        // Pide el número de turista y crear la variable entera "numTuristas" que
        // almacene el valor introducido por teclado.
        System.out.println("Introduzca el número de turistas");
        int numTuristas = teclado.nextInt();

        // Pide el coste en euros de un microbus. Cree la variabe entera (tal como
        // indica enunciado) donde almacenar el coste de un microbus.
        System.out.println("Introduzaca el precio por microbus");
        double costeMicrobus = teclado.nextDouble();

        // Cierre el teclado
        teclado.close();

        // **Bloque de algoritmo (resuelve problema solicitado)

        // Calcula los buses que hacen faltan. Debe ser un número entero. Por ejemplo: 8
        // turistas requieren 1 bus pero 9 requieren 2 buses. Comprueba, por tanto, si
        // tu instrucción evalúa adecuadamente la operación antes de seguir.
        int buses = (int) Math.ceil(numTuristas / 8.0);

        // Crea una variable del tipo double que nos evalúe el coste de todos los
        // microbuses a alquilar.
        double costeTotal = buses * costeMicrobus;

        // Crea una variable del tipo double donde se almacene los euros a pagar por
        // cada turista.
        double costeTurista = costeTotal / numTuristas;

        // Ajuste la misma variable para que el resultado sólo muestre dos decimales.
        // Usando Math.round()
        costeTurista = Math.round(costeTurista * 100) / 100.0;

        // Ajuste usando casting. Para obtener, por otro procedimiento el resultado con
        // dos decimales.

        // Imprima el resultado. Sustituya (*) por el nombre de la variable usada para
        // almacenar el coste a pagar por turista

        System.out.println("Coste por turista " + costeTurista + " euros");
        System.out.println("Hacen falta " + buses + " buses");
    }
}
