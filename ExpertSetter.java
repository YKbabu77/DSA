import java.util.Scanner;

public class ExpertSetter {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int x = in.nextInt();
            int y = in.nextInt();
            if(2*y>=x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        in.close();
	}
}