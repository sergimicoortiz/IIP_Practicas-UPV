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
        ask = ask.trim();
        ask = ask.charAt(ask.length() - 1) == ':' ? ask : ask + ":";
        System.out.println(ask);
        int n = tec.nextInt();
        tec.nextLine();
        return n;
    }

    public static double readDouble(String ask) {
        // Programe aquí el código del método
        ask = ask.trim();
        ask = ask.charAt(ask.length() - 1) == ':' ? ask : ask + ":";
        System.out.println(ask);
        double n = tec.nextDouble();
        tec.nextLine();
        return n;
    }

    public static String readString(String ask) {
        // Programe aquí el código del método
        ask = ask.trim();
        ask = ask.charAt(ask.length() - 1) == ':' ? ask : ask + ":";
        System.out.println(ask);
        String n = tec.nextLine();
        return n;
    }

    // Programe a partir de aquí los métodos show aplicando sobrecarga
    public static void show(String msg, int x) {
        msg = msg.trim();
        msg = msg.charAt(msg.length() - 1) == ':' ? msg : msg + ":";
        System.out.println(msg + " " + x);
    }

    public static void show(String msg, double x) {
        msg = msg.trim();
        msg = msg.charAt(msg.length() - 1) == ':' ? msg : msg + ":";
        System.out.println(msg + " " + x);
    }

    public static void show(String msg, String x) {
        msg = msg.trim();
        msg = msg.charAt(msg.length() - 1) == ':' ? msg : msg + ":";
        System.out.println(msg + " " + x);
    }

}