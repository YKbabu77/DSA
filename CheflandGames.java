import java.util.Scanner;

public class CheflandGames {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int r1 = in.nextInt();
            int r2 = in.nextInt();
            int r3 = in.nextInt();
            int r4 = in.nextInt();
            if((r1+r2+r3+r4)==0)
                System.out.println("IN");
            else
                System.out.println("OUT");
        }
        in.close();
	}
}
