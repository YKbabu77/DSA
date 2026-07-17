/*CRED coins
For each bill you pay using CRED, you earn 
X
X CRED coins.
At CodeChef store, each bag is worth 
100
100 CRED coins.

Chef pays 
Y
Y number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store. */
import java.util.Scanner;

public class CREDcoins {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0){
		    int X = in.nextInt();
		    int Y = in.nextInt();
		    int sum = (X*Y)/100;
		    System.out.println(sum);
		}
		in.close();
	}
}
