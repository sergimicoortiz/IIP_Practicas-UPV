package TrabajoFinal;

import java.util.Scanner;

class Caluladora {

    public static String mensajeFinal(String op, double resultado) {
        String msg = op + "=";
        int resultadoEntero = (int) resultado;
        return resultado - resultadoEntero == 0 ? msg + resultadoEntero : msg + resultado;
    }

    public static double forRestar(String str) {
        str = "0" + str;
        String[] aRestar = str.split("\\-");
        if (aRestar.length == 1)
            return Double.parseDouble(aRestar[0]);
        double total = 0;
        for (int i = 0; i < aRestar.length; i++) {
            double num = Double.parseDouble(aRestar[i]);
            if (i == 0) {
                total = num;
            } else {
                total -= num;
            }
        }
        return total;
    }

    public static double forSuma(String str) {
        str = "0" + str;
        String[] aSumar = str.split("\\+");
        if (aSumar.length == 1)
            return forRestar(aSumar[0]);
        double total = 0;
        for (int i = 0; i < aSumar.length; i++) {
            double num = forRestar(aSumar[i]);
            if (i == 0) {
                total = num;
            } else {
                total += num;
            }
        }
        return total;
    }

    public static double forMultiplicacion(String str) {
        str = "0" + str;
        String[] aMultiplicar = str.split("\\*");
        if (aMultiplicar.length == 1)
            return forSuma(aMultiplicar[0]);
        double total = 0;
        for (int i = 0; i < aMultiplicar.length; i++) {
            double num = forSuma(aMultiplicar[i]);
            if (i == 0) {
                total = num;
            } else {
                total *= num;
            }
        }
        return total;
    }

    public static double forDivision(String str) {
        str = "0" + str;
        String[] aDividir = str.split("\\/");
        if (aDividir.length == 1)
            return forMultiplicacion(aDividir[0]);
        double total = 0;
        for (int i = 0; i < aDividir.length; i++) {
            double num = forMultiplicacion(aDividir[i]);
            if (i == 0) {
                total = num;
            } else {
                total /= num;
            }
        }
        return total;
    }

    public static double calcula(String str) {
        String strFinal = str.replace(" ", "").replace("(", "").replace(")", "")
                .replace("+-", "-").replace("--", "+").replace("-+", "-").replace("++", "+");

        return forDivision(strFinal);
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
        // String[] datosPrueba = { "-2*-2", "-12.5/-2", "-12.5-3", "12.5+3.8",
        // "(-2)*(-2)", "(-2)/(+(-5))", "(+5)-(-3)",
        // "(-2.1)+(-0.9)" };

        // for (int i = 0; i < datosPrueba.length; i++) {
        // System.out.println(mensajeFinal(datosPrueba[i], calcula(datosPrueba[i])));
        // }
        desdeTeclado();
        // TODO: revisar prioridades de operaciones 1+(2*2) deberia de ser 5 pero da 6
        // ocurre por quitar los parentesis
        // TODO: añadir potencias
        // TODO: constrol de errores (sobretood en la division por 0)

    }
}