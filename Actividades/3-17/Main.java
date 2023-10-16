import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un número";
        String msg2 = "Introduzca otro número";
        System.out.println(msg1);
        double n1 = keyboard.nextDouble();
        System.out.println(msg2);
        double n2 = keyboard.nextDouble();
        keyboard.close();
        if (n1 > n2) {
            System.out.println(n1 + " es más grande que " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " es más grande que " + n1);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}