import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un número real";
        String msg2 = "Introduzca otro número real";
        String msg3 = "Introduzca un operador";
        System.out.println(msg1);
        double n1 = keyboard.nextDouble();
        System.out.println(msg2);
        double n2 = keyboard.nextDouble();
        System.out.println(msg3);
        char operador = keyboard.next().trim().charAt(0);
        keyboard.close();
        double resultado = 0.0;
        switch (operador) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default:
                System.out.println("El operador introducido no es valido");
                System.exit(1);
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}