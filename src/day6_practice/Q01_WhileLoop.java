package day6_practice;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi girin: ");
        int sayi = scan.nextInt();

        basamaktoplama(sayi);

        System.out.println("Sayilarin basamaklarinin toplami: "+ basamaktoplama(sayi));
    }

    public static int basamaktoplama(int sayi) {
        int toplam = 0;

        while (sayi != 0) {
            toplam += sayi % 10;
            sayi++;
            sayi /= 10;
        }
        return toplam;
    }
}
          /* Method'suz 2 cozum yolu :

          int input=sayi;
          int basamak=0;
          int toplam=0;

          while (input>0){
              basamak=input%10;
              toplam+=basamak;
              input/=10;
          }
          System.out.println(sayi+"'nin basamak degerlerinin toplami: "+ toplam);

    */




