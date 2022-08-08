package day09_practice.restourant;

public class Musteri {

    public static void main(String[] args) {

        Mutfak menu=new Mutfak();
        System.out.println("menu.toString() : " + menu.toString());

        Mutfak siparisim=new Mutfak("adanakebap","mercimek","kunefe","salgam");
        System.out.println("siparisim : " + siparisim);

    }
}
