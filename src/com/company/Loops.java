    package com.company;

    import java.util.Scanner;
    public class Loops {
        public static void main(String[] args) {
            //        //normal for loop
            //        for (int i = 0; i <= 5; i += 1) {
            //            System.out.println(i);
            //        }


            //Finding maximum
            //        Scanner sc = new Scanner(System.in);
            //        int a = sc.nextInt();
            //        int b = sc.nextInt();
            //        int c = sc.nextInt();
            //
            //        int maximum = a;
            //        if (b > maximum) {
            //            maximum = b;
            //        }
            //        if (c > maximum) {
            //            maximum = c;
            //        }
            //        System.out.println(maximum);

            //Math Max
            //        int max= (Math.max(65,Math.max(37,57)));
            //        System.out.println(max);

            //        //Character Checks
            //        Scanner sc = new Scanner(System.in);
            //        char ch= sc.next().trim().charAt(1);
            //        System.out.println(ch);
            //        if(ch>='a' && ch<='z')
            //        {
            //            System.out.println("LowerCase");
            //        }
            //        else
            //        {
            //            System.out.println("UpperCase");
            //        }

            //Fibonacchi nth number
            Scanner sc = new Scanner(System.in);
            int nth = sc.nextInt();
            int prev = 0;
            int next = 1;
            for (int i = 0; i < nth; i++) {
                int temp= next;
                next = next+prev;
                prev =temp;
            }
            System.out.println(prev);
        }
    }