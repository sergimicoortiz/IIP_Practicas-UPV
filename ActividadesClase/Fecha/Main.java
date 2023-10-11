import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Dame una fecha en con el formato: DIA de MES de AÑO");
        Scanner teclado = new Scanner(System.in);
        String cadenaMes = teclado.nextLine().toLowerCase().trim();
        teclado.close();
        // String[] cadenaMesArr = cadenaMes.split(" ");
        // String day = cadenaMesArr[0];
        // String month = cadenaMesArr[2];
        // String year = cadenaMesArr[4];
        String day = cadenaMes.substring(0, cadenaMes.indexOf("de")).trim();
        String month = cadenaMes.substring(cadenaMes.indexOf("de") + 2,
                cadenaMes.lastIndexOf("de")).trim();
        String year = cadenaMes.substring(cadenaMes.lastIndexOf("de") + 2).trim();
        String monthString;
        if (day.length() == 1) {
            day = "0" + day;
        }
        switch (month) {
            case "enero":
                monthString = "01";
                break;
            case "febrero":
                monthString = "02";
                break;
            case "marzo":
                monthString = "03";
                break;
            case "abril":
                monthString = "04";
                break;
            case "mayo":
                monthString = "05";
                break;
            case "junio":
                monthString = "06";
                break;
            case "julio":
                monthString = "07";
                break;
            case "agosto":
                monthString = "08";
                break;
            case "septiembre":
                monthString = "09";
                break;
            case "octubre":
                monthString = "10";
                break;
            case "noviembre":
                monthString = "11";
                break;
            case "diciembre":
                monthString = "12";
                break;
            default:
                monthString = "MES INVALIDO";
                break;
        }
        System.out.println(day + "/" + monthString + "/" + year);
    }
}