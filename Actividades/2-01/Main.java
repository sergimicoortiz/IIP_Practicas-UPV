import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double l1 = 0.0, l2 = 0.0;
        try {
            String msg1 = "Que mide uno de los lados del triangulo?";
            String msg2 = "Que mide el otro lados del triangulo?";
            System.out.println(msg1);
            l1 = keyboard.nextFloat();
            System.out.println(msg2);
            l2 = keyboard.nextFloat();
        } catch (Exception e) {
            String errorMsg = "Los valores que introduzcan deben ser números y en el caso de ser decimales debes utilizar '.'";
            System.out.println(errorMsg);
        } finally {
            keyboard.close();
            double h = Math.sqrt(Math.pow(l1, 2) + Math.pow(l2, 2));
            String finalMsg = "La hipotenusa sel triangulo mide: " + h;
            System.out.println(finalMsg);
        }
    }
}