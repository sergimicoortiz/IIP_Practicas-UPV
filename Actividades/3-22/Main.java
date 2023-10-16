import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca el número de un dia de la semana 1 al 7";
        System.out.println(msg1);
        int n = keyboard.nextInt();
        keyboard.close();
        String dia = "El número debe de ser del 1 al 7";
        switch (n) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;

            default:
                break;
        }
        System.out.println(dia);
    }
}