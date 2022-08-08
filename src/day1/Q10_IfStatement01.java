package day1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */

    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
       System.out.print("Lutfen Y/N ikilisinden birini giriniz :");
       char karakter= scan.next().charAt(0);

       if(karakter=='Y' || karakter=='y'){
           System.out.println("YES");
       }else if(karakter=='N' || karakter=='n'){
           System.out.println("NO");
       }else {
           System.out.println("Yanlis giris yaptiniz, lutfen sadece Y/N ikilisinden birini tercizh ediniz");
       }



      /* 2.COZUM YOLU

        Scanner scan=new Scanner(System.in);
        System.out.print("Y yada N harfinden birini giriniz :");
        String harf= scan.next();

        if(harf.equalsIgnoreCase("Y")){
            System.out.println("YES");
        }else if(harf.equalsIgnoreCase("N")){
            System.out.println("NO");
        }else System.out.println("Gecerli bir harf giriniz");

*/
    }



}
