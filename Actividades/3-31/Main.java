import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg = "Introduzca un la cantidad de ";
        System.out.println(msg + "horas");
        int h = keyboard.nextInt();
        System.out.println(msg + "minutos");
        int m = keyboard.nextInt();
        System.out.println(msg + "segundos");
        int s = keyboard.nextInt();
        keyboard.close();

        // verificacion de los datos horas 0-23 min/seg 0-59
        if ((s > 59) || (s < 0)) {
            System.out.println("Los segundos deben de estar entre 0 y 59");
            System.exit(1);
        }
        if ((m > 59) || (m < 0)) {
            System.out.println("Los minutos deben de estar entre 0 y 59");
            System.exit(1);
        }
        if ((h > 23) || (h < 0)) {
            System.out.println("Las horas deben de estar entre 0 y 23");
            System.exit(1);
        }

        s++;
        if (s == 60) {
            s = 0;
            m++;
        }
        if (m == 60) {
            h++;
            m = 0;
        }
        if (h == 24) {
            h = 0;
        }

        // Formateamos los números para que tengan 2 caracteres
        String sString = Integer.toString(s);
        if (sString.length() == 1) {
            sString = "0" + sString;
        }
        String mString = Integer.toString(m);
        if (mString.length() == 1) {
            mString = "0" + mString;
        }
        String hString = Integer.toString(h);
        if (hString.length() == 1) {
            hString = "0" + hString;
        }

        System.out.println(hString + ":" + mString + ":" + sString);
    }
}