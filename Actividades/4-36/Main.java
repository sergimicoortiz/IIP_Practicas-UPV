import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un cadena de texto");
        Scanner teclado = new Scanner(System.in);
        String str = teclado.nextLine();
        teclado.close();
        String newStr = "";
        for (int i = str.length(); i > 0; i--) {
            newStr += str.charAt(i - 1);
        }
        System.out.println(newStr);
    }
}