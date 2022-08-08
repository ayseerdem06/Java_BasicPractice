package recap1;

import java.util.Scanner;

public class Q05_Scanner {


    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a sayisini giriniz :");
        a=scan.nextDouble();
        System.out.println("b sayisini giriniz :");
        b= scan.nextDouble();
        System.out.println("c sayisini giriniz :");
        c=scan.nextDouble();

        double sonuc=((a*a)-(b*b))/(3*c);
        System.out.println("sonuc = " + sonuc);


       /*
       2.Cozum Yolu

        Scanner scan=new Scanner(System.in);
        System.out.println("a sayisinin giriniz:");
        int a=scan.nextInt();
        System.out.println("b sayisinin giriniz:");
        int b=scan.nextInt();
        System.out.println("c sayisinin giriniz:");
        int c=scan.nextInt();

        double sonuc= (double) ((a*a)-(b*b))/(c*3); // int den double da veri kaybı yasanabilir
        System.out.println("sonuc = " + sonuc);
        */

    }


}
