import java.math.BigInteger;

class Main {

    // Fibonacci recursive version
    public static long fibR(long f) {
        if (f < 2)
            return 1;
        else
            return fibR(f - 1) + fibR(f - 2);
    }

    // Fibonacci versión iteractiva
    public static long fibI(long f) {
        long n1 = 1;
        long n2 = 1;
        for (int i = 2; i <= f; i++) {
            long suma = n1 + n2;
            n1 = n2;
            n2 = suma;
        }
        return n2;
    }

    // Fibonacci versión iteractiva V2
    public static double fibI2(long f) {
        double n1 = 1;
        double n2 = 1;
        for (int i = 2; i <= f; i++) {
            double suma = n1 + n2;
            n1 = n2;
            n2 = suma;
        }
        return n2;
    }

    // Fibonacci versión iteractiva V3
    public static BigInteger fibI3(long f) {
        BigInteger n1 = new BigInteger("1");
        BigInteger n2 = new BigInteger("1");
        for (int i = 2; i <= f; i++) {
            BigInteger suma = n1.add(n2);
            n1 = n2;
            n2 = suma;
        }
        return n2;
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci of 10 is " + fibR(10));
        System.out.println("Fibonacci of 10 is " + fibI3(10));
        // System.out.println("Fibonacci of 50 is " + fibR(50));
        System.out.println("Fibonacci of 10000 is " + fibI3(10000));

    }
}

// 1. ¿Cuál es el resultado de fibR(10)? ¿Cuánto tarda aproximadamente?
// Responde aquí:
// 89 1s

// 2. ¿Cuál es el resultado de fibR(50)? ¿Cuánto tarda aproximadamente?
// Responde quí:
// 20365011074 más de 1m casi 2m

// 3. ¿Qué sucede cundo calcula fibR(10000)? (Mira el primer mensaje en tu
// consola en repl.it)
// ¿Cuál piensas es el problema?
// Responde aquí
// Da la exepción java.lang.StackOverflowError

// 4. Escribe la versión iterativa de Fibonacci (fibI) -> en el texto del
// problema tienes alguna ayuda ...

// 5. Prueba fibI(50).... ¿alguna diferencia? (el resultado tiene que ser el
// mismo)
// El resultado es el mismo pero solamente tarda 1s

// 6. Está ejecutándose fibI(10000)? ¿Por qué? ¿Cuál es el problema ahora?
// Ejecuta pero el resultado no es el esperado ya que el resultado es demasiado
// grande para ser guardado en un long y por tanto da la vuelta y nos retorna un
// número negativo.

// 7. (Para estudiantes avanzados) Si has detectado la solución a la cuestión 6,
// ¿por qué no pruebas a usar un tipo de datos
// double en vez de long para cada dato? ¿Qué sucede entonces? Si tenemos el
// mismo problema ... entonces ¿nos derrotamos?
// Si utilizamos double como tipo de dato el resultado sigue siendo demasiado
// grande solo que esta vez el resultado es Infinity. Si queremos utilizar
// números más grandes que un long debemos utilizar BigInteger