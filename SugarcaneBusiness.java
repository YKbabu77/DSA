
import java.util.Scanner;

public class SugarcaneBusiness {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-->0){
            int g = in.nextInt();
            double p = (g*50)*0.3;
            System.out.println((int)p);
        } 
        in.close();
	}
}