package Leetcode;


import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs=new int[2];
        for (int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    indexs[0]=i;
                    indexs[1]=j;
                }
            }
        }
        return indexs; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter elements:");
        for (int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int target=sc.nextInt();
        int[] ret=twoSum(nums,target);
        System.out.println(Arrays.toString(ret));
        sc.close();
    }
}
