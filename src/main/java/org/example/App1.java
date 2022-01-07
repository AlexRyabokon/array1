package org.example;

import java.util.Arrays;

public class App1 {
        public static void main( String[] args ) {
            int[] array1 = new int[50];
            int[] array2 = new int[50];


            for (int i = 0; i < array1.length; i++) {
                array1[i] = (int)(Math.random() * 1000) + 0;
                if (array1[i]%2 == 0) {
                    array2[i] = array1[i];
                }
            }
            System.out.println(Arrays.toString(array1));
            System.out.println(Arrays.toString(array2));
    }
}
