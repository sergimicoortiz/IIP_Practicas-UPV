class Main {

    public static double normaI(double v[]) {
        double suma = 0.0;
        for (int i = 0; i < v.length; i++) {
            suma += Math.pow(v[i], 2);
        }
        return Math.sqrt(suma);
    }

    // Implemente el método "norma" aquí (recursivo)
    public static double normaR(double v[], int pos, double suma) {
        if (pos >= v.length) {
            return Math.sqrt(suma);
        }
        suma += Math.pow(v[pos], 2);
        return normaR(v, pos + 1, suma);
    }

    public static void main(String[] args) {
        // Comprobando el funcionamiento con un ejemplo

        double[] v = { 5.2, 1.2, 4.5, 6, 3.5 };

        System.out.println(normaR(v, 0, 0));
        System.out.println(normaI(v));
    }
}