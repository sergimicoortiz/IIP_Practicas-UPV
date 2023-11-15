class Main {

    public static int encontrarCaracter(String s, char c, int position) {
        //primero tenemos que mirar si la posicion que estamos buscando esta dentro de la length del string si no el charAt da error
        if (position > s.length() - 1) {
            return -1;
        }

        if (s.charAt(position) == c) {
            return position;
        }
        return encontrarCaracter(s, c, position + 1);
    }

    public static void main(String[] args) {
        System.out.println(encontrarCaracter("Hola Mundo !", '!', 0));
        System.out.println(encontrarCaracter("Hola Mundo!", 'q', 0));
    }
}