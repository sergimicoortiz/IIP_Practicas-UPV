import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un número";
        String msg2 = "Introduzca otro número";
        System.out.println(msg1);
        int n1 = keyboard.nextInt();
        System.out.println(msg2);
        int n2 = keyboard.nextInt();
        keyboard.close();
        int suma = n1 + n2;
        String msgFinal = "La suma de " + n1 + " y de " + n2 + " es de " + suma;
        System.out.println(msgFinal);
    }
}