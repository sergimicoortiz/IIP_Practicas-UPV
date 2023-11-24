package TrabajoFinal;

import java.util.Scanner;

class Caluladora {

    public static String mensajeFinal(String op, double resultado) {
        String msg = op + "=";
        int resultadoEntero = (int) resultado;
        return resultado - resultadoEntero == 0 ? msg + resultadoEntero : msg + resultado;
    }

    public static double calcula(String str) {
        str = str.replace(")", "").replace("(", "");
        double total = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
        }
        return 0;
    }

    public static double calculaSwitch(double n1, double n2, char op) {
        switch (op) {
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
            default:
                return n1 + n2;
        }
    }

    public static void desdeTeclado() {
        Scanner teclado = new Scanner(System.in);
        String operacion = "";
        do {
            System.out.print(">> ");
            operacion = teclado.nextLine().replace(" ", "");
            if (!operacion.equals("salir")) {
                System.out.println(mensajeFinal(operacion, 0));
            }
        } while (!operacion.equals("salir"));
        teclado.close();
    }

    public static void main(String[] args) {
        String[] datosPrueba = { "-2*-2", "-12.5/-2", "-12.5-3", "12.5+3.8", "(-2)*(-2)", "(-2)/(+(-5))", "(+5)-(-3)",
                "(-2.1)+(-0.9)" };

        for (int i = 0; i < datosPrueba.length; i++) {
            System.out.println(mensajeFinal(datosPrueba[i], 0));
        }
        // desdeTeclado();

    }
}