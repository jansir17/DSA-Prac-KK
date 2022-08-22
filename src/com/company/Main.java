package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            Scanner k= new Scanner(System.in);
            int name= k.nextInt();
            System.out.println(name+ " is this number ?");
        }
    }
}
