import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un string");
        String str = teclado.nextLine().trim();
        System.out.println("Introduzca una letra");
        char letra = teclado.nextLine().trim().toLowerCase().charAt(0);
        teclado.close();
        String msg = "La letra: " + letra + " NO esta contenido en el string";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                msg = "La letra: " + letra + " esta contenido en el string";
                break;
            }
        }
        System.out.println(msg);
    }
}