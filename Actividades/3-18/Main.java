import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca 4 números";
        System.out.println(msg1);
        double n1 = keyboard.nextDouble();
        double n2 = keyboard.nextDouble();
        double n3 = keyboard.nextDouble();
        double n4 = keyboard.nextDouble();
        keyboard.close();
        double max = n1;
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        if (n4 > max) {
            max = n4;
        }
        System.out.println("El número más grande es: " + max);
    }
}