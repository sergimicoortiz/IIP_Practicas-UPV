import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Crea teclado (Scanner)
        Scanner keyboard = new Scanner(System.in);
        // Leer los grados en Celsius usando Scanner
        String msg1 = "Introduzca el valor de Cº que quere convertir a F";
        System.out.println(msg1);
        double c = keyboard.nextDouble();
        keyboard.close();
        // Calcular e imprimir el equivalente en Fahrenheit
        double f = (c * 9 / 5) + 32;
        String msgFinal = c + " grados celsius son " + f + " grados fahrenheit";
        System.out.println(msgFinal);
    }
}