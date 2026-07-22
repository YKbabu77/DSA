package Leetcode;

import java.util.Scanner;

public class PalindroneNumber {
    public static boolean isPalindrome(int x) {
        int reversed=0;
        if(x<0){
            return false;
        }
        int val=x;
        while(val!=0){
            int rem=val%10;
            reversed=reversed*10+rem;
            val=val/10;
        }
        if(reversed==x){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean res=isPalindrome(x);
        System.out.println("Is given number is palindrome:"+res);
        sc.close();
    }
}