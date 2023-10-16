import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        Scanner keyboard = new Scanner(System.in);
        String msg1 = "Introduzca una cantidad de segundos";
        System.out.println(msg1);
        int seg = keyboard.nextInt();
        int seg_total = seg;
        keyboard.close();
        int min = seg / 60;
        seg = seg % 60; // Segundos restantes
        int horas = min / 60;
        min = min % 60; // min restantes
        int dias = horas / 24;
        horas = horas % 24;

        System.out.println(
                "En " + seg_total + " tenemos " + dias + " días, " + horas + " horas, " + min + " minutos y " + seg
                        + " segundos");
    }
}