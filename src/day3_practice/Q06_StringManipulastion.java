package day3_practice;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int bosluk = str.indexOf(' ');
        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");
        }


     /*   2 .çcozum yolu :

        Scanner scan= new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str=scan.nextLine();
        String sonuc="";

      if(str.contains(" ")){
          System.out.println("String'de bosluk karakteri var");
      }

      if(str.isEmpty()){
          System.out.println(true);
      }else System.out.println(false);

      */
    }
}
