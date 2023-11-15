import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Que cantidad de números quere introducir?");
        Scanner teclado = new Scanner(System.in);
        int nRep = teclado.nextInt();
        int max = 0;
        int min = 0;
        for (int i = 0; i < nRep; i++) {
            System.out.println("Introduzca un número:");
            int n = teclado.nextInt();
            if (i == 0) {
                max = n;
                min = n;
            } else {
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            }
        }
        teclado.close();
        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
    }
}