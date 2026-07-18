/*Sale Season
It's the sale season again and Chef bought items worth a total of 
X
X rupees. The sale season offer is as follows:

if 
X
≤
100
X≤100, no discount.
if 
100
<
X
≤
1000
100<X≤1000, discount is 
25
25 rupees.
if 
1000
<
X
≤
5000
1000<X≤5000, discount is 
100
100 rupees.
if 
X
>
5000
X>5000, discount is 
500
500 rupees.
Find the final amount Chef needs to pay for his shopping.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of single line of input containing an integer 
X
X.
Output Format
For each test case, output on a new line the final amount Chef needs to pay for his shopping.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
≤
10000
1≤X≤10000
Sample 1:
Input
Output
4
15
70
250
1000
15
70
225
975 */
import java.util.Scanner;

public class SaleSeason {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int X = in.nextInt();
            int amount=0;
            if(X<=100)
                amount=X;
            else if(100<X && X<=1000)
                amount=X-25;
            else if(1000<X && X<=5000)
                amount=X-100;
            else if(X>5000)
                amount=X-500;
            System.out.println(amount);
        }
	}
}
