package day7_practice;

public class Q03_MDArray_ForEach {
    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {

        int arr[][] = {{1,3,6},{2,8},{5,7,9,14}};
        ciftleriTopla(arr);

    }
    private static void ciftleriTopla(int[][] arr) {
        int toplam = 0;
        for (int[] each1 : arr) { //outer for each
            for (int each2 : each1) { //inner for each
                if (each2 % 2 == 0) {
                    toplam += each2;
                }
            }
        }
        System.out.println("toplam = " + toplam);

    }
}
