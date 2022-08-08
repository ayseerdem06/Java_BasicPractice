package day6_practice;

import java.util.Arrays;

public class Q06_Arrays {

    /*  you have a string "HeySiri"
     * with arrays change it to "ByeSiri" and write changing array
     *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
     *
     */

    public static void main(String[] args) {

        String arr="HeySiri";
        arr=arr.replace("Hey","Bye");

        String [] yeniArr=new String[1];
        yeniArr[0]=arr;
        System.out.println(Arrays.toString(yeniArr));

    }
}
