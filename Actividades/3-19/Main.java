import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca tres números";
        System.out.println(msg1);
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        int n3 = keyboard.nextInt();
        keyboard.close();
        String resultado = "";
        if ((n1 >= n2) && (n1 >= n3)) {
            if (n2 >= n3) {
                resultado = n3 + " " + n2 + " " + n1;
            } else {
                resultado = n2 + " " + n3 + " " + n1;
            }
        } else if ((n2 >= n1) && (n2 >= n3)) {
            if (n1 >= n3) {
                resultado = n3 + " " + n1 + " " + n2;
            } else {
                resultado = n1 + " " + n3 + " " + n2;
            }
        } else if ((n3 >= n1) && (n3 >= n2)) {
            if (n1 >= n2) {
                resultado = n2 + " " + n1 + " " + n3;
            } else {
                resultado = n1 + " " + n2 + " " + n3;
            }
        }
        System.out.println("Resultado: " + resultado);
    }
}