package com.company;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 10, 12, 14, 30, 32, 40};
//        int targetElem1 = 3;
//        System.out.println("Your Element in index " + searchElement(arr, targetElem1));
        int targetElem2=41;
        System.out.println("Your Element in index "+searchElement2(arr,targetElem2));
    }
    //Efficient way
    static int searchElement2(int[] arr, int targetElement){
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
        return -1;
    }

    //Easy way
    static int searchElement(int[] arr, int targetElement)
    {
        int start=0, end= arr.length, mid=end/2;
        //if we have a big integer number, we can take mid as, start+(end-start)/2, which is same.
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
    //for orderagnostic search, just check the start and end element whether is ascending or discending order
    //then just change the > and < sign of the logic of above effiecient code. simple.
}
