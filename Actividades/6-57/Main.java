import java.util.Scanner;

class Main {

    // Genera la matriz con valores desde el teclado
    public static float[][] generaMatriz(int filas, int columnas) {
        // Es una matriz rectangular (no dentada), que
        // son la clase de matrices principalmente usadas en matemáticas.
        float[][] matriz = new float[filas][columnas];
        Scanner input = new Scanner(System.in);

        // Ahora, filas = matriz.length y columnas = matriz[0].length,
        // por tanto podemos usar una u otra ...
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < columnas; j++) {
                System.out.println("Dame la fila " + i + " y la columna  " + j);
                matriz[i][j] = input.nextFloat();
            }
        return matriz;
    }

    // Imprimir una matriz
    public static void printMatrix(float[][] matrix) {
        // Imprime la matriz por filas y columnas
        // Escribe aquí tu código.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // Sumar dos matrices
    // Crea una nueva matriz que es la suma componente a componente
    // de las dos matrices de entrada
    // Obviamente, las dos matrices de entrada han de ser
    // del mismo tañmaño rectangular MxN.
    public static float[][] sumMatrix(float[][] m1, float[][] m2) {
        // Escribe aquí tu código.
        float[][] suma = new float[m1.length][m1[0].length];
        if (m1.length != m2.length) {
            System.out.println("Las matrices deben de tener el mismo tamaño");
            System.exit(1);
        }

        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                System.out.println("Las matrices deben de tener el mismo tamaño");
                System.exit(1);
            }
            for (int j = 0; j < m1[i].length; j++) {
                suma[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int filas, columnas;
        Scanner input = new Scanner(System.in);
        float[][] m1, m2;

        System.out.println("¿Cuántas filas tienen las matrices?");
        filas = input.nextInt();
        System.out.println("¿Cuántas columnas tienen las matrices?");
        columnas = input.nextInt();

        System.out.println("Intoduce los valores de la primera matriz:");
        m1 = generaMatriz(filas, columnas);
        System.out.println("Introduce los valores de la segunda matriz:");
        m2 = generaMatriz(filas, columnas);

        // Escribe tu código aquí
        // Suma las dos matrices en 'sumMatrix' e imprime 'printMatrix'.
        float[][] suma = sumMatrix(m1, m2);
        printMatrix(suma);
        input.close();
    }
}