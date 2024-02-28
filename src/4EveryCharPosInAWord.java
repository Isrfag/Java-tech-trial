public class EveryCharPosInAWord {

    public static void main (String args[]) {
        new EveryCharPosInAWord("Hedionda");
    }

    public EveryCharPosInAWord (String word) {

        //4. Dada una palabra que el programa te diga cuantas veces se repiten sus caracteres

        //Vamos a empezar creando un array que reuna todos los caraceteres de la A-Z y un contador

        int i, length;
        int counter [] = new int[256]; // Creamos el array con todos los caracters del codigo Ascii

        length = word.length();

        for (i=0; i < length ; i++) {
            counter[word.charAt(i)]++; //Contador en la poscion del caracter con char at que nos devuelve el caracter
            //El contador suma la cantidad de veces que encuentra el caracter, que recibe como codigo ascii es decir
            //numericamente.
            //ej 106 es m ,pues mete 1 en la posicion 106 del array, si vuelve a ser 106 suma 2 y asi
        }

        for (i=0;i<256;i++){

            if(counter[i]!=0){ //Es decir si en esta posicion tienes de mas de 0 me lo sacas.

                System.out.println((char)i + " : " + counter[i]); //La iteraccion va atraer las posciones del array
                //que coincidan y al pasarlas a char se vuelven letras luego las sumas a el conteindo de la pos del
                //array que es el numero de veces que aparece

            }
        }

    }
}
