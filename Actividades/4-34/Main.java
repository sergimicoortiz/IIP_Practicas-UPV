import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un númeró del 1 al 10");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.close();
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}