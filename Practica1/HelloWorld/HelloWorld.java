import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String name = keyboard.nextLine();
        System.out.println("Buenas tardes " + name);
        keyboard.close();
    }
}