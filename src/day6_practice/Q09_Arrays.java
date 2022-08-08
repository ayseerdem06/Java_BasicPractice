package day6_practice;

public class Q09_Arrays {

    /*
     * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
     * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

     */
    public static void main(String[] args) {
        int [] [] arr1 = { {0,2,-1}, {3,8,9}, {7} };
        int [] [] arr2 = { {-7,6,-9}, {0,12}, {19} };

        int toplam1=0;
        int toplam2=0;
        int ikiArrToplam=0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                toplam1+=arr1[i][j];
            }
        }
        System.out.println("arr1'in rakamlar toplami : "+ toplam1);

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                toplam2+=arr2[i][j];
            }
        }
        System.out.println("arr2'in rakamlar toplami : "+toplam2);

        ikiArrToplam=toplam1+toplam2;
        System.out.println("Her iki array'in  rakamlarının toplami : "+ ikiArrToplam);

    }
}
