package Recursion;

public class BinarySearchRecur {
    public static void main(String[] args) {
        int[] arr = {10, 15 , 20 , 22 , 23 , 27 , 30};
        int search = 27;
        int start= 0;
        int end = arr.length-1;
        findNumber(arr,start , end,search);
    }
    static void findNumber(int[] arr, int start, int end, int search){
        if(start>end){
            return;
        }
        int mid = (start+end)/2;
        if(search==arr[mid]){
            System.out.println("element found in "+mid);
        }
        else if(search>arr[mid]){
            findNumber(arr,mid+1,end,search);
        }
        else{
            findNumber(arr,start,mid-1,search);
        }
    }
}