/*Minimum Pizzas
Each pizza consists of 4 slices. There are N friends and each friend needs exactly X slices.

Find the minimum number of pizzas they should order to satisfy their appetite.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of two integers N and X, the number of friends and the number of slices each friend wants respectively.
Sample 1:
Input
Output
4
1 5
2 6
4 3
3 5 */
import java.util.Scanner;
public class MinimumPizzas {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int N = in.nextInt();
            int X = in.nextInt();
            int NoP = ((N*X)+3)/4;
            System.out.println(NoP);
        }
	    in.close();
	}
}