package CodeChef;
import java.util.Scanner;

public class AssignmentsProblem {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-->0){
		    int val = in.nextInt();
		    if((val+3)<=10)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}

	}
}

