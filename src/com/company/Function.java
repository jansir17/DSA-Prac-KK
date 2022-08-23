package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int first_num= sc.nextInt();
        int second_num=sc.nextInt();
        System.out.println(sum(first_num,second_num));
        int[] arr={1,2,3,4,5,6};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int sum(int a,int b){
        return a+b;
    }
    //remember in java there is only pass by value. not by reference
    //passing the copy of the value of the actual reference.
    //so primitive value creates new object but reference value passes copy of its value.

    static void changeValue(int[] numArr){
        numArr[0]= 5;
    }

    //Method Scope= anything changes inside it, does not change in other, nor can be accsessed by others.
    //Block scope = Values initialize in this block wont be accessed by outside, already initia var cant be
    //              initi again in the block of same method/fucntion. but its value can change it.
    //              even if you change value in block, outside will be changed. as we not initi new var.

    //So anything initia outside the block in any method/fucntion, CANT be reintia inside the method/func.
    //anything intia inside the BLOCK CAN be reInitialize outside it. as outside the block method doesn't
    //have any idea about the var.
}

