
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        int val = RomanNum("MCMXCIV");
        System.out.println("Value : "+val);
    }
    public static int RomanNum(String s){
        HashMap<Character,Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        int prev = 0, total = 0;
        for (int i = 0; i < s.length(); i++) {
            int now = romans.get(s.charAt(i));
            if(prev < now){
                total = (total-prev-prev)+now;
            }else{
                total+=now;
            }
            prev = now;
        }
        return total;
    }
}
