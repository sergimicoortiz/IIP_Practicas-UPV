package Practicas.P4E2;

class Main {
  public static void main(String[] args) {
    float f1 = MyMethods.readFloat("Dame un float");
    float f2 = MyMethods.readFloat("Dame un float");
    float f3 = MyMethods.readFloat("Dame un float");
    MyMethods.show("El maximo de los 3 es", MyMath.max(f1, f2, f3));
    double a = MyMethods.readDouble("Dame la parte real");
    double b = MyMethods.readDouble("Dame la parte imaginaria");
    double mod = MyMath.modulo(a, b);
    double ang = MyMath.angulo(a, b);
    MyMethods.show("Modulo", mod);
    MyMethods.show("Angulo(radianes)", ang);
    MyMethods.show("Angulo", Math.toDegrees(ang));
    // Programe las llamadas a partir de aquí
  }
}

// Responda a partir aquí a la pregunta se indican en consideraciones

// No funciona porque debemos importarlo para poder utilizar la clase MyMath.