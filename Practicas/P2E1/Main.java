package Practicas.P2E1;

/*Práctica 2.Ejercicio1  Trabajando con estructuras de selección
*/

/*Programa 1:  Estructura if(){ }
Implemente un programa que reciba una nota numérica de un alumno entre 0 y 10 y responda:

Si nota=10 Matrícula de Honor
Si 9<=nota<10 Sobresaliente
Si 7<=nota<9 Notable
Si 6<=nota<7 Bien
Si 5<=nota<7 Suficiente
Si 4<=nota<5 Insuficiente
Si 3<=nota<4 Deficiente
Si nota<3 Muy Deficiente
Si la nota está fuera de rango debe responder con nota numérica no valida.

Sólo puede usar if(){ } (observa no hay else).

Programa 2 a continuación realiza el mismo programa pero usando una estructura
if(){

}else if(){ //Repetir else if las veces sea necesaria
......
......
}else{

}
Nota: Implemente los programas 1 y 2 en la zona indicada. Se han añadido unas líneas para determinar el tiempo de calculo de cada estructura. Responda en el lugar indicado las cuestiones se planteen
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Bloque entrada datos
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce nota (0 a 10): ");
        float nota = tec.nextFloat();
        String str = "";

        tec.close();

        // Instrucción para obtener en ns (nanosegundos) el instante temporal previo a
        // la ejecución.

        long startTime = System.nanoTime();

        // Programa aquí el código del Programa 1

        if ((nota < 0) || (nota > 10)) {
            str = "Nota numerica no valida";
        }
        if (nota < 3) {
            str = "Muy Deficiente";
        }
        if ((3 <= nota) && (nota < 4)) {
            str = "Deficiente";
        }
        if ((4 <= nota) && (nota < 5)) {
            str = "Insuficiente";
        }
        if ((5 <= nota) && (nota < 6)) {
            str = "Suficiente";
        }
        if ((6 <= nota) && (nota < 7)) {
            str = "Bien";
        }
        if ((7 <= nota) && (nota < 9)) {
            str = "Notable";
        }
        if ((9 <= nota) && (nota < 10)) {
            str = "Sobresaliente";
        }
        if (nota == 10) {
            str = "Matrícula de Honor";
        }

        // Instrucciones para leer el instante de tiempo tras la ejecución de la
        // estructura y para evaluar la resta de los instantes temporales de inicio y
        // fin en microsegundos.

        long endTime = System.nanoTime();
        double timeRun = (endTime - startTime) / 1000.0;

        // Muestra en pantalla el resultado de la nota y el tiempo de ejecución del
        // fragmento de código.

        System.out.println(str + " " + timeRun + " \u03bc" + "s");

        // Fin del programa 1

        // Inicio del programa 2. Añádelo sin comentar el bloque del programa 1, con el
        // fin se ejecuten uno detrás de otro,

        // Instrucción para obtener en ns (nanosegundos) el instante temporal previo a
        // la ejecución.

        startTime = System.nanoTime();

        // Implemente aquí código del programa 2
        str = "";
        if ((nota < 0) || (nota > 10)) {
            str = "Nota numerica no valida";
        } else if (nota < 3) {
            str = "Muy Deficiente";
        } else if ((3 <= nota) && (nota < 4)) {
            str = "Deficiente";
        } else if ((4 <= nota) && (nota < 5)) {
            str = "Insuficiente";
        } else if ((5 <= nota) && (nota < 6)) {
            str = "Suficiente";
        } else if ((6 <= nota) && (nota < 7)) {
            str = "Bien";
        } else if ((7 <= nota) && (nota < 9)) {
            str = "Notable";
        } else if ((9 <= nota) && (nota < 10)) {
            str = "Sobresaliente";
        } else if (nota == 10) {
            str = "Matrícula de Honor";
        }

        // Instrucciones para leer el instante de tiempo tras la ejecución de la
        // estructura y para evaluar la resta de los instantes temporales de inicio y
        // fin en microsegundos.

        endTime = System.nanoTime();
        timeRun = (endTime - startTime) / 1000.0;

        // Muestra en pantalla el resultado de la nota y el tiempo de ejecución del
        // fragmento de código.

        System.out.println(str + " " + timeRun + " \u03bc" + "s");

        // Fin del programa 2

    }
}
// Responda a las cuestiones

// ¿Por qué cre que la ejecución del programa 2 es más rápida?
// Porque el programa 1 tiene que evaluar cada if de forma independiente en
// cambio en el programa 2 al utilizar else if se considera uno solo
// el cual termina en cuanto uno de ellos es verdadero.

// Considera que el orden de la estructura del programa 2 puede hacer que aún
// sea más rápida su ejecución ¿Por qué?

// Si primero comprobamos las notas más probables entonces el programa obtendra
// el resultado requerido más rapido ya que el else if terminara en las primeras
// casos con más probabilidad.