package Practicas.P2E2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        // Bloque entrada datos

        Scanner tec = new Scanner(System.in);
        System.out.print("Lectura temperatura: ");
        double temp = tec.nextDouble();
        tec.nextLine(); // Vaciar salto del linea para poder leer un String después de un formato número

        System.out.print("Hora [hh:mm]: ");
        String horario = tec.nextLine();

        // Cerramos teclado
        tec.close();

        // Implemente aquí el algoritmo

        // A partir de la cadena horario, extraiga una subcadenas con los dígitos de la
        // hora. Convierta la cadena en números entero, use el método parseInt de la
        // clase envolvente Integer. Observe que los minutos no son necesarios para
        // ajustar las franjas horarias.
        // Añada las líneas de código necesarias para extraer la cadena y su conversión
        // a entero

        int posicionDosPuntos = horario.indexOf(":");
        int h = Integer.parseInt(horario.substring(0, posicionDosPuntos));
        // int m = Integer.parseInt(horario.substring(posicionDosPuntos + 1));

        // Trabaje con las siguientes variables
        boolean refrigApagado = true;
        int estadoLamina = 0;
        int poteRefigerado = 0; // potencia desactivada

        // Programe el if anidado por temperaturas y dentro de ellas en función de las
        // horas indique los valores de las variables anteriores. Minimice lo máximo
        // posible el número de operaciones y comparaciones.
        // Añada aquí esa parte de código

        if (temp <= 10) {
            if (h >= 0 && h <= 5) {
                estadoLamina = 0;
                poteRefigerado = 0;
            } else if (h >= 6 && h <= 11) {
                estadoLamina = 0;
                poteRefigerado = 0;
            } else if (h >= 12 && h <= 17) {
                estadoLamina = 3;
                poteRefigerado = 1;
            } else if (h >= 18 && h <= 23) {
                estadoLamina = 0;
                poteRefigerado = 0;
            }

        } else if (temp <= 20) {
            if (h >= 0 && h <= 5) {
                estadoLamina = 0;
                poteRefigerado = 1;
            } else if (h >= 6 && h <= 11) {
                estadoLamina = 3;
                poteRefigerado = 1;
            } else if (h >= 12 && h <= 17) {
                estadoLamina = 2;
                poteRefigerado = 2;
            } else if (h >= 18 && h <= 23) {
                estadoLamina = 1;
                poteRefigerado = 1;
            }
        } else if (temp <= 40) {
            if (h >= 0 && h <= 5) {
                estadoLamina = 0;
                poteRefigerado = 2;
            } else if (h >= 6 && h <= 11) {
                estadoLamina = 1;
                poteRefigerado = 2;
            } else if (h >= 12 && h <= 17) {
                estadoLamina = 1;
                poteRefigerado = 3;
            } else if (h >= 18 && h <= 23) {
                estadoLamina = 1;
                poteRefigerado = 3;
            }
        } else if (temp > 40) {
            estadoLamina = 0;
            poteRefigerado = 3;
        }
        if (poteRefigerado == 0) {
            refrigApagado = true;
        } else {
            refrigApagado = false;
        }
        String apagadoEncendido = refrigApagado ? "refigerador apagado" : "refigerador encendido";
        System.out.println("lamina: " + estadoLamina + "\n" + apagadoEncendido + "\npotencia: " + poteRefigerado);
    }
}