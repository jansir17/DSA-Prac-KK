package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int x){
        if(x <=1) {
            return false;
        }
        int counter=2;
        while(counter*counter<=x){
            if(x%counter==0){
                return false;
            }
            counter++;
        }
        return counter*counter>x ;
    }
}
