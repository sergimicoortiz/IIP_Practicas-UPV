import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un string";
        System.out.println(msg1);
        String s = keyboard.nextLine();
        keyboard.close();
        System.out.println("La cadena de texto tiene: " + s.length() + " caracteres");
    }
}