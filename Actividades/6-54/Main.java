class Main {

    // Escribe el método 'sum' aquí
    public static double[] sum(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            System.out.println("Los arrays deben de tener el mismo tamaño");
            System.exit(1);
        }
        double[] suma = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            suma[i] = v1[i] + v2[i];
        }
        return suma;
    }

    // método para imprimir el array
    static public void printArray(double[] v) {
        System.out.println("Las componentes del array son:");
        for (int i = 0; i < v.length; i++)
            System.out.println(v[i]);
    }

    public static void main(String[] args) {
        // Testeando el método
        double[] v1 = { 1.0, 3.0, 2.0, 5.6 }, v2 = { 2.0, 1.0, 2.5, 1.4 };

        printArray(sum(v1, v2)); // Hace la llamda al método 'sum' e imprime el vector suma.
    }
}