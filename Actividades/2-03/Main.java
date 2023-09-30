import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca su edad.";
        System.out.println(msg1);
        int edad = keyboard.nextInt();
        keyboard.close();
        String msgFinal = "Tienes " + edad + " años y el próximo año tendrás " + (edad+1) + ".";
        System.out.println(msgFinal);
    }
}