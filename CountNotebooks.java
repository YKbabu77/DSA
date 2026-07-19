
import java.util.Scanner;

public class CountNotebooks 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-->0){
            int N = in.nextInt();
            System.out.println(N*10);
        } 
        in.close();
	}
}
