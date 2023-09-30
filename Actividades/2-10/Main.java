import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca el primer lado del triangulo";
        String msg2 = "Introduzca el segundo lado del triangulo";
        System.out.println(msg1);
        double c1 = keyboard.nextDouble();
        System.out.println(msg2);
        double c2 = keyboard.nextDouble();
        keyboard.close();
        double h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
        double a = (c1 * c2) / 2;
        double p = h + c1 + c2;
        System.out.println("Hipotenusa: " + h);
        System.out.println("Área: " + a);
        System.out.println("Perímetro: " + p);
    }
}