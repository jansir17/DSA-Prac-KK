package Recursion;

public class Factorial {
    public static void main(String[] args) {
        long totalNumber= factorialResult(4);
        System.out.println(totalNumber);
    }
    static int factorialResult(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorialResult(num - 1);
        }
    }
}
