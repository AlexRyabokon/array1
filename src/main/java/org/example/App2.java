package org.example;
import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 44, 66, 6, 7};
        int[] array2 = {33, 55, 67, 77, 22};

        int sizeOfArrays = array1.length + array2.length;

        int[] c = new int[sizeOfArrays];

        int count = 0;

        for(int i = 0; i<array1.length; i++) {
            c[i] = array1[i];
            count++;
        }
        for(int j = 0;j<array2.length;j++) {
            c[count++] = array2[j];
        }
        for(int i = 0;i<c.length;i++) {
            System.out.print(c[i] + " ");
        }

    }
}