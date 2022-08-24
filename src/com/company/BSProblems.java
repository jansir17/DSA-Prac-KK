package com.company;

import java.util.Arrays;

public class BSProblems {
    public static void main(String[] args) {
        //problem01
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int targetElem = 1;
        System.out.println("prob1: "+ceiling(arr, targetElem));
        //problem02
        System.out.println("prob2: "+flooring(arr, targetElem));
        //problem03
        char[] letters = {'c', 'f', 'j'};
        char targetLetter = 'e';
        System.out.println("prob3: "+smallestLetter(letters, targetLetter));
        //problem04
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;
        System.out.println("prob4: "+Arrays.toString(firstLastElem(nums, target)));
        //problem05
        int[] arr2= {3,5,6,8,10,90,100, 130, 140, 160, 190,200, 201, 220, 230, 240, 260, 270};
        int targetElem2=160;
        System.out.println("prob05: "+answer(arr2,targetElem2));
        //problem06
        int[] arr3={1,2,3,4,8,9,10,7,5,3,1,0};
        System.out.println("problem06: "+mountainArray(arr3));
    }

    //problem01: return index: smallest number>=target
    static int ceiling(int[] arr, int targetElement) {
        //what if the target is the greatest number in the array ?
        if (targetElement > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (targetElement < arr[mid]) {
                end = mid - 1;
            } else if (targetElement > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    //problem02: return the index: greatest number<=target
    static int flooring(int[] arr, int targetElement) {
        //what if target is the smallest number in the array ?
        if (targetElement < arr[0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (targetElement < arr[mid]) {
                end = mid - 1;
            } else if (targetElement > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }

    //problem03: finding/ceiling next letter of target letter
    static char smallestLetter(char[] letter, char targetElement) {
        int start = 0;
        int end = letter.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (targetElement < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }

    //problem04: finding first and last position of an element in sorted array
    static int[] firstLastElem(int[] arr, int targetElement) {
        int[] ans = {-1, -1};
        int start = search(arr, targetElement, true); //we are checking leftest from the mid
        int end = search(arr, targetElement, false); // we are checking rightest from the mid
        if (start == end) {
            return ans;
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    //this function returns the index value of the target for above method.
    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    //problem05 find element in infinite sorted array
    //this method fix the box or range of the array where to operate the search
    static int answer(int[] arr, int target) {
        //first find the range
        //first size with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target is lie down in the given range
        while (target > arr[end]) {
            int newStart = end + 1;
            //double the box size
            //end = previous end+ size of the box * 2;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return searchAnswer(arr, target, start, end);
    }
    //this function just search the element in the given range for above method.
    static int searchAnswer(int[] arr, int targetElement, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (targetElement < arr[mid]) {
                end = mid - 1;
            } else if (targetElement > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //problem06: Mountain array problem
    static int mountainArray(int[] arr){
        int start =0;
        int end =arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in decreasing part of the array
                //this maybe the answer but to be sure we have to look left side.
                end=mid; //we don't have to check right side anymore as we found that target is at left
            }
            else {
                //you are in ascending part of the array
                start = mid + 1; //because we know that mid+1 element is greater than mid index element.
            }
        }
        //after slicing down the array start == end as we are cutting down above 2 checks.
        //start and End are always trying to find max element in above 2 checks.
        //hence, they are pointing to just 1 element that is the maximum one.
        return start; //start and End both have the same value as we have sliced the array into 1 element.
    }
}
