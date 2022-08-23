package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your limit of armstrong number checking");
        int number= sc.nextInt();
        for (int i = 100; i < number; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int num){
        int original_number=num;
        int sum=0;
        while(num>0){
            int remainder_num=num%10;
            num=num/10;
            sum=sum+remainder_num*remainder_num*remainder_num;
        }
        return sum==original_number;
    }
}
