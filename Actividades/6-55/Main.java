class Main {

    // Implemente el método 'busca' aquí
    public static int busca(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Viendo si trabaja adecuadamente el método
        int[] v = { 2, 4, 65, 43, 2, 0, -40, 50, 23, 4 };

        int ex1 = busca(v, 23);
        if (ex1 != -1) {
            System.out.println("El elemento " + 23 + " está en la posición " + ex1);
        } else {
            System.out.println("El elemento no está en el array.");
        }

        ex1 = busca(v, 30);
        if (ex1 != -1) {
            System.out.println("El elemento  " + 30 + " está en la posición " + ex1);
        } else {
            System.out.println("El elemento no está en el array");
        }
    }
}