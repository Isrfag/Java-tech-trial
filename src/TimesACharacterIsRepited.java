public class TimesACharacterIsRepited {

    public static void main (String [] args) {
        new TimesACharacterIsRepited();
    }

    public TimesACharacterIsRepited () {

        //2. Dada una cadena de texto cuenta cuantas veces se repite un caracter

        String text = "iausioAAduhsdjqaaaddssdssSjjSA889092aa";
        String newText = "";
        char character = 'a';
        int counter = 0;
        for (int i = 0; i <= text.length() -1 ; i++) {

            if (text.charAt(i) == 'a') {
                counter++;
            }
        }

        System.out.println(counter);

    }
}
