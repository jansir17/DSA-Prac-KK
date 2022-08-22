package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fruit=sc.next();
        String apple_color=sc.next();
        //Remember that, .eauals checks the value only, double== checks refference

        //remember if we dont put break statement then all the rest of code will get executed.
        //remember duplicate case are NOT allowed, for ex: "Mango" twice.
        //following is enhanced switch example with nested switch case.
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruit");
            case "Apple" -> {
                switch (apple_color) {
                    case "Red" -> System.out.println("Yummy Red");
                    case "Green" -> System.out.println("Yummy Green");
                    default -> System.out.println("Didn't mention color!!");
                }
            }
            case "Jackfruit" -> System.out.println("National Fruit");
            default -> System.out.println("You dont like fruit ? -_-");
        }
        //we can use above type enhanced switch case or we can use old school break case swtich syntax


    }
}
