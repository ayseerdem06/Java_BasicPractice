package day1;


import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen is unvanınızı giriniz: ");
        String jobTitle=scan.next().toLowerCase();

        if(jobTitle.equals("qa")){
            System.out.println("Unvaniniz Quality Analyst");
        }else if(jobTitle.equals("dev")){
            System.out.println("Unvaniniz  Developer");
        }else if(jobTitle.equals("ba")){
            System.out.println("Unvaniniz Business Analyst");
        }else if(jobTitle.equals("pm")){
            System.out.println("Unvaniniz Project Manager");
        }else {
            System.out.println("Yanlis formatta jobTitle bilgisi girdiniz");
        }


       /* 2. COZUM YOLU

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir ünvan giriniz: ");
        String jobTitle=scan.next().toLowerCase();

        switch (jobTitle){
            case "qa":
                System.out.println("Unvaniniz Quality Analyst");
                break;
            case "dev":
                System.out.println("Unvaniniz  Developer");
                break;
            case "ba":
                System.out.println("Unvaniniz Business Analyst");
                break;
            case "pm":
                System.out.println("Unvaniniz Project Manager");
                break;
            default:
               System.out.println("Yanlis formatta jobTitle bilgisi girdiniz. ");
               break;
            }
                */
    }
}

