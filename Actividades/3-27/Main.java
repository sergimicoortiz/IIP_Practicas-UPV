import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca una cantidad de dinero (2 decimales Ej: 12.23)";
        System.out.println(msg1);
        double total = keyboard.nextDouble();
        keyboard.close();
        int euros = (int) Math.floor(total); // Nos quedamos con la cantidad de euros
        int centimos = (int) Math.floor((total - euros) * 100); // Nos quedamos con la cantidad de centimos

        // Declaramos todas las variables para contavilizar los billetes/monedas
        int b50 = 0;
        int b20 = 0;
        int b10 = 0;
        int b5 = 0;
        int m2e = 0;
        int m1e = 0;
        int m50c = 0;
        int m20c = 0;
        int m10c = 0;
        int m5c = 0;
        int m2c = 0;
        int m1c = 0;

        String resultado = "";

        // Vamso añadiendo los billetes y nos guardamos el resto.
        if (euros >= 50) {
            b50 = euros / 50;
            euros = euros % 50;
        }
        if (euros >= 20) {
            b20 = euros / 20;
            euros = euros % 20;
        }
        if (euros >= 10) {
            b10 = euros / 10;
            euros = euros % 10;
        }
        if (euros >= 5) {
            b5 = euros / 5;
            euros = euros % 5;
        }
        if (euros >= 2) {
            m2e = euros / 2;
            euros = euros % 2;
        }
        m1e = euros; // El resto a monedas de 1e

        // Lo mismo para los centimos
        if (centimos >= 50) {
            m50c = centimos / 50;
            centimos = centimos % 50;
        }
        if (centimos >= 20) {
            m20c = centimos / 20;
            centimos = centimos % 20;
        }
        if (centimos >= 10) {
            m10c = centimos / 10;
            centimos = centimos % 10;
        }
        if (centimos >= 5) {
            m5c = centimos / 5;
            centimos = centimos % 5;
        }
        if (centimos >= 2) {
            m2c = centimos / 2;
            centimos = centimos % 2;
        }
        m1c = centimos;

        // Construimos la cadena final

        if (b50 > 0) {
            resultado += b50 + " billetes de 50 euros \n";
        }
        if (b20 > 0) {
            resultado += b20 + " billetes de 20 euros \n";
        }
        if (b10 > 0) {
            resultado += b10 + " billetes de 10 euros \n";
        }
        if (b5 > 0) {
            resultado += b5 + " billetes de 5 euros \n";
        }
        if (m2e > 0) {
            resultado += m2e + " monedas de 2 euros \n";
        }
        if (m1e > 0) {
            resultado += m1e + " monedas de 1 euros \n";
        }
        if (m50c > 0) {
            resultado += m50c + " monedas de 50 centimos \n";
        }
        if (m20c > 0) {
            resultado += m20c + " monedas de 20 centimos \n";
        }
        if (m10c > 0) {
            resultado += m10c + " monedas de 10 centimos \n";
        }
        if (m5c > 0) {
            resultado += m5c + " monedas de 5 centimos \n";
        }
        if (m2c > 0) {
            resultado += m2c + " monedas de 2 centimos \n";
        }
        if (m1c > 0) {
            resultado += m1c + " monedas de 1 centimos \n";
        }
        System.out.println("La distribución óptima es:");
        System.out.println(resultado);
    }
}