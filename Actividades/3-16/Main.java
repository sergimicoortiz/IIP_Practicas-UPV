import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un número entero";
        String msg2 = "Introduzca otro número entero";
        System.out.println(msg1);
        int n1 = keyboard.nextInt();
        System.out.println(msg2);
        int n2 = keyboard.nextInt();
        keyboard.close();
        if (n2 == 0) {
            System.out.println("No puedes dividir por cero");
            System.exit(1);
        }
        int cociente = n1 / n2;
        int resto = n1 % n2;
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }
}