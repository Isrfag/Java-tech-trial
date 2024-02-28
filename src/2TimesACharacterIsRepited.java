public class TimesACharacterIsRepited {

    public static void main (String [] args) {
        new TimesACharacterIsRepited('s');
    }

    public TimesACharacterIsRepited (char character ) {

        //2. Dada una cadena de texto cuenta cuantas veces se repite un caracter

        String text = "iausioAAduhsdjqaaaddssdssSjjSA889092aa";
        String newText = "";
        int counter = 0;
        for (int i = 0; i <= text.length() -1 ; i++) {

            if (text.charAt(i) == character) {
                counter++;
            }
        }

        System.out.println(counter);

    }
}
