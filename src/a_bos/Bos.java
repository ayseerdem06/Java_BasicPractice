package a_bos;

import java.util.Scanner;

public class Bos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz  :");
        String cumle = scan.nextLine().toLowerCase();

        System.out.println(strVarmi(cumle));

    }

    private static boolean strVarmi(String cumle) {

        if (cumle.contains("xyz")) {
            return true;
        } else
            return false;
        }

    }





