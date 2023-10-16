import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca su nota";
        System.out.println(msg1);
        double nota = keyboard.nextDouble();
        keyboard.close();
        String resultado = "";
        if (nota > 10 || nota < 0) {
            System.out.println("La nota debe de ser entre 0 y 10");
            System.exit(1);
        }
        if (nota < 3) {
            resultado = "Muy deficiente";
        }
        if ((nota >= 3) && (nota < 4)) {
            resultado = "Deficiente";
        }
        if ((nota >= 4) && (nota < 5)) {
            resultado = "Insuficiente";
        }
        if ((nota >= 5) && (nota < 6)) {
            resultado = "Suficiente";
        }
        if ((nota >= 6) && (nota < 7)) {
            resultado = "Bien";
        }
        if ((nota >= 7) && (nota < 9)) {
            resultado = "Notable";
        }
        if ((nota >= 9) && (nota < 10)) {
            resultado = "Sobresaliente";
        }
        if (nota == 10) {
            resultado = "Matrícula de Honor";
        }
        System.out.println(resultado);
    }
}