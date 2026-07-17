package CodeChef;

import java.util.Scanner;

public class ChefInHisOffice {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		if(in.hasNextInt()){
		    int n = in.nextInt();
		    while(n-->0){
		        int X = in.nextInt();
		        int Y = in.nextInt();
		        System.out.println((X*4)+Y);
		    }
		}
		in.close();

	}
}
