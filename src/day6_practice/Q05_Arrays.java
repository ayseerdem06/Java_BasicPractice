package day6_practice;

import java.util.Arrays;

public class Q05_Arrays {
    	/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        public static void main(String[] args) {

            int [] input={2,6,4,5,8,9};

            for (int i = 0; i <input.length ; i++) {
               input[i]*=input[i];

            } System.out.println(Arrays.toString(input));
        }


}
