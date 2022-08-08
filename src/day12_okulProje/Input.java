package day12_okulProje;

import static day12_okulProje.Islemler.ogrncList;
import static day12_okulProje.Islemler.ogrtmnList;

public class Input {

    public static void input(){

        Ogrenci ogrenci1=new Ogrenci("Ayse Erdem","3625",40,"4","Selenyum");
        ogrncList.add(ogrenci1);
        Ogrenci ogrenci2=new Ogrenci("Emsal Efe","7485",40,"6","SDLC");
        ogrncList.add(ogrenci2);
        Ogrenci ogrenci3=new Ogrenci("Yasemin Turker","8574",30,"5","API");
        ogrncList.add(ogrenci3);



        Ogretmen ogretmen1=new Ogretmen("Mehmet Bulutluoz","4512",50,"Java","1");
        ogrtmnList.add(ogretmen1);
        Ogretmen ogretmen2=new Ogretmen("Elif Cetın","5241",30,"JavaPractice","2");
        ogrtmnList.add(ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Muzaffer Bulut","8574",35,"JavaPracticeAdvance","3");
        ogrtmnList.add(ogretmen3);
    }
}

