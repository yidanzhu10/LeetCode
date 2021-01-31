import java.util.HashMap;

public class L13_RomanToInteger {
    public int romanToInt(String s) {
        int len = s.length();
        HashMap<Character, Integer> value = new HashMap();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);
        int ans = value.get(s.charAt(len - 1));
        for(int i = len - 2; i >= 0; i --) {
            if(value.get(s.charAt(i)) >= value.get(s.charAt(i + 1))) {
                ans += value.get(s.charAt(i));
            }
            else{
                ans -= value.get(s.charAt(i));
            }
        }
        return ans;
    }
}
