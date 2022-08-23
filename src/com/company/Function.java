package com.company;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first_num= sc.nextInt();
        int second_num=sc.nextInt();
        System.out.println(sum(first_num,second_num));
    }

    static int sum(int a,int b){
        return a+b;
    }
}
