public class InverseString {
    public static void main(String[] args) {
        new InverseString();
    }

    public InverseString() {
        // 1. Invierte un String - FORMA CLASICA
        String text = "Verga";
        String res = "";

        //Hacemos un for cuyo indice valga la longitud de la cadena -1, pq length devuelve contando desde 1
        //El bucle lo hacemos al reves para que las posiciones sean decerecientes y se invierta la cadena
        for (int i = text.length()-1 ;i >= 0 ;i--) {

            res+=text.charAt(i);
        }
        System.out.println(res);
        System.out.println(text.length());

        // USANDO STRING BUILDER
        char [] charsText = text.toCharArray();
        res = new StringBuilder(new String(charsText)).reverse().toString();
        System.out.println(res);

    }
}