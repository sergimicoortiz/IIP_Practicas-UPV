import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un string";
        String msg2 = "Introduzca otro string";
        System.out.println(msg1);
        String s1 = keyboard.nextLine().trim();
        System.out.println(msg2);
        String s2 = keyboard.nextLine().trim();
        keyboard.close();
        String resultado = s1 + "\n" + s2;
        if (msg1.compareTo(msg2) > 0) {
            resultado = s2 + "\n" + s1;
        }
        System.out.println("Resultado:");
        System.out.println(resultado);
    }
}