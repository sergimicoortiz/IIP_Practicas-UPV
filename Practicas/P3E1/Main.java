import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String txt = tec.nextLine();
        tec.close();

        // Código con bucle while
        String txtInv = "";
        int txtL = txt.length() - 1;
        while (txtL >= 0) {
            txtInv += txt.charAt(txtL);
            txtL--;
        }

        System.out.println(txtInv);

        // Código con bucle for
        txtInv = "";
        for (int i = txt.length() - 1; i >= 0; i--) {
            txtInv += txt.charAt(i);
        }
        System.out.println(txtInv);

    }
}
