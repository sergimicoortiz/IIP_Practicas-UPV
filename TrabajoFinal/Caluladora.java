package TrabajoFinal;

import java.util.Scanner;

@SuppressWarnings("unused")
class Caluladora {

    public static String mensajeFinal(String op, double resultado) {
        String msg = op + "=";
        int resultadoEntero = (int) resultado;
        return resultado - resultadoEntero == 0 ? msg + resultadoEntero : msg + resultado;
    }

    // public static double calculaSinParentesis(String str) {
    // double numeroTmp = 0;
    // double total = 0;
    // int posIni = 0;
    // int posFin = 0;
    // while (posFin < str.length()) {
    // char c = str.charAt(posFin);
    // if (c == '*' || c == '/') {
    // numeroTmp = Double.parseDouble(str.substring(posIni, posFin));
    // System.out.println(numeroTmp);
    // if (total != 0) {
    // total = calculaSwitch(total, numeroTmp, c);
    // } else {
    // total = numeroTmp;
    // }
    // posIni = posFin + 1;
    // }
    // posFin++;
    // }
    // return total;
    // }

    // public static double calculaSinParentesis(String str) {
    // double numeroTmp = 0;
    // double total = 0;
    // char op = ' ';
    // int posIni = 0;
    // int posFin = 0;
    // while (posFin < str.length()) {
    // char c = str.charAt(posFin);
    // if (c == '*' || c == '/') {
    // op = c;
    // numeroTmp = Double.parseDouble(str.substring(posIni, posFin));
    // if (total == 0) {
    // total = numeroTmp;
    // }
    // posIni = posFin + 1;
    // }
    // posFin++;
    // }
    // return total;
    // }

    public static double calculaSinParentesis(String str) {
        String newStr = str.startsWith("-") ? "0" + str : str;
        double numeroTmp = 0;

        double total = 0;
        return total;
    }

    public static double calculaConParentesis(String str) {
        // separar por parentesis en una array
        double total = 0;
        return total;
    }

    public static double calcula(String str) {
        if (str.contains("(") || str.contains(")")) {
            return calculaConParentesis(str);
        } else {
            return calculaSinParentesis(str);
        }
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
                System.out.println(mensajeFinal(operacion, calcula(operacion)));
            }
        } while (!operacion.equals("salir"));
        teclado.close();
    }

    public static void main(String[] args) {
        String[] datosPrueba = { "-2*-2", "-12.5/-2", "-12.5-3", "12.5+3.8", "(-2)*(-2)", "(-2)/(+(-5))", "(+5)-(-3)",
                "(-2.1)+(-0.9)" };

        // for (int i = 0; i < datosPrueba.length; i++) {
        // System.out.println(mensajeFinal(datosPrueba[i], calcula(datosPrueba[i])));
        // }
        // desdeTeclado();

        // System.out.println(calcula("-2*-2"));
        System.out.println(calcula("-12.5/-2"));
        // System.out.println(calcula("-12.5-3"));
        // System.out.println(calcula("12.5+3.8"));

    }
}