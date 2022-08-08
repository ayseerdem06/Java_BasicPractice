package recap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("5 basamaklı bir sayi giriniz: ");
        int num=scan.nextInt();

        int ilkIki=num/1000; // ilk iki rakamı verir
        int sonIki=num%100; // 100'e bölünenden kalanı verir

        int ilkIkiTop=(ilkIki/10)+(ilkIki%10); // ilk isi sayinin basamaklarını toplar
        int sonIkiTop=(sonIki/10)+(sonIki%10); // son iki sayının basamaklarını toplar
        System.out.println("Sayiların toplami: " +(ilkIkiTop+sonIkiTop));

    // Kalanı bulmak için % kullanırız.Sayinin / demek bir basamaktan kurtulmak demek


       /* 2.cozum yolu

       Scanner scan=new Scanner(System.in);
       System.out.print("5 basamaklı bir sayi giriniz: ");
       int sayi=scan.nextInt();
       int ilk=sayi%10;// 1.basamak
       sayi=sayi/10;
       int ikinci=sayi%10;// 2.basamak
       sayi=sayi/10;
        int ucuncu=sayi%10; // 3.basamak
        sayi=sayi/10;
        int dorduncu=sayi%10; //4.basamak
        sayi=sayi/10;
        int besıncı=sayi%10; //5.basamak
        sayi=sayi/10;

        System.out.println("Toplam: "+ (ilk+ikinci+dorduncu+besıncı));

*/

    }



}
