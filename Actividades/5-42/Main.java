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

    public static void main(String[] args) {
        System.out.println("El factorial de 5 es " + factorial(5));
    }
}