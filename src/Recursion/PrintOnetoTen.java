package Recursion;

public class PrintOnetoTen {
    public static void main(String[] args) {
        printNumber(1);
    }
    static void printNumber(int n){
        if(n<=100){
            System.out.print(n+" ");
            printNumber(n+1);
        }
    }
}
