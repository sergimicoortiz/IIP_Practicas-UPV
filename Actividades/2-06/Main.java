import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca 10 números";
        System.out.println(msg1);
        double n1 = keyboard.nextDouble();
        double n2 = keyboard.nextDouble();
        double n3 = keyboard.nextDouble();
        double n4 = keyboard.nextDouble();
        double n5 = keyboard.nextDouble();
        double n6 = keyboard.nextDouble();
        double n7 = keyboard.nextDouble();
        double n8 = keyboard.nextDouble();
        double n9 = keyboard.nextDouble();
        double n10 = keyboard.nextDouble();
        keyboard.close();
        double media = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10.0;
        System.out.println("Media: " + media);
    }
}