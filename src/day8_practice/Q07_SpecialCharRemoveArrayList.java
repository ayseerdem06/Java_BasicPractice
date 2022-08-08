package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q07_SpecialCharRemoveArrayList {
      /*
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */
      public static void main(String[] args) {

          List<String> list=new ArrayList<>();
          list.add("$13");
          list.add("$15");
          list.add("$20");


          System.out.println(list);



      }
}
