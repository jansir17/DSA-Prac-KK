package com.company;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr= {18,23,4,5,221,5,78};
        int target= 10;
        System.out.println(evenNumber(arr));
//        System.out.println(checkNumber(arr,target,0,6));
    }
    //we are checking number in given range
    static boolean checkNumber(int[] arr, int elem, int start, int end){
        if(arr.length==0){
            return false;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==elem){return true;}
        }
        return false;
    }

    //we are checking even number digits
    static int evenNumber(int[] arr){
        int totalEvenNumber=0;
        if(arr.length==0){return -1;}
        for (int elem : arr) {
            if (evenCounter(elem)) {
                totalEvenNumber++;
            }
        }
        return totalEvenNumber;
    }

    //we have separated from above function to be more readable.
    static boolean evenCounter(int elem) {
        int count=0;
        while(elem>0){
            elem=elem/10;
            count++;
        }
        return count % 2 == 0;
    }
}
