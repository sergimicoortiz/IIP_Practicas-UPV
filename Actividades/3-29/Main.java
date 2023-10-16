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
        String resultado = n1 % n2 == 0 ? n1 + " es múltiplo de " + n2 : n1 + " NO es múltiplo de " + n2;
        System.out.println(resultado);
    }
}