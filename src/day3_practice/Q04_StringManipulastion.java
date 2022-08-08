package day3_practice;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime giriniz :");
        String str=scan.next();
        char ortancaKrk=str.charAt((str.length()-1)/2);

        if(str.length()%2==1 && str.length()>=3){
            System.out.println("Ortanca karakter: "+ ortancaKrk);
        }

    }
}
