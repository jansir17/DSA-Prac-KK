package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {2,4,5,7,10,12,14,30,32,40};
        int targetElem= 40;
        int start=0;
        int end= arr.length;
        int mid=end/2;
        if(arr[mid]==targetElem){
            System.out.println("you target element is in "+mid+" index");
        }
        else if(targetElem<arr[mid]){
            mid=end;
            while(start<=end){
                if(arr[start]==targetElem){
                    System.out.println("your target element is in "+ start);
                    break;
                }
                start++;
            }
        }
        else if(targetElem>arr[mid]){
            start=mid+1;
            while(start<=end){
                if(arr[start]==targetElem){
                    System.out.println("your target element is in "+ start);
                    break;
                }
                start++;
            }
        }
        else{
            System.out.println("Wrong input");
        }
    }
}
