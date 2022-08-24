package com.company;

public class BSProblems {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int targetElem = 19;
        System.out.println(ceiling(arr,targetElem));
        System.out.println(flooring(arr,targetElem));
        char[] letters= {'c','f','j'};
        char targetLetter='e';
        System.out.println(smallestLetter(letters,targetLetter));
    }

    //return index: smallest number>=target
    static int ceiling(int[] arr, int targetElement){
        //what if the target is the greatest number in the array ?
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

    static char smallestLetter(char[] letter, char targetElement){
        int start =0;
        int end=letter.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(targetElement<letter[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letter[start %letter.length];
    }
}
