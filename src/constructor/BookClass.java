package constructor;

public class BookClass {

     // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin

    String adi="Adi girilmedi ";
    String yazari="Yazari girilmedi";
    int yayinYili;

    public BookClass(){

    }


    public BookClass(String adi, String yazari, int yayinYili) {
        this("API","Hatice");
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;


    }

    @Override
    public String toString() {
        return
                "\nadi: " + adi +
                        "\nyazari: " + yazari +
                        "\nyayinYili: " + yayinYili ;

    }

    public static void book(){
        System.out.println("Method cagirildi");
    }

    public static void main(String[] args) {

        BookClass obj1=new BookClass("Java","Yasemin",2022);
        BookClass obj2=new BookClass("Selenyum","Esra");

        yazdir(obj1,obj2);


    }

    public static void yazdir(BookClass obj1, BookClass obj2) {

        System.out.println(obj1);
        System.out.println("adi: "+ obj2.adi+" "+ "\nyazari: "+ obj2.yazari);


    }

}