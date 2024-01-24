public class NumCapicuo {

    public static void main (String [] args) {
        new NumCapicuo(523);
    }

    public NumCapicuo (int num) {

        //3. Dado un numero comprueba que sea capicuo

        String num1S = String.valueOf(num);// Forma de convertir a String en JAVA
        String invertNum1 = "";


        for (int index = num1S.length() -1 ;index>=0; index--) {

            invertNum1+=num1S.charAt(index);

        }

        if (num1S.equals(invertNum1)) {
            System.out.println("El numero " + num + " es capicuo." );
        }else {
            System.out.println("El numero " + num + " no es capicuo.");
        }


    }
}
