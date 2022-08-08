package day8_practice;

import java.util.ArrayList;
import java.util.List;

public class Q08_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */

    public static void main(String[] args) {
        int [] arr={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};


        List<Integer> tekrarsizList= new ArrayList<>();


        for (int i = 0; i < arr.length-1; i++) {    // index hatasından dolayı  length-1 den baslandı. son index elemanı  if ile asagıda soruldu
            if(arr[i]!=arr[i+1]  && !tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }
        System.out.println(tekrarsizList);

        if(!tekrarsizList.contains(arr[arr.length-1])){    // son index elemani burda soruldu
            tekrarsizList.add(arr[arr.length-1]);
            System.out.println("Tekrarsiz list: "+ tekrarsizList);
        }


    }
}
