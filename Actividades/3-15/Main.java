class Main {
    public static void main(String[] args) {
        // Escribe tu código aquí
        int min = 1;
        int max = 6;
        int dado = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println("El dado ha sacadu un: " + dado);
    }
}