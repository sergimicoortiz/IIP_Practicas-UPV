class Main {

    // Implement vecesCaracterEstaIterativa
    public static int vecesCaracterEstaIterativa(String str, char c) {
        int cont = 0;
        for (int i = 1; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                cont++;
            }
        }
        return cont;
    }

    // Implement vecesCaracterEstaRecursiva

    // si el caracter que esta en la pocicion pos no es el que buscamos lo
    // remplazamos por un espacio, de esta forma al terminar de recorrer el str
    // simplemente podemos remover los espacios y quedarnos un string que solo
    // contenga el char que buscamos por lo que simplemente nos quedaria realizar un
    // length
    public static int vecesCaracterEstaRecursiva(String str, char c, int pos) {
        if (pos >= str.length()) {
            return str.replace(" ", "").length();
        }
        char cPos = str.charAt(pos);
        if (c != cPos) {
            str = str.replace(cPos, ' ');
        }
        return vecesCaracterEstaRecursiva(str, c, pos + 1);
    }

    public static void main(String[] args) {
        // Chequeamos los métodos implementado por ejemplo,...
        System.out.println(vecesCaracterEstaIterativa("Hola amic amable", 'a'));
        System.out.println(vecesCaracterEstaRecursiva("Hola amic amable", 'a', 0));
        // // Date cuenta del parámetro extra
    }
}