package com.company;

public class Shadow {
    static int x= 50; //this value is access by anywhere in this block. this is called class variable.
    public static void main(String[] args) {
        System.out.println(x);  //50
        int x= 40; //we are now shadowing x over above x. and following all x will be changed.
        fun1(x); //40
        fun2();  //50
    }
    static void fun1(int x){
        //we have received the value 40 as we are passing it
        System.out.println(x);
    }
    static void fun2(){
        //this fun2 does not taking any parameter so x will be 50.
        System.out.println(x);
    }
}
