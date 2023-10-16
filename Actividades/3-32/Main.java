import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca tres números reales";
        System.out.println(msg1);
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        keyboard.close();
        boolean e1 = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
        boolean e2 = Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
        boolean e3 = Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
        String numeros = a + ", " + b + ", " + c;
        String resultado = e1 || e2 || e3 ? " forman" : " NO forman";
        System.out.println(numeros + resultado + " una terna pitagórica");
    }
}