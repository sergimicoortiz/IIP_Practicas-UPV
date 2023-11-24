package Practicas.P3E2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Programa 1: Control entrada de datos

        // Cree teclado
        Scanner tec = new Scanner(System.in);

        // Declare variable carga e inicialícela.
        double carga = 0.0;
        boolean correcto = false;

        // Complete la estructura do --while
        // Implemente instrucciones necesarias

        do {
            System.out.print("Introduzca el valor de la carga: ");
            carga = tec.nextDouble();
            correcto = ((0.2 <= carga) && (carga < 220));
        } while (!correcto);

        System.out.println("Valor correcto " + carga + " N/m^2");

        // Programa 2
        // Implemente aquí el código
        carga = 0.0;
        correcto = false;
        while (!correcto) {
            System.out.print("Introduzca el valor de la carga: ");
            carga = tec.nextDouble();
            correcto = ((0.2 <= carga) && (carga < 220));
            if (!correcto) {
                System.out.println(
                        "Valor de carga erróneo, introduzca un valor adecuado entre 0.2 y 220 N/m^2 no incluido");
            }
        }

        // Programa 3:
        // Implemente aquí el código
        int valorEntero = 0;
        correcto = false;

        do {
            System.out.print("Introduzca el valor del número entero: ");
            valorEntero = tec.nextInt();
            switch (valorEntero) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 10:
                    correcto = true;
                    break;

                default:
                    correcto = false;
                    break;
            }
        } while (!correcto);

        tec.close();
        /*
         * Responda aquí a las cuestiones
         * 
         * El while primero realiza la comprobación de la condicion y luego ejecuta el
         * codigo de dentro
         * El do while primero ejecuta el codigo y luego realiza la comprobación de la
         * condicion
         * 
         * Para un bucle infinito simplemente pondria true como condicion el el bucle
         * while o el do while
         * 
         */
    }
}
