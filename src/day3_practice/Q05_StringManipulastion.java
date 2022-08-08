package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("İsminizi ve Soyisminizi giriniz:\nisim:");
        String isim=scan.nextLine();
        System.out.println("Soyisim:");
        String  soyisim=scan.nextLine();

        if(isim.length()>soyisim.length()){
            System.out.println("İsminiz soyisminizden uzundur");
        }else if(isim.length()==soyisim.length()){
            System.out.println("İsminiz ve soyisminizin uzunlugu esittir");
        }else
            System.out.println("Soyisminiz isminizden uzundur");
    }
}
