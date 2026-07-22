package Leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int maxwealth = maximumWealth(accounts);
        System.out.println(maxwealth);
    }
    public static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] i:accounts){
            int wealth=0;
            for(int j=0;j<i.length;j++){
                wealth+=i[j];
            }
            if(max==0){
                max=wealth;
            }
            if(wealth>max){
                max=wealth;
            }
        }
        return max;
    }
}
