package day1;

import java.util.Scanner;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {

        int fiyat=10;

        if(fiyat<0){
            System.out.println("gecerli fiyat giriniz");
        }else  if(fiyat<10){
            System.out.println("ucuz");
        }else if(fiyat<20){
            System.out.println("normal");
        }else System.out.println("pahali");


        /* 2.COZUM YOLU

        int fiyat=25;

        String sonuc= fiyat<0 ? "Gecerli bir fiyat giriniz" : fiyat<10 ?
                    ("ucuz"): fiyat<20 ? "Normal" : "Pahalı";

        System.out.println("Sonuc : "+ sonuc);

         */
    }
}
