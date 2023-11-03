package Practicas.P2E3;

/* Práctica 2. Ejercicio 3 
  Estructura de selección switch
*/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Creación teclado para entrada de datos desde consola
        Scanner tec = new Scanner(System.in);

        // Bloque entrada de datos lectura en formato char : Subparte 1
        System.out.println("Introduzca una letra: ");
        char letra = tec.nextLine().trim().toLowerCase().charAt(0);
        // Programe aquí el switch de la Parte 1
        String tipoLetra = "No es una letra";
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                tipoLetra = "vocal";
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'ñ':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                tipoLetra = "consonante";
                break;

        }
        System.out.println(tipoLetra);
        // Bloque entrada de datos lectura en formato String : Subparte 2
        System.out.println("Introduzca una letra: ");

        // Programe aquí el switch de la Parte 2

        String letra2 = tec.nextLine().trim().toLowerCase();
        String tipoLetra2 = "No es una letra";
        switch (letra2) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                tipoLetra2 = "vocal";
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "ñ":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                tipoLetra2 = "consonante";
                break;
        }
        System.out.println(tipoLetra2);

        // Entrada de datos en formato char: Parte 3
        System.out.println("Introduzca una letra, un número o un símbolo");

        // Programe aquí la estructura de selección de la Parte 3

        char letra3 = tec.nextLine().trim().toLowerCase().charAt(0);
        tec.close();
        String tipoLetra3 = "";
        switch (letra3) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                tipoLetra3 = "vocal";
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'ñ':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                tipoLetra3 = "consonante";
                break;
            default:
                try {
                    Integer.parseInt(String.valueOf(letra3));
                    tipoLetra3 = "numero";
                } catch (Exception e) {
                    tipoLetra3 = "simbolo";
                }
                break;
        }
        System.out.println(tipoLetra3);
    }
}
