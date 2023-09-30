import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un número";
        System.out.println(msg1);
        int n = keyboard.nextInt();
        keyboard.close();
        System.out.println(n + " X 1 = " + n * 1);
        System.out.println(n + " X 2 = " + n * 2);
        System.out.println(n + " X 3 = " + n * 3);
        System.out.println(n + " X 4 = " + n * 4);
        System.out.println(n + " X 5 = " + n * 5);
        System.out.println(n + " X 6 = " + n * 6);
        System.out.println(n + " X 7 = " + n * 7);
        System.out.println(n + " X 8 = " + n * 8);
        System.out.println(n + " X 9 = " + n * 9);
        System.out.println(n + " X 10 = " + n * 10);
    }
}