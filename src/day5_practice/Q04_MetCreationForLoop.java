package day5_practice;

import java.util.Scanner;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString
		  Ceviri:
		  Bir dizeyi tersine çevirmek için bir Java programı yazın.
		  for döngüsü kullanın ve adında bir yöntem oluşturun
		  tersDize*/

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("String giriniz:");
            String str=scan.nextLine();
            String tersStr="";

            System.out.println( "Stringin tersi :" +tersStr(str,tersStr));
        }

    public static String tersStr(String str, String tersStr) {

        for (int i =str.length()-1; i >=0; i--) {
            tersStr+=str.charAt(i);

        }
       return tersStr;

    }

}
