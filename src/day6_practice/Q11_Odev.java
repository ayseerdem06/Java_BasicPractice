package day6_practice;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {

        String pin="ayse.1234";
        int girisHakki=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("********HOSGELDİNİZ********");

        while (true){
            System.out.print("pin kodunuzu giriniz: ");
            String girilenPin=scan.nextLine();

            if(pin.equals(girilenPin)){
                System.out.println("Basarili giris yaptınız");
                break;
            }else {
                System.out.println("Yanlıs giris yaptınız..");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz: "+ girisHakki);
            }
            if(girisHakki==0){
                System.out.println("Giris hakkiniz kalmadı...bloklandiniz");
                break;
            }
        }

    }
}
