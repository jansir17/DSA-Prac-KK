package com.company;

import java.util.Scanner;
public class Addition {
    public static void  main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum= sc.nextInt();
        System.out.println("Enter your second number");
        int secondNum= sc.nextInt();
        System.out.println(firstNum+secondNum+" is your Total number is" );
    }
}
