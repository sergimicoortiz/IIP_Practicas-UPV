package TrabajoFinal;

import java.util.Scanner;

@SuppressWarnings("unused")
class Caluladora2 {

    public static String mensajeFinal(String op, double resultado) {
        String msg = op + "=";
        int resultadoEntero = (int) resultado;
        return resultado - resultadoEntero == 0 ? msg + resultadoEntero : msg + resultado;
    }

    public static double calcula(String str) {
        double total = 0;
        double numeroTmp = 0;
        int posIni = 0;
        int posFin = 0;
        char op = ' ';

        String strFinal = "0" + str.replace(" ", "").replace("(", "").replace(")", "")
                .replace("+-", "-").replace("--", "+").replace("-+", "-").replace("++", "+");
        while (posFin != strFinal.length() - 1) {
            char c = strFinal.charAt(posFin);
            if (c == '*' || c == '/' || c == '+' || c == '-') {
                System.out.println("--------------------");
                System.out.println(strFinal.substring(posIni, posFin));
                System.out.println(posIni + " " + posFin);
                numeroTmp = Double.parseDouble(strFinal.substring(posIni, posFin));
                if (posIni == 0) {
                    total = numeroTmp;
                } else {
                    total = calculaSwitch(total, numeroTmp, op);
                }
                op = c;
                posIni = posFin + 1;
            }
            posFin++;
        }
        numeroTmp = Double.parseDouble(strFinal.substring(posIni, posFin));
        total = calculaSwitch(total, numeroTmp, op);
        return total;
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
        System.out.println(calcula("0-12.5/-2"));
        // System.out.println(calcula("-12.5-3"));
        // System.out.println(calcula("12.5+3.8"));

    }
}