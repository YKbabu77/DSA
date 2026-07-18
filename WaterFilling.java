import java.util.Scanner;

public class WaterFilling {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int b1 = in.nextInt();
            int b2 = in.nextInt();
            int b3 = in.nextInt();
            if((b1+b2+b3)<=1)
                System.out.println("Water filling time");
            else
                System.out.println("Not now");
        }
        in.close();
	}
}