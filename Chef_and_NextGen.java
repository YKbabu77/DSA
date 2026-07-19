import java.util.Scanner;

public class Chef_and_NextGen {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            if(x*y >= a*b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
	}
}

