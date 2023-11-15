import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Que cantidad de números quere introducir?");
        Scanner teclado = new Scanner(System.in);
        int nRep = teclado.nextInt();
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < nRep; i++) {
            System.out.println("Introduzca un número:");
            int n = teclado.nextInt();
            if (n % 2 == 0) {
                pares += n;
            } else {
                impares += n;
            }
        }
        teclado.close();
        System.out.println("Suma pares: " + pares);
        System.out.println("Suma impares: " + impares);
    }
}