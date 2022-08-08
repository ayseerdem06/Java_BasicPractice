package recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin,
    // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("isiminiz ve soyisminizi giriniz : ");
        String firstname=scan.nextLine(),lastName=scan.nextLine();
        String fullName=firstname.concat(" "+lastName).toUpperCase();
        System.out.println("fullName = " + fullName);



   /*
        2.Cozum Yolu :

        Scanner scan= new Scanner(System.in);
        System.out.println("isiminiz ve soyisminizi giriniz : ");
        String name= scan.nextLine();
        String LastName= scan.nextLine();

        System.out.println(name.concat(" "+ lastName).toUpperCase());
*/
    }
}
