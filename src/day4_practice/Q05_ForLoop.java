package day4_practice;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
    public static void main(String[] args) {

    // System.out.println("for ile");

    // for (int i = 0; i <=255 ; i++) {
    //     char c= (char) i; // casting yaptık, sayi harf ve karakter
    //     System.out.println(i+"->"+ c);
    // }

    // System.out.println("while ile ");

    //  int i=0;
    //  while(i<=255){
    //      char sembol= (char) i; // casting yaptık, sayi harf ve karakter
    //      System.out.println(i+"->"+ sembol);
    //      i++;
    //  }

        System.out.println("do vihile ile");

        int i=0;
        do {
            char sembol= (char) i; // casting yaptık, sayi harf ve karakter
            System.out.println(i+"->"+ sembol);
            i++;
        }while(i<=255);

        /*
        char baslangic = 'a';
        char bitis = 'z';
        char ilkHarf = 'A';
        char sonHarf = 'Z';



        for (char i =0; i <= 255; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 0; i <=255 ; i++) {
            System.out.print(i+" ");
        }

*/

    }

}

