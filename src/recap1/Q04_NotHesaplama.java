package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {

        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        public static void main(String[] args) {

           Scanner scan = new Scanner(System.in);
           int vize1;
           int vize2;
           int finalNot;
            System.out.print("Vize1 notunu girin: ");
            vize1= scan.nextInt();
            System.out.print("Vize2 notunu girin: ");
            vize2= scan.nextInt();
            System.out.print("Final notunu girin: ");
            finalNot= scan.nextInt();

            double sonuc= ((vize1+vize2)/2)*0.3 + finalNot*0.7;
            System.out.println("sonuc = " + sonuc);

        }

}
