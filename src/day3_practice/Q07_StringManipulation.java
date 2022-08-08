package day3_practice;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //mesaj vermeden de konsol da girdi girilir
        String kelime = scan.next();
        System.out.println(kelime.length());
        if (kelime.length() == 4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersden :" + dort + uc + iki + bir);
        } else {
            System.out.println("Girdiginiz kelime uzunlugu 4 karakterden fazla");
        }


      /*2.cozum yolu :

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz: ");
        String kelime=scan.next();
        String tersKelime="";

        if(kelime.length()<=4){
            tersKelime=kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+
                        kelime.substring(0,1);
            System.out.println("String'in tersten yazilisi: " + tersKelime);
        }

       */
    }
}
