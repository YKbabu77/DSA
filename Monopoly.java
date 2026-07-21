
import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int p = in.nextInt();
            int q = in.nextInt();
            int r = in.nextInt();
            int s = in.nextInt();
            if((p>q) && (p>r) && (p>s)){
                System.out.println(((q+r+s)<p)?"YES":"NO");
            }else if((q>p) && (q>r) && (q>s)){
                System.out.println(((p+r+s)<q)?"YES":"NO");
            }else if((r>p) && (r>q) && (r>s)){
                System.out.println(((q+p+s)<r)?"YES":"NO");
            }else if((s>p) && (s>q) && (s>r)){
                System.out.println(((p+q+r)<s)?"YES":"NO");
            }
        }
    }
}
