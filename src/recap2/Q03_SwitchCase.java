package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("uc basamaklı sayi giriniz: ");
        int sayi= scan.nextInt();
        int birlerBas=sayi%10, onlarBas=(sayi/10)%10, yuzlerBas=sayi/100;

        if(sayi>99 && sayi<1000){
            switch ((yuzlerBas)){
                case 0: System.out.print(""); break;
                case 1 : System.out.print("yuz\t"); break;
                case 2 : System.out.print("ikiyuz\t"); break;
                case 3 : System.out.print("ucyuz\t"); break;
                case 4 : System.out.print("dortyuz\t"); break;
                case 5 : System.out.print("besyuz\t"); break;
                case 6 : System.out.print("altiyuz\t"); break;
                case 7 : System.out.print("yediyuz\t"); break;
                case 8 : System.out.print("sekizyuz\t"); break;
                case 9 : System.out.print("dokuzyuz\t"); break;

            }
            switch (onlarBas){
                case 0: System.out.print(""); break;
                case 1 : System.out.print("on\t"); break;
                case 2 : System.out.print("yirmi\t"); break;
                case 3 : System.out.print("otuz\t"); break;
                case 4 : System.out.print("kırk\t"); break;
                case 5 : System.out.print("elli\t"); break;
                case 6 : System.out.print("altmis\t"); break;
                case 7 : System.out.print("yetmiş\t"); break;
                case 8 : System.out.print("seksen\t"); break;
                case 9 : System.out.print("doksan\t"); break;

            }

            switch (birlerBas){
                case 0: System.out.print(""); break;
                case 1 : System.out.print("bir\t"); break;
                case 2 : System.out.print("iki\t"); break;
                case 3 : System.out.print("uc\t"); break;
                case 4 : System.out.print("dort\t"); break;
                case 5 : System.out.print("bes\t"); break;
                case 6 : System.out.print("alti\t"); break;
                case 7 : System.out.print("yedi\t"); break;
                case 8 : System.out.print("sekiz\t"); break;
                case 9 : System.out.print("dokuz\t"); break;

            }

        }else System.out.println("3 basamakli sayi giriniz.");

/*
        2.Cozum Yolu :

        Scanner scan=new Scanner(System.in);
        System.out.print("uc basamakli sayi giriniz: ");
        int num= scan.nextInt();

        int birlerbsm=num%10;
        int onlarbsm=(num/10)%10;
        int yuzlerbsm=num/100;

        if(sayi>99 && sayi<1000){
           switch (yuzlerbsm){
           case  0:
                System.out.print("");
                break;
            case 1:
                System.out.print("Yuz");
                break;
            case 2:
                System.out.print("ikiyuz");
                break;
            case 3:
                System.out.print("Ucyuz");
                break;
            case 4:
                System.out.print("Dortyuz");
                break;
            case 5:
                System.out.print("Besyuz");
                break;
            case 6:
                System.out.print("Altıyuz");
                break;
            case 7:
                System.out.print("Yediyuz");
                break;
            case 8:
                System.out.print("Sekizyuz");
                break;
            case 9:
                System.out.print("Dokuzyuz");
                break;
        }

        switch (onlarbsm){
        case  0:
                System.out.print("");
                break;
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("Kirk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }

        switch (birlerbsm){
             case  0:
                System.out.print("");
                break;
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("Uc");
                break;
            case 4:
                System.out.print("Dort");
                break;
            case 5:
                System.out.print("Bes");
                break;
            case 6:
                System.out.print("Altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
               }
        }else System.out.println("3 basamakli sayi giriniz.");
*/
    }

}
