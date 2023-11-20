import java.util.Scanner;

class Main {

    // Generar una matriz dentada pidiéndola al usaurio.
    public static float[][] generaMatrizDentada() {
        float[][] matriz;
        int filas, columnas;
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuántas filas tiene la matriz?");
        filas = input.nextInt();

        matriz = new float[filas][];

        for (int i = 0; i < filas; i++) {
            System.out.println("¿Cuántas columnas tiene la fila " + i + " ?");
            columnas = input.nextInt();
            matriz[i] = new float[columnas];
        }

        // Lee todos los valores de la matrix dentada
        for (int i = 0; i < filas; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Dame elemento de la fila " + i + " y columna " + j + " :");
                matriz[i][j] = input.nextFloat();
            }

        // Devuelve la matriz creada con todos los valores introducidos
        return matriz;
    }

    // Imprimiendo una matriz dentada
    public static void printMatrizDentada(float[][] m) {
        for (int i = 0; i < m.length; i++) { // filas
            for (int j = 0; j < m[i].length; j++) // columnas diferentes para cada fila, por eso necesitamos consular su
                                                  // longitud)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

    // Buscando un valor en la matrix
    public static boolean busca(float[][] m, float x) {
        // Escribe tu código aquí
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Crea e introduce los valores de la matriz dentada
        float[][] matriz = generaMatrizDentada();

        System.out.println("Tu matriz de entrada es:");
        printMatrizDentada(matriz);

        // Buscando un elemento
        Scanner input = new Scanner(System.in);

        System.out.println("Dame un valor a buscar:");
        float x = input.nextFloat();

        if (busca(matriz, x)) {
            System.out.println("Yo he encontrado el elemento en la matriz");
        } else {
            System.out.println("Yo no he encontrado el elemento en la matriz");
        }
    }
}