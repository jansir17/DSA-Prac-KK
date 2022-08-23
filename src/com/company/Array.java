package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter size of the Array");
//        int arrLength=sc.nextInt();
//        int[] arr= new int[arrLength];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();
//        }
//        //enhanced for loop
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        //following is another way of prinitng Array
//        System.out.println(Arrays.toString(arr)); //adding brackets and coma for us.

        //les take String type array
        String[] strArray= new String[5];
        for (int s = 0; s <strArray.length; s++) {
            strArray[s]=sc.next();
        }
        System.out.println(Arrays.toString(strArray));
        //now if we change the refference value of strarray..
        strArray[3]="june"; //this will change the Main strArray as its reference.
        System.out.println(Arrays.toString(strArray));

        //changing the reference value in functional way
        changeString(strArray);
        System.out.println(Arrays.toString(strArray)); //strArray has changed again as functional reason.
    }
    static void changeString(String[] arr){
        arr[3]="july";
    }
}
