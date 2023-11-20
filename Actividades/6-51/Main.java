import java.util.Scanner;

class Main {

    // Leer un array desde teclado - PRIMERA VERSIÓN
    public static int[] leeArray() {
        Scanner input = new Scanner(System.in);
        int n; // Número de components.

        System.out.println("¿Cuántos enteros vas a introducir?");
        n = input.nextInt();

        int[] v = new int[n];
        System.out.println("Introduce " + n + " enteros:");
        for (int i = 0; i < v.length; i++)
            v[i] = input.nextInt();

        return v;
    }

    // Leer un array desde teclado - SEGUNDA VERSION
    public static void leeArray(int[] v) {
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce " + v.length + " enteros:");
        for (int i = 0; i < v.length; i++)
            v[i] = input.nextInt();
    }

    // Como tú puedes ver, tenemos dos métodos llamados 'leeArray',
    // cuando programas eso decimos que el método está "sobrecargado".
    // 1. Puedes explicarme brevemente ¿cuándo esta opción de sobrecarga puede
    // hacerse y las ventajas?
    // Tú respuesta:
    //
    //
    // 2.Los dos métodos hacen la misma tarea pero de forma diferente. El primero
    // crea y retorna el array; el segundo pide que tú primero crees
    // el array y lo uses como un parámetro con el fin de rellenarlo.
    // ¿Qué és exactamente retornado por el primer método? ¿Una referencia o un
    // array?
    // Tú respuesta:
    //
    //
    // Si el parámetro pasado es sólo por valor, ¿cómo es posible que el segundo
    // método funcione y de verdad modifique el array que hemos enviado?
    // Tú respuesta:
    //
    //

    // Imprimier el array
    static public void printArray(int[] v) {
        System.out.println("Los componentes del array son:");
        for (int i = 0; i < v.length; i++)
            System.out.println(v[i]);
    }
    // 3. ¿Qué es v? ¿Cuánta memoria usa? ¿Qué recibe cómo copia?.
    // Tú respuesta:
    //
    //

    public static void main(String[] args) {
        // Probando los dos métodos

        // First method
        System.out.println("Testeando el primer método ...");
        int[] v1 = leeArray(); // <---- Llamada al primer método
        printArray(v1);

        // Segundo método
        System.out.println("Testeando el segundo método...");
        Scanner input = new Scanner(System.in);
        int n; // Número de elementos

        System.out.println("¿Cuántos enteros vas a introducir?");
        n = input.nextInt();
        int[] v2 = new int[n];
        leeArray(v2); // <---- Llamando al segundo método
        printArray(v2);
    }
}