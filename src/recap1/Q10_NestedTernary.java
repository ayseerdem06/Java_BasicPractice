package recap1;

import java.util.Scanner;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
       char finalNotu='B';
       String result=finalNotu=='A' ? "Gayet basarili" : finalNotu=='B' ?
                    "Basarili" : finalNotu=='C' ?  "Ha gayret" : "Diğeleri";

        System.out.println("result = " + result);


       /*
        2.Cozum Yolu:

        int not= 50;

        String sonuc= not>85 ? "Gecme notunuz:A Gayet Basarili" : not>70 ?
                "Gecme notunuz:B  Basarili" : not>60 ?
                "Gecme notunuz:C Ha gayret" : "Biraz daha gayret etmelisin" ;

        System.out.println(sonuc);

        */

    }

 }
