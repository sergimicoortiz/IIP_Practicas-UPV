import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca un año";
        String msg2 = "Introduzca un mes";
        System.out.println(msg1);
        int anyo = keyboard.nextInt();
        System.out.println(msg2);
        int mes = keyboard.nextInt();
        keyboard.close();
        boolean bisiesto = (anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0));
        int diasMes = 31;
        switch (mes) {
            case 2:
                diasMes = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
        }
        if ((diasMes == 28) && bisiesto) {
            diasMes = 29;
        }
        System.out.println("Este mes contiene " + diasMes + " dias");
    }
}