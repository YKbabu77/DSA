package Leetcode;

public class NumberOfUniqueTriplets {
    public static void main(String[] args) {
        int[] arr = {1,2};
        int val = uniqueXorTriplets(arr);
        System.out.println("Number Of Unique Triplets:"+val);
    }
    public static int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n == 1) return 1;
        if (n == 2) return 2;

        int bits = 32 - Integer.numberOfLeadingZeros(n);
        return 1 << bits;
    }
}
