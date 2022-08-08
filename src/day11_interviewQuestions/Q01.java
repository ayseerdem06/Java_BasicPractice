package day11_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
    Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.
    Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
           hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir string giriniz : ");
        String str=scan.nextLine().toLowerCase();

        String [] arr=str.split("");  // split ile stringin karakterlerini harflerine ayırdık
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);                // sort ile sıralama yapacaz

        System.out.println(Arrays.toString(arr));

        int counter=0;

        for (int i = 1; i <arr.length ; i++) {
         if(arr[i-1].equals(arr[i])){
             counter++;
         } else {
             System.out.println(arr[i-1]+"  sayisi "+ (counter+1 ));
             counter=0;
         }if(i==arr.length-1){
            System.out.println(arr[i]+"  sayisi "+ (counter+1 ));
        }
        }
    }
}
