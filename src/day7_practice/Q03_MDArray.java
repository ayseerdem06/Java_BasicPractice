package day7_practice;

public class Q03_MDArray {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * dondurun.
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */

    public static void main(String[] args) {

        int [][] arr={{1,3,6},{2,8},{5,7,9,14}};

       int toplam= ciftleriTopla(arr);
        System.out.println("toplam = " + toplam);

    }

    private static int ciftleriTopla(int[][] arr) {

        int toplam=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
       return toplam;
    }




}
