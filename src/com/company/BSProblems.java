package com.company;

public class BSProblems {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int targetElem = 19;
        System.out.println(ceiling(arr,targetElem));
        System.out.println(flooring(arr,targetElem));
    }
    //return index: smallest number>=target
    static int ceiling(int[] arr, int targetElement){
        //what if the target is greatest number in the array ?
        if(targetElement>arr[arr.length-1]){return -1;}

        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(targetElement<arr[mid]){
                end=mid-1;
            }
            else if(targetElement>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
    //return the index: greatest number<=target
    static int flooring(int[] arr, int targetElement){
        //what if target is the smallest number in the array ?
        if(targetElement<arr[0]){return -1;}
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(targetElement<arr[mid]){
                end=mid-1;
            }
            else if(targetElement>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
