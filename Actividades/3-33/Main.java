import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg = "Introduzca la cordenada ";
        System.out.println(msg + "x");
        double x = keyboard.nextDouble();
        System.out.println(msg + "y");
        double y = keyboard.nextDouble();
        keyboard.close();
        int cuadrante = 0;
        if (x > 0) {
            if (y > 0) {
                cuadrante = 1;
            } else {
                cuadrante = 4;
            }
        } else if (x < 0) {
            if (y > 0) {
                cuadrante = 2;
            } else {
                cuadrante = 3;
            }
        }
        String resultado = cuadrante == 0 ? "No pertenece a ningun cuadrante" : "Percenece a Q" + cuadrante;
        System.out.println(resultado);

    }
}