import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int nRandom = min + (int) (Math.random() * ((max - min) + 1));
        int n;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduzca un número entre " + min + " y " + max);
            n = teclado.nextInt();
            if (n > nRandom) {
                System.out.println("El número es más pequeño");
            }
            if (n < nRandom) {
                System.out.println("El número es más grande");
            }
        } while (n != nRandom);
        teclado.close();
        System.out.println("Ganaste, el numero aleatorio era: " + nRandom);
    }
}