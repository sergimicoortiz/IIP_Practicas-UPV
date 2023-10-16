import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Lee
        Scanner tec = new Scanner(System.in);
        String s = tec.nextLine();

        try {
            int i = Integer.parseInt(s);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("La cadena: " + s + " no es un int");
            // En caso de no ser int da la exepcion: java.lang.NumberFormatException
        }

        // cerramos teclado
        tec.close();
    }
}