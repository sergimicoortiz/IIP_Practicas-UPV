import java.util.Scanner;

class Contacto { // Definición de la Tupla
    String nombre;
    String direccion;
    int edad;
    String email;
    boolean esAtractivo;
}

class Main {

    // Retornar un nuevo contacto
    // pidiendo información del mismo por teclado.
    public static Contacto nuevoContacto() {
        Scanner input = new Scanner(System.in);
        Contacto c = new Contacto();

        System.out.println("Nombre:");
        c.nombre = input.nextLine();

        System.out.println("Dirección:");
        c.direccion = input.nextLine();

        System.out.println("email:");
        c.email = input.nextLine();

        System.out.println("Es él/ella atractivo/a? (S/N)");
        char atractivo = input.nextLine().charAt(0);
        if (atractivo == 's' || atractivo == 'S') {
            c.esAtractivo = true;
        } else {
            c.esAtractivo = false;
        }

        System.out.println("Edad:");
        c.edad = input.nextInt();

        return c;
    }

    // Imprimir contacto
    public static void printContacto(Contacto c) {
        String str = "";
        str += "Nombre: " + c.nombre + "\n";
        str += "Dirección: " + c.direccion + "\n";
        str += "Edad: " + c.edad + "\n";
        str += "Email: " + c.email + "\n";
        str += c.esAtractivo ? "Es atractivo" : "NO es atractivo";
        System.out.println(str);
        // Escriebe el resto de código para que imprima toda la información del contacto
        // incluyendo si él/ells es atractivo o no;)

    }

    public static void printAllContacto(Contacto[] contactos) {
        for (int i = 0; i < contactos.length; i++) {
            printContacto(contactos[i]);
            System.out.println("------------------------");
        }
    }

    public static int indicePorNombre(Contacto[] contactos, String nombre) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i].nombre.equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Hagamos las cosas un poco más desafiantes.
        int numeroContactos;
        Scanner input = new Scanner(System.in);

        // ¿Cuántos contactos?
        System.out.println("¿Cuántos contactos vas a introducir?");
        numeroContactos = input.nextInt();

        // Creando el array de contactos
        Contacto[] contactos = new Contacto[numeroContactos];

        System.out.println("Introduce los contactos uno por uno.");
        for (int i = 0; i < numeroContactos; i++) {
            System.out.println("Dame el dato del contacto " + i + " :");
            contactos[i] = nuevoContacto();
        }

        // Imprime todos los contactos
        // Escribe y completa tu código aquí...
        printAllContacto(contactos);

        // Encontrar un contacto
        // ¿Alguien de tus contactos es 'Jordi'?
        // Escribe y completa tu código aquí
        int indiceJordi = indicePorNombre(contactos, "Jordi");
        if (indiceJordi == -1) {
            System.out.println("No existe nadie con el nombre Jordi");
        } else {
            System.out.println("Información sobre el contacto de Jordi: ");
            printContacto(contactos[indiceJordi]);
        }
        input.close();
    }
}