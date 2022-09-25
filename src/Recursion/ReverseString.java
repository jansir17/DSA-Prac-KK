package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str= "WellDev";
        str= reverseString(str);
        System.out.println(str);
    }
    static String reverseString(String n){
        if(n==null || n.length()<=1){
            return n;
        }
        return reverseString(n.substring(1))+n.charAt(0);
    }
}
