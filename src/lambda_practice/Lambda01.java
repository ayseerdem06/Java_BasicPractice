package lambda_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {

    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih", "ersin", "mevlit"));
    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, 54, 9, 35, 35, 34));

    public static void aHarfleriSilenGerisiniYazdiran(ArrayList<String> isimler) {
        // 1.yol
        System.out.println(isimler.stream().
                map(m -> m.toLowerCase()).
                filter(m -> !m.contains("a")).
                collect(Collectors.toList()));

        // 2.yol
        isimler.removeIf(t -> t.contains("A") || t.contains("a"));
        System.out.println(isimler);

        // 3.yol
        isimler.stream().filter(t -> t.contains("A") || t.contains("a")).collect(Collectors.toList());
        System.out.println(isimler);

    }


    //en buyyk elemani bulun
    public static void enbuyukSayi(List<Integer> numbers) {

        // 1.yol
        Integer sayi = numbers.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(sayi);

        // 2.yol
        Optional<Integer> maxSayi = numbers.stream().reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi);

        // 3.yol

        System.out.println(numbers.stream().reduce(Integer::max).get());


    }

    public static void elemanlarinToplami(List<Integer> numbers) {
        // 1.yol
        System.out.println(numbers.stream().reduce(0, (t, u) -> t + u));

        // 2.yol
        System.out.println(numbers.stream().reduce(Math::addExact).get());

        // 3.yol
        System.out.println(numbers.stream().reduce(Integer::sum).get());  //406

    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemanlarinCarpimi(List<Integer> numbers) {
        // 1.yol
        System.out.println(numbers.stream().
                filter(t -> t % 2 == 0).reduce(1, (t, u) -> t * u));  //-10075968

        //2.yol method ref

        System.out.println(numbers.stream().filter(Methodlarim::ciftElemaniBul).reduce(Math::multiplyExact).get());
        // method ref kullanıldı classımızdan creat ettiğimiz methodu kullandık.

        // Okul projesindeki listele methodunu lamda ile yap


    }

}



//   reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
 //   kullanımı yaygındır pratiktir.
 //   Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
 //   bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
 //   reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
 //   reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
 //   İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
//

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    //Lambda Expression...




