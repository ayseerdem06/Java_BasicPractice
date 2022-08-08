package day11_interviewQuestions;

import java.util.Scanner;

public class Q03 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    //bunu kart sifre kontrol de de kullabilirinisz
    public static void main(String[] args) {

        int girisSayisi=3;
        String sifre="ab123.12";

        Scanner scan= new Scanner(System.in);

        String girilenSifre=" ";

        while(true){
            System.out.println("Sifre giriniz");
            girilenSifre=scan.nextLine();

            if(sifre.equals(girilenSifre)){
                System.out.println("Sifreniz dogru basarili giris yaptınız");
                break;
            }else{
                System.out.println("Sifreniz yanlıs");
                girisSayisi--;
                System.out.println("Kalan giris hakkın " + girisSayisi);
            }
            if(girisSayisi==0){
                System.out.println("Giris hakkınız kalmadı, Kartınız bloke oldu"+ girisSayisi);
                break;
            }



        }
    }
}
