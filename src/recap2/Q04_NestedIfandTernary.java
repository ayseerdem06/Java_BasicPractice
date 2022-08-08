package recap2;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki rakamları kelimelere cevirip yazdiran bir java programi yazin.
   Sayı 9'dan buyuk veya sifirdan kucukse, cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {

       // nestedif ile cozumu
          int sayi=5;
          String sonuc="";

          if(sayi>=0 && sayi<=9){
               if(sayi==9){sonuc="dokuz";}
               else if(sayi==8){sonuc="sekiz";}
               else if(sayi==7){sonuc="yedi";}
               else if(sayi==6){sonuc="alti";}
               else if(sayi==5){sonuc="bes";}
               else if(sayi==4){sonuc="dort";}
               else if(sayi==3){sonuc="uc";}
               else if(sayi==2){sonuc="iki";}
               else if(sayi==1){sonuc="bir";}
               else sonuc="sifir";
          }else sonuc="gecersiz";
          System.out.println("sonuc = " + sonuc);

          // ternary ile cozumu
          int n=7;
          String result= n==9 ? "dokuz" : n==8 ? "Sekiz" :  n==7 ? "yedi" :  n==6 ? "alti" :
                  n==5 ? "bes" :  n==4 ? "dort" :  n==3 ? "uc" :  n==2 ? "iki" :  n==1 ? "bir" : "gecersiz";

          System.out.println("result = " + result);
     }
}
