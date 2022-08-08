package day5_practice;

import java.util.Scanner;

public class Q01_ForLoop {

     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Harf giriniz: ");
        String harf=scan.next().toLowerCase();

        String sesliHarf="aeiou";
        String sessizHarfler="bcdfghjklmpqrstxvwyz";

        if(harf.length()==1){
            for (int i = 0; i <sesliHarf.length() ; i++) {
                if(sesliHarf.contains(harf)){
                    System.out.println("sesli harf");
                    break;
                }else if(sessizHarfler.contains(harf)){
                    System.out.println("sessiz harf");
                    break;
                }else {
                    System.out.println("Yanlis karakter girdiniz.");
                }

            }
        }else System.out.println("tek karakter girdiniz.");



        /* 2.cozum yolu

        Scanner scan=new Scanner(System.in);
        System.out.print("Harf giriniz: ");
        String harf=scan.next().toLowerCase();
        String sesliHarf="aeiou";


        for (int i = 0; i <harf.length() ; i++) {
            if(harf.length()>1){
                System.out.println("Yanlis karakter girdiniz!");
                break;
            }else if (harf.length()<2 && harf.contains(sesliHarf.substring(i,i+1))){
                System.out.println(harf+ " harfi sesli harftir");
                break;
            }else System.out.println(harf+ " harfi sessiz harftir");
                break;


        }

*/
    }
}
