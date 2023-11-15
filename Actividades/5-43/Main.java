import java.util.Scanner;

class Main {

    public static long factorial(long n) {
        long resultado = 1;
        if (n <= 0) {
            return 0;
        }
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    static public long combinatorio(long n, long m) {
        return (factorial(n)) / (factorial(m) * factorial(n - m));
    }

    public static void main(String[] args) {
        // Pide los dos números del tipo long
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame n");
        long n = teclado.nextLong();
        System.out.println("Dame m");
        long m = teclado.nextLong();
        teclado.close();

        // Calcula llamando a los métodos el número combinatorio.
        long resultado = combinatorio(n, m);
        // Imprime el resultado.
        System.out.println(resultado);
    }
}