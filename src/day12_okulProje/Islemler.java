package day12_okulProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    static List<Kisi> silinenOgrnc = new ArrayList<>();
    static List<Kisi> silinenOgrtmn = new ArrayList<>();


    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");


        String secim = scan.next().toUpperCase(); // Kullanıcı kucuk harf girse bile buyuk harfe cevirecek cunku kontrol buyuk harfle ryapılacak

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                kisiTuru = "CIKIS";
                break;
            default:
                System.out.println("hatali giris yaptınız.");
                girisPaneli();
                break;
        }


    }

    private static void islemMenusu() {
        System.out.println("Sectigin kisi turu " + kisiTuru + "Lutfen asagidaki islemleri seciniz");

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");


        System.out.println("Islem tercihinizi giriniz: ");

        int secilenIslem = 0;
        try {
            secilenIslem = scan.nextInt();
        } catch (Exception e) {
            System.out.println("0 ile 5 rakamı dısında veri giremezsiniz");
        }


        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;

            case 2:
                arama();
                islemMenusu();
                break;


            case 3:
                listeleme();
                islemMenusu();
                break;

            case 4:
                silme();
                islemMenusu();
                break;

            case 5:
                girisPaneli();
                break;

            case 0:
                cikis();
                break;
            default:
                System.out.println("Gecerli bir veri giriniz");
                islemMenusu();
                break;

        }




    }

    private static void cikis() {

        System.out.println("İslemlerinizi gerçekleştirdiniz tesekkur ederiz");
    }

    private static void silme() {
        System.out.println("****" + kisiTuru + "  Silme sayfasına hosgeldiniz");
        scan.nextLine();
        System.out.println("Kimlik no giriniz :");
        String kimlikNo = scan.next();
        if (kisiTuru.equals("OGRENCI")) {
            for (int i = 0; i < ogrncList.size(); i++) {
                if (kimlikNo.equals(ogrncList.get(i).getKimlikNo())) {
                    silinenOgrnc.add (i,ogrncList.get(i));
                    ogrncList.remove(ogrncList.get(i));
                    System.out.println("Kaydınız silinmiştir");
                    System.out.println("Kaydı silinen ogrenci : "+ silinenOgrnc);
                    break;
                } else {
                    System.out.println("aradıgınız kayda rastlanmamıştır o nedenle herhangi bir silme işlemi yapılamadı");
                    break;
                }
            }
        } else {
            for (int i = 0; i < ogrtmnList.size(); i++) {
                if (kimlikNo.equals(ogrtmnList.get(i).getKimlikNo())) {
                    silinenOgrtmn.add(i,ogrtmnList.get(i));
                    ogrtmnList.remove(ogrtmnList.get(i));
                    System.out.println("Kaydınız silinmiştir");
                    System.out.println("Kaydı Silinen ogretmen : "+ silinenOgrtmn);
                    break;
                } else {
                    System.out.println("aradıgınız kayda rastlanmamıştır o nedenle herhangi bir silme işlemi yapılamadı");
                    break;
                }

            }
        }


    }

    private static void listeleme() {
        System.out.println("****" + kisiTuru + "  Listeleme sayfasına hosgeldiniz");
        if (kisiTuru.equals("OGRENCI")) {
            System.out.println(ogrncList);
        } else {
            System.out.println(ogrtmnList);
        }

    }

    private static void arama() {
        System.out.println("****" + kisiTuru + "  Arama sayfasına hosgeldiniz");
        scan.nextLine();
        System.out.println("Kimlik no giriniz :");
        String kimlikNo = scan.next();
        if (kisiTuru.equals("OGRENCI")) {

            for (int i = 0; i < ogrncList.size(); i++) {
                if (kimlikNo.equals(ogrncList.get(i).getKimlikNo())) {
                    System.out.println("Aradıgınız ogrencı okulumuz ogrencisidir");
                    System.out.println("Ogrenci Bilgileri :");
                    System.out.println(ogrncList.get(i));
                    System.out.println("***************************************");
                    break;

                } else {
                    System.out.println("Aradıgınız ogrencı kayıtlarda bulunmamaktadır");
                    break;
                }

            }
        } else {
            for (int i = 0; i < ogrtmnList.size(); i++) {
                if (kimlikNo.equals(ogrtmnList.get(i).getKimlikNo())) {
                    System.out.println("Aradıgınız ogretmen okulumuz ogretmenidir");
                    System.out.println("Ogretmen Bilgileri :");
                    System.out.println(ogrtmnList.get(i));
                    System.out.println("***************************************");
                    break;
                } else {
                    System.out.println("Aradıgınız ogrencı kayıtlarda bulunmamaktadır");
                    break;
                }
            }

        }
    }

    private static void ekle() {  // bu method hem ogrencı hemde ogretmen eklemek icin tasarlandı
        scan.nextLine();
        System.out.println("****" + kisiTuru + "  Ekleme sayfasına hosgeldiniz");
        String adSoyad;
        String kimlikNo;
        int yas;


        boolean varMı = false;

        do {

            System.out.println("isim soyisim gir");
            adSoyad = scan.nextLine();
            System.out.println("kimlik gir");
            kimlikNo = scan.nextLine();
            System.out.println("Yas gir");
            yas = scan.nextInt();

            if (kisiTuru.equals("OGRENCI")) {
                scan.nextLine();
                System.out.println("ogrencı no gir");
                String ogrenciNo = scan.nextLine();
                System.out.println("sınıf no gır");
                String sinif = scan.nextLine();
                Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
                ogrncList.add(ogrenci);
                System.out.println("************************");
                System.out.println(ogrncList);
                System.out.println("***********************");
                varMı = true;

            } else {
                scan.nextLine();
                System.out.println("bolum gir");
                String bolum = scan.nextLine();
                System.out.println("sicil no gir");
                String sicilNo = scan.next();

                Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
                ogrtmnList.add(ogretmen);
                System.out.println("**********************************");
                System.out.println(ogrtmnList);
                System.out.println("**********************************");
                varMı = true;


            }

        } while (!varMı);

    }
}

