import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca el primer string";
        String msg2 = "Introduzca el segundo string";
        System.out.println(msg1);
        String s1 = keyboard.nextLine().trim();
        System.out.println(msg2);
        String s2 = keyboard.nextLine().trim();
        String esta = s1.equals(s2) ? "Cadenas iguales" : "Cadenas distintas";
        keyboard.close();
        System.out.println(esta);
    }
}