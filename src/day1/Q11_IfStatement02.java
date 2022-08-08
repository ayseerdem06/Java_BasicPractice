package day1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

    public static void main(String[] args) {

        int not=85;
        if(not>90 && not<=100){
            System.out.println("A");
        }else if(not>90 && not<=80){
            System.out.println("B");
        }else if(not>80 && not<=70){
            System.out.println("C");
        }else if(not>70 && not<=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }



       /* 2.COZUM YOLU
        Scanner scan=new Scanner(System.in);
        System.out.print("Notunuzu giriniz : ");
        double not= scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Geçerli bir not giriniz");
        }else if(not>=90){
            System.out.println("Geçme notunuz : "+ "A");
        }else if(not>=80){
            System.out.println("Geçme notunuz : "+ "B");
        }else if(not>=70){
            System.out.println("Geçme notunuz : "+ "C");
        }else if(not>=60){
            System.out.println("Geçme notunuz : "+ "D");
        }else if(not>0){
            System.out.println("Geçme notunuz : "+ "F");
        }
        */

    }


}
