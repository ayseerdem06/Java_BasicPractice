package constructor;

import java.util.Scanner;

public class C01 {

    String adi="Azra Betül";
    String soyadi="Topal";
    String ders="Matematik";
    int not=80;

    public C01(String adi, String soyadi, String ders, int not) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.ders = ders;
        this.not = not;
    }
    public C01(){

    }

    public void isimDegistir(String adi,String soyadi,String ders,int not){
        this.adi = adi;
        this.soyadi = soyadi;
        this.ders = ders;
        this.not = not;

    }
    public void soyadDegistir(String soyadi){
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni soyadı giriniz");
        String yeniSoyad=scan.next();
        this.soyadi=yeniSoyad;

    }


    @Override
    public String toString() {
        return "C01{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", ders='" + ders + '\'' +
                ", not=" + not +
                '}';
    }
}
