class Main {

    public static float potencia(float x, float y) {
        // comprobar que x no sea zero
        if (x == 0) {
            return 0f;
        }
        // comprobar que y sea entero
        int yEntero = (int) y;
        if (y - yEntero != 0.0) {
            return 0f;
        }

        float resultado = 1f;
        int yAbs = yEntero < 0 ? yEntero * -1 : yEntero;
        for (int i = 0; i < yAbs; i++) {
            resultado *= x;
        }
        if (y > 0) {
            return resultado;
        } else {
            return 1f / resultado;
        }
    }

    public static void main(String[] args) {
        System.out.println(potencia(3, 2));
        System.out.println(potencia(-3, 2));
        System.out.println(potencia(3, -2));
        System.out.println(potencia(3, 0));
    }
}