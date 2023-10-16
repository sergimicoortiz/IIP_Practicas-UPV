import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un número entero entre 0 y 9999";
        System.out.println(msg1);
        int n = keyboard.nextInt();
        keyboard.close();
        if ((n > 9999) || (n < 0)) {
            System.out.println("El número debe de estar entre 0 y 9999");
            System.exit(1);
        }

        int millares = 0;
        int centenas = 0;
        int decenas = 0;
        int unidades = 0;
        String resultado = "";

        if (n >= 1000) {
            millares = n / 1000;
            n = n % 1000;
        }
        if (n >= 100) {
            centenas = n / 100;
            n = n % 100;
        }
        if (n >= 10) {
            decenas = n / 10;
            n = n % 10;
        }
        unidades = n;
        if (millares > 0) {
            resultado += millares + " millares\n";
        }
        if (centenas > 0) {
            resultado += centenas + " centenas\n";
        }
        if (decenas > 0) {
            resultado += decenas + " decenas\n";
        }
        if (unidades > 0) {
            resultado += unidades + " unidades\n";
        }
        System.out.println(resultado);
    }
}