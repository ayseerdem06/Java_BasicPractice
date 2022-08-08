package day09_practice.restourant;

public class Mutfak {

    public String yemekler = "Adanakebap, urfaciger, kusbasi, kusleme";
    public String araSicak = "yaylacorba, mercimek, duguncorba, corba";
    public String tatlilar = "baklava, sutlac, gullac, kazadibi, kunefe";
    public String icecekler = "ayran, salgam, kola";

    public Mutfak(String yemekler, String araSicak, String tatlilar, String icecekler) {
        this.yemekler = yemekler;
        this.araSicak = araSicak;
        this.tatlilar = tatlilar;
        this.icecekler = icecekler;
    }


    public Mutfak() {
        this("adanakebap","mercimek","kunefe","salgam");
    }

    @Override
    public String toString() {
        return
                "\nyemekler='" + yemekler +
                        "\naraSicak='" + araSicak +
                        "\ntatlilar='" + tatlilar +
                        "\nicecekler='" + icecekler;
    }
}
