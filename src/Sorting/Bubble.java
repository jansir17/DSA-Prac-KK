package Sorting;

import java.util.Arrays;
import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        //Remember length-i-1. this will search until its necessary
        //if J never swaps that means array is already sorted. which is best CASE.
        Scanner sc=new Scanner(System.in);
        int[] array1=new int[5];
        System.out.println("Enter your values.");
        array1[0]=sc.nextInt();
        array1[1]=sc.nextInt();
        array1[2]=sc.nextInt();
        array1[3]=sc.nextInt();
        array1[4]=sc.nextInt();
        bubbleSort(array1);
        System.out.println(Arrays.toString(array1));
    }

    static void bubbleSort(int[] arr){
        boolean swap =false;
        //run the steps n-1 times.
        for (int i = 0; i < arr.length; i++) {
            //for each steps, max item will be last index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item ?
                if(arr[j]<arr[j-1]){
                    int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            //if you did not swap for any value of i=0 means array is sorted
            if(!swap){
                break;
            }
        }
    }
}
