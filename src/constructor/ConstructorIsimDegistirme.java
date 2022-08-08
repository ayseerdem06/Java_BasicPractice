package constructor;

import java.util.Scanner;

public class ConstructorIsimDegistirme {

// class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin

     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin

     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin

     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.

     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */

    public static void main(String[] args) {

        C01 obj1=new C01();
        C01 obj2=new C01();

        obj2.isimDegistir("Ayse","Erdem","Fizik",70);
        System.out.println(obj2);
        obj2.soyadDegistir(obj2.soyadi);
        System.out.println(obj2);


    }


}