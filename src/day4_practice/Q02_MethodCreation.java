package day4_practice;

import java.util.Scanner;

public class Q02_MethodCreation {
    /*
   cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz.
   Bilgi :
   1 m=100 cm
   1 km=10000 km
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Metre ve km'ye donusturmek istediginiz  cm degerini giriniz:");
        double santiMeterValue=scan.nextDouble();

        convertSM(santiMeterValue);

    }

    public static void convertSM(double santiMeterValue) {
        double meter=santiMeterValue/100;
        double kMeter=santiMeterValue/100000;
        System.out.println("Girdiginiz santimetre degeri :"+ santiMeterValue +": "+ meter+ " m dir, "+ kMeter+ " km dir.");
    }

}




