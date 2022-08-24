package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 10, 12, 14, 30, 32, 40};
        int targetElem = 5;
        System.out.println("Your Element in index " + searchElement(arr, targetElem));
    }

    static int searchElement(int[] arr, int targetElement)
    {
        int start=0, end= arr.length, mid=end/2;
        if(arr[mid]==targetElement){
            return mid;
        }
        else if(targetElement<arr[mid]){
            mid=end;
            while(start<=end){
                if(arr[start]==targetElement){
                    return start;
                }
                start++;
            }
        }
        else if(targetElement>arr[mid]){
            start=mid+1;
            while(start<=end){
                if(arr[start]==targetElement){
                    return start;
                }
                start++;
            }
        }
        return -1;
    }
}
