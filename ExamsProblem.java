package CodeChef;

import java.util.Scanner;

public class ExamsProblem {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int X=in.nextInt();
            int Y=in.nextInt();
            int avg=(X*Y)/2;
            int Z=in.nextInt();
            if(Z>avg)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
	}
}
