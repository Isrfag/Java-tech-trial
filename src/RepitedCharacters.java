public class RepitedCharacters {

    public static void main (String args []){
        new RepitedCharacters("Sangreeea");
    }

    public RepitedCharacters (String word) {

        //5 Dada una palabra di si tiene caracteres repetidos.

        int length = word.length();
        int counter [] = new int [256];

        for (int i =0;i<word.length();i++) {

            counter[word.charAt(i)]++;
        }

        for (int i =0;i<256;i++) {

            //Ahora ya no es distinto de 0 pq necesitamos que este mas de una vez en la palabra.
            if(counter[i]>1) {
                System.out.printf((char) i + " : " + counter[i] + "\n");
            }
        }
    }
}
