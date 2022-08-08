package day3_practice;

import java.util.Scanner;

public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("yapacaginiz dort islemi * + - / olarak seciniz :");
        char islem = scan.next().charAt(0);
        System.out.print("birinci sayi :");
        double num1 = scan.nextDouble();
        System.out.print("ikinci sayi :");
        double num2 = scan.nextDouble();
        hesapMakinesi(islem, num1, num2);
    }
    public static void hesapMakinesi(char islem, double num1, double num2) {
        if(islem=='+' || islem=='-' || islem=='*' || islem=='/'){
            switch (islem) {
                case '+':
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case '/':
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case '*':
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    break;
                //    default:
                //        System.out.println("hatali islem girisi");
            }
        }else System.out.println("hatali giris");


              /* 2.cozum yolu
        Scanner scan = new Scanner(System.in);
        System.out.print("İki sayi giriniz giriniz: \nsayi1:");
        int sayi1 = scan.nextInt();
        System.out.print("Sayi2:");
        int sayi2 = scan.nextInt();
        System.out.println("Toplama için +\\cikarma icin -\\carpma icin *\\ bolme ıcın / secenegini seciniz.");
        String karakter=scan.next();

        sayilarınToplami(sayi1,sayi2,karakter);
        sayilarinFarki(sayi1,sayi2,karakter);
        sayilarinCarpimi(sayi1,sayi2,karakter);
        sayilarinBolumu(sayi1,sayi2,karakter);


    }

    public static void sayilarinBolumu(int sayi1, int sayi2, String karakter) {
        double bolum=0;
        if(karakter.equals("/")){
            bolum=(double)sayi1/sayi2;   // veri kaybı yasamamak icin sayilardan birini double cast ettik.
            System.out.println("Sayiların bolumu: "+ bolum);
        }

    }

    public static void sayilarinCarpimi(int sayi1, int sayi2, String karakter) {
        int carpim=0;
        if(karakter.equals("*")){
            carpim=sayi1*sayi2;
            System.out.println("Sayilarin carpimi: "+ carpim);
        }

    }

    public static void sayilarinFarki(int sayi1, int sayi2, String karakter) {
        int fark=0;
        if(karakter.equals("-")){
            fark=sayi1-sayi2;
            System.out.println("Sayilarin farki : "+ fark);
        }
    }

    public static void sayilarınToplami(int sayi1, int sayi2, String karakter) {
        int toplam=0;
        if(karakter.equals("+")){
            toplam=sayi1+sayi2;
            System.out.println("Sayilarin toplami: "+ toplam);
        }


        */






    }
}