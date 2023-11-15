class Main {
// TODO: Este no sale
    public static int multiplica(int a, int b) {
        // Escribe tu código recursivo aquí
        if (a == 0) {
            return b;
        }
        return multiplica(a - 1, b + b);
    }

    public static void main(String[] args) {
        System.out.println(multiplica(2, 4));
        System.out.println(multiplica(8, 9));
    }
}