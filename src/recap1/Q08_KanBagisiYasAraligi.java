package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {


		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("Yasinizi girin :");
        int yas=scan.nextInt();
        System.out.print("Kilonuzu girin :");
        int kilo=scan.nextInt();

        if(yas>0 && yas<18){
            System.out.println("yasi 18 den kücük olanlar kan bagisi yapamaz");
        }else if(yas>=18){
            if(kilo<50){
                System.out.println("kilonuz 50 den kucuk oldugu icin kan bagisi yapamazsınız");
            }else if(kilo>=50){
                System.out.println("kan bagisi yapabilirsiniz");
            }
        }
        }
/*
        2.Cozum Yolu :


        Scanner scan= new Scanner(System.in);
        System.out.print("Yasinizi girin :");
        int yas=scan.nextInt();
        System.out.print("Kilonuzu girin :");
        double kilo=scan.nextDouble();

        if(yas>0 && yas<18){
            System.out.println("Kan bagisi yapamazsin");
        }else if(yas>=18 && yas<=100){
            if(kilo<50){
                System.out.println("kilonuz 50 den kucuk oldugu icin bagisi yapamazsin");
            }else{
                System.out.println("Kan bagisi yapabilir");
            }
        }else if(yas>100){
            System.out.println("yasiniz kan bagisi yapmaya uygun degil");

    }
*/
}
