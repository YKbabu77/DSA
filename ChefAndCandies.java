
import java.util.Scanner;

public class ChefAndCandies {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-->0){
            int N = in.nextInt();
            int c = in.nextInt();
            if(c>N){
                System.out.println(0);
            }else{
                int t = ((N-c)+3)/4;
                System.out.println(t);
            }
        } 
        in.close();
	}
}