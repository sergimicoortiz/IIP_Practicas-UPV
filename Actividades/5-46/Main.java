import java.util.Scanner;

class Main {

    public static boolean hacenPareja(String s) {
        String sReplace = s.replace(" ", "");
        int numLetras = 0;
        int numNumeros = 0;
        for (int i = 0; i < sReplace.length(); i++) {
            char c = sReplace.charAt(i);
            try {
                Integer.parseInt(String.valueOf(c));
                numNumeros++;
            } catch (Exception e) {
                numLetras++;
            }
        }
        return numLetras == numNumeros;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.close();

        if (hacenPareja(s))
            System.out.println("Hay el mismo número de letras que de números");
        else
            System.out.println("No hay el mismo número de letras y números");

    }
}