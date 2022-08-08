package day12_okulProje;

public class Kisi {

    private String adSoyad;
    private String kimlikNo;
    private int yas;


    public Kisi(String adSoyad, String kimlikNo, int yas) {
        this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }


    public String getAdSoyad() {
        return adSoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public String setAdSoyad() {
        return adSoyad;
    }

    public int setYas() {
        return yas;
    }
    public String setKimlikNo(){
        return kimlikNo;
    }

    @Override
    public String toString() {
        return
                "\nadSoyad: " + adSoyad +
                "\nkimlikNo: " + kimlikNo +
                "\nyas: " + yas ;

    }

}
