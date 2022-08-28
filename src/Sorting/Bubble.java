package Sorting;

import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        //Remember length-i-1. this will search until its necessary
        //if J never swaps that means array is already sorted. which is best CASE.
        int[] array1={3,5,2,1,4};
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
