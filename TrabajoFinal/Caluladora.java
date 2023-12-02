package TrabajoFinal;

import java.util.Scanner;

class Caluladora {

    public static String mensajeFinal(String op, double resultado) {
        String msg = op + "=";
        int resultadoEntero = (int) resultado;
        return resultado - resultadoEntero == 0 ? msg + resultadoEntero : msg + resultado;
    }

    public static String replaceOperadores(String str) {
        return str.replace("+-", "-").replace("--", "+").replace("-+", "-").replace("++", "+");
    }

    public static boolean contieneParentesis(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                return true;
            }
        }
        return false;
    }

    public static int[] posOpenClose(String str) {
        int posOpen = -1;
        int posClose = -1;
        int cont = 0;
        int[] toReturn = new int[2];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                cont++;
            }
            if (c == ')') {
                cont--;
            }
            if (posOpen == -1 && c == '(') {
                posOpen = i;
            }
            if (posClose == -1 && c == ')' && cont == 0) {
                posClose = i;
            }
        }
        toReturn[0] = posOpen;
        toReturn[1] = posClose;
        return toReturn;
    }

    public static double calcularParentesis(String str) {
        while (contieneParentesis(str)) {
            int[] openClose = posOpenClose(str);
            String strParentesis = str.substring(openClose[0] + 1, openClose[1]);
            double resultado = calcula(strParentesis);
            str = str.replace("(" + strParentesis + ")", String.valueOf(resultado));
            str = replaceOperadores(str);
        }
        return calcula(str);
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
            if (num == 0) {
                System.out.println("No puedes dividir por zero");
                System.exit(1);
            }
            if (i == 0) {
                total = num;
            } else {
                total /= num;
            }
        }
        return total;
    }

    public static double forPotencias(String str) {
        str = "0" + str;
        String[] aPotencia = str.split("\\^");
        if (aPotencia.length == 1)
            return forDivision(aPotencia[0]);
        double total = 0;
        for (int i = 0; i < aPotencia.length; i++) {
            double num = forDivision(aPotencia[i]);
            if (i == 0) {
                total = num;
            } else {
                total = Math.pow(total, num);
            }
        }
        return total;
    }

    public static double calcula(String str) {
        // divisio=>multiplicacio=>suma=>resta
        if (contieneParentesis(str)) {
            return calcularParentesis(str);
        }
        return forPotencias(str);
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
        try {
            // String[] datosPrueba = { "-2*-2", "-12.5/-2", "-12.5-3", "12.5+3.8",
            // "(-2)*(-2)", "(-2)/(+(-5))", "(+5)-(-3)",
            // "(-2.1)+(-0.9)" };

            // for (int i = 0; i < datosPrueba.length; i++) {
            // System.out.println(mensajeFinal(datosPrueba[i],
            // calcula(datosPrueba[i])));
            // }

            desdeTeclado();
        } catch (Exception e) {
            String eClass = e.getClass().getName();
            if (eClass.equals("java.lang.NumberFormatException")) {
                System.out.println("Error al parsear el string");
            } else {
                System.out.println("Ha ocurrido un error");
            }
            System.exit(1);
        }
    }
}