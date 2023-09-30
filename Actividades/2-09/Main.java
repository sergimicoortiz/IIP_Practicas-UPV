import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msgX1 = "Introduzca la cordenada x del primer punto";
        String msgY1 = "Introduzca la cordenada y del primer punto";
        String msgX2 = "Introduzca la cordenada x del segundo punto";
        String msgY2 = "Introduzca la cordenada y del segundo punto";
        System.out.println(msgX1);
        double x1 = keyboard.nextDouble();
        System.out.println(msgY1);
        double y1 = keyboard.nextDouble();
        System.out.println(msgX2);
        double x2 = keyboard.nextDouble();
        System.out.println(msgY2);
        double y2 = keyboard.nextDouble();
        keyboard.close();
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los dos puntos es de: " + d);
    }
}