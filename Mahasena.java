package CodeChef;

import java.util.Scanner;

public class Mahasena {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		int even=0,odd=0;
		for(int i:arr){
		    if(i%2==0)
		        even++;
		    else
		        odd++;
		}
		System.out.println((even>odd)?"READY FOR BATTLE":"NOT READY");
		in.close();

	}
}

