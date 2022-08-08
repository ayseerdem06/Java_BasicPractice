package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("boyunuzu cm olarak girin:");
        double boy= scan.nextDouble()/100;
        System.out.println("kilonuzu kg olarak girin: ");
        double kilo=scan.nextDouble();
        double bmi=kilo/(boy*boy);
        if(bmi<=20){
            System.out.println("bmi indexinizi "+bmi + " oldukca zayifsiniz");
         } else if(bmi<=25){
            System.out.println("bmi indexinizi "+bmi + " Normal sinirlardasiniz");
         }else if(bmi<=30){
            System.out.println("bmi indexinizi "+bmi + " Sisman kategorisindesiniz");
         }else if(bmi>30){
            System.out.println("bmi indexinizi "+bmi + " Obez grubundasiniz");
        }

         /*
         2.Cozum Yolu:

        Scanner scan= new Scanner(System.in);
        System.out.print("boyunuzu cm olarak girin :");
        double boy=scan.nextDouble();
        boy/=100;

       System.out.print("kilonuzu kg olarak girin :");
        double kilo=scan.nextDouble();
        double bmi= kilo/(boy*boy);
        System.out.println("bmi = " + bmi);

        if(bmi<=20){
            System.out.println("Oldukca zayifsiniz");
        }else if(bmi<=25){
            System.out.println("Normal sinirlardasiniz");
        }else if(bmi<=30){
            System.out.println("Sisman kategorisindesiniz");
        }else if(bmi>=30){
            System.out.println("Obez grubundasiniz");
        }

        */

    }

}
