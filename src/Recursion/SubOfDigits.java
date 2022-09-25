package Recursion;

public class SubOfDigits {
    public static void main(String[] args) {
        int totalSum = sumOfDigits(123);
        System.out.println(totalSum);
    }
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
