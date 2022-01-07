package org.example;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        int sumArr1 = 0;
        int sumArr2 = 0;

        double avr1= 0.0;
        double avr2= 0.0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 5) + 0;
            sumArr1 = sumArr1+arr1[i];
            avr1 = sumArr1/arr1.length;
        }
        System.out.println("Elements of the array #1 are: "+ Arrays.toString(arr1));
        System.out.println("Sum of the elements of the array :  "+sumArr1  + " Average number of array #1: "+ avr1);

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random() * 5) + 0;
            sumArr2 = sumArr2+arr2[i];
            avr2 = sumArr2/arr2.length;
        }
        System.out.println("Elements of the array #2 are: "+ Arrays.toString(arr2));
        System.out.println("Sum of the elements of the array :  "+sumArr2 + " Average number of array #1: "+ avr2);

        if(avr1>avr2){
            System.out.println("Average number of array #1 is bigger than Average number of array #2");
        } else if(avr1<avr2){
            System.out.println("Average number of array #2 is bigger than Average number of array #1");
        } else {
            System.out.println("Average number of array #1 is equal to Average number of array #2");
        }



    }
}
