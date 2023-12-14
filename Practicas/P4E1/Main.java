import java.util.Scanner;

class Main {

    static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        int x = readInt("Introduce un número entero");
        show("Valor introducido:", x);

        double d = readDouble("Introduce un número real");
        show("Valor introducido:", d);

        String str = readString("Introduce tu nombre: ");
        show("Nombre:", str);

        str = readString("Introduce tus apellidos: ");
        show("Apellidos:", str);

    } // Fin método main

    public static int readInt(String ask) {
        // Programe aquí el código del método
        return 0;
    }

    public static double readDouble(String ask) {
        // Programe aquí el código del método
        return 0;
    }

    public static String readString(String ask) {
        // Programe aquí el código del método
        return "";
    }

    // Programe a partir de aquí los métodos show aplicando sobrecarga
    public static void show(String msg, int x) {

    }

    public static void show(String msg, double x) {

    }

    public static void show(String msg, String x) {

    }

}