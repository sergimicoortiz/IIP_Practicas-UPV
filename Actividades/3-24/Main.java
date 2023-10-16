import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un número entero";
        System.out.println(msg1);
        int n = keyboard.nextInt();
        keyboard.close();
        String resultado = n % 2 == 0 ? "par" : "impar";
        System.out.println("El número: " + n + " es " + resultado);
    }
}