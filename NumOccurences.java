
import java.util.Scanner;

public class NumOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number value:");
        int num=sc.nextInt();
        System.out.println("Enter digit to find how many times it was occured in number:");
        int val=sc.nextInt();
        int count=0;
        while (num>=1) {
            int r=num%10;
            if(r==val){
                count++;
            } 
            num/=10;
        }
        System.out.println("The "+val+" was "+count+"  times occured ");
        sc.close();
    }
}