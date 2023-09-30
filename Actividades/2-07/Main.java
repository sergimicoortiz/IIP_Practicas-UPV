import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca los segundos";
        System.out.println(msg1);
        int s = keyboard.nextInt();
        keyboard.close();
        int ms = s * 1000;
        System.out.println("Milisegundos: " + ms);
    }
}