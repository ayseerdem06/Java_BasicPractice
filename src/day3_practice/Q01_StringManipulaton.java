package day3_practice;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */

       public static void main(String[] args) {

           Scanner scan= new Scanner(System.in);
           System.out.println("Cumle olusturmak için 4 Kelime giriniz :");
           String str1= scan.next().toLowerCase(),  str2= scan.next().toLowerCase(),
                   str3= scan.next().toLowerCase(), str4= scan.next().toLowerCase();
           String sonuc=str1.toUpperCase().charAt(0)+str1.substring(1)+ " "+ str2+ " "+ str3+ " " + str4+ ".";
           System.out.println("Output"+ sonuc);


           /*
           2.Cozum yolu

        Scanner scan = new Scanner(System.in);
        System.out.println("cumle olusturmak icin birinci kelimeyi giriniz: ");
        String str1 = scan.next().toLowerCase();
        System.out.println("cumle olusturmak icin ikinci kelimeyi giriniz: ");
        String str2 = scan.next().toLowerCase();
        System.out.println("cumle olusturmak icin ucuncu kelimeyi giriniz: ");
        String str3 = scan.next().toLowerCase();
        System.out.println("cumle olusturmak icin dorduncu kelimeyi giriniz: ");
        String str4 = scan.next().toLowerCase();
        System.out.println(str1.substring(0,1).toUpperCase() + str1.substring(1) +
                " " + str2+ " " +str3+ " "+str4 + ".");
            */
       }
}
