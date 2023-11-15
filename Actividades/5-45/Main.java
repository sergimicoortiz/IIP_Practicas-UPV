class Main {

    public static String cambiandoString(String s) {
        // Escribe aquí tu código
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'Z') {
                // entonces c es minuscula
                str += String.valueOf(c).toUpperCase();
            } else {
                str += String.valueOf(c).toLowerCase();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(cambiandoString("Hola Amic Meu"));
    }
}