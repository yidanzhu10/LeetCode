// "atoi" means ascii to integer
public class L8_StringToIntegerAtoi {
    public int myAtoi(String s) {
        if(s == null || s.length() == 0) return 0;
        int index = 0;
        while(index < s.length() && s.charAt(index) == ' '){
            index ++; // remove whitespace
        }
        if(index == s.length()) return 0;

        int sign = 1;
        if(s.charAt(index) == '+' || s.charAt(index) == '-'){
            if(s.charAt(index) == '-'){
                sign = -1;
            }
            index ++;
        }
        if(index == s.length()) return 0;

        int res = 0;
        while(index < s.length()) {
            char c = s.charAt(index);
            if(c < '0' || c > '9') {
                return res * sign;
            }
            int num = c - '0';
            int temp = res * 10 + num;
            if(Integer.MAX_VALUE / 10 < res || (Integer.MAX_VALUE / 10 == res && Integer.MAX_VALUE % 10 < num)){
                if(sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            res = temp;
            index ++;
        }
        return res * sign;
    }
}
