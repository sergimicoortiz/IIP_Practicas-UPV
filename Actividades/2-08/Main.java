import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca x";
        System.out.println(msg1);
        double x = keyboard.nextDouble();
        keyboard.close();
        double y = Math.pow(x, 5) * (-x) + 10;
        System.out.println("Y: " + y);
    }
}