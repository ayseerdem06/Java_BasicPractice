package recap2;

import java.util.Scanner;

public class Q08_StringManipulation {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin, degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String kelime= scan.next();

        if(kelime.length()>=3){
            String substring = kelime.substring(kelime.length() - 2);
            System.out.print(substring.concat(substring.concat(substring)));
            // System.out.print(substring+substring+substring); // diğer birlestirme yolu

        }else {
            System.out.println(kelime);
        }




    }
}
