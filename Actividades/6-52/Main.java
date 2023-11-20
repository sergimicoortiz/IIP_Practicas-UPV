class Main {

    // Imnplemente el método 'norma' aquí
    public static double norma(double v[]) {
        double suma = 0.0;
        for (int i = 0; i < v.length; i++) {
            suma += Math.pow(v[i], 2);
        }
        return Math.sqrt(suma);
    }

    public static void main(String[] args) {
        // Comprueba su funcionamiento con este ejemplo
        double[] v = { 5.2, 1.2, 4.5, 6, 3.5 };

        System.out.println(norma(v));

    }
}