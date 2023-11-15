import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un número positivo");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.close();
        double log2 = 0.0;
        // impares se suma
        // pares se resta
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                log2 += (1.0 / i);
            } else {
                log2 -= (1.0 / i);
            }
        }
        System.out.println(log2);
    }
}