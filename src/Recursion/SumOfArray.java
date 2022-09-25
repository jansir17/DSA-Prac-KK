package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int totalSum=sumofArray(arr,5);
        System.out.println(totalSum);
    }
    static int sumofArray(int[] arr, int n){
        if(n<=0){
            return 0;
        }
        return sumofArray(arr, n-1)+arr[n-1];
    }
}
