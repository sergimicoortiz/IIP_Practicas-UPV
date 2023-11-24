package Practicas.P3E3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Cree teclado
        Scanner tec = new Scanner(System.in);

        // Cree variable entera para leer el número del menú.

        int menu = 0;
        int precision = 10;

        // código para resolver el algortimo

        do {// Bucle do-while para que permita salir al pulsar 4 (el programa termina)
            do {// Bucle do-while dentro del anterior controla se repita
                // el menú si el número introducido no es del 1 al 4.
                System.out.println("1.	Calcular e^x");
                System.out.println("2.	Calcular cos(x)");
                System.out.println("3.	Calcular sen(x)");
                System.out.println("4.	Salir");
                menu = tec.nextInt();
            } while ((menu < 1) || (menu > 4));

            // A partir de aquí los datos ya son correctos
            // Estructura de selección para que en función del número del menú resuelva la
            // correspondiente serie de MacLaurin.

            /*
             * Dentro de cada elemento del bloque de selección: Pida el valor real x al
             * teclado
             * 1. Inicialice el valor inicial de la serie (variable del tipo double).
             * 2. Inicialice un variable llamada coef para ir ajustando el divisor de cada
             * elemento de la serie, también del tipo double, a pesar de ser número enteros.
             * El motivo: tener mayor resolución.
             * 3. Programe un bucle for para evaluar cada elemento de la serie en cada
             * iteración.
             * 
             * Para el caso de cálculo de e^x (n=20) (20 términos de la serie)
             * Para el caso de cálculo del cos(x) y sen(x) (n=40) (20 términos, observe que
             * crece de 2 en 2, vea las imágenes donde están las fórmulas)
             */

            // Escriba a partir de aquí el código necesario.
            if (menu != 4) {

                System.out.print("Introduzca el valor de x: ");
                double x = tec.nextDouble();
                double resultado = 0.0;
                switch (menu) {
                    case 1:
                        // if (x > Math.PI * 2) {
                        //     int deMas = (int) Math.floor(x / (Math.PI * 2));
                        //     x = x - (Math.PI * 2 * deMas);
                        // }
                        for (int n = 0; n < precision; n++) {
                            double factorial = 1;
                            for (int i = 1; i <= n; i++) {
                                factorial *= i;
                            }
                            // System.out.println(n + "!=" + factorial);
                            resultado += Math.pow(x, n) / factorial;
                        }
                        System.out.println("\t e^x = " + resultado + "---> e^x =" + Math.exp(x));
                        break;
                    case 2:
                        for (int n = 0; n < precision; n++) {
                            double menos1 = Math.pow(-1, n);
                            double xAl2n = Math.pow(x, 2 * n);
                            double factorial = 1;
                            for (int i = 1; i <= (2 * n); i++) {
                                factorial *= i;
                            }
                            resultado += (menos1 * xAl2n) / factorial;
                        }
                        System.out.println("\tcos(x) = " + resultado + " ---> cos(x) =" + Math.cos(x));
                        break;
                    case 3:
                        for (int n = 0; n < precision; n++) {
                            double menos1 = Math.pow(-1, n);
                            double xAl2n = Math.pow(x, 2 * n + 1);
                            double factorial = 1;
                            for (int i = 1; i <= (2 * n + 1); i++) {
                                factorial *= i;
                            }
                            resultado += (menos1 * xAl2n) / factorial;
                        }
                        System.out.println("\tsen(x) = " + resultado + " ---> sen(x) =" + Math.sin(x));
                        break;
                }
            }

        } while (menu != 4); // Salir al pulsar 4
        tec.close();

    }
}
