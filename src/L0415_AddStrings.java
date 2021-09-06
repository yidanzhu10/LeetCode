public class L0415_AddStrings {
    public String addStrings(String num1, String num2) {
        if(num1 == null || num1.length() == 0) return num2;
        if(num2 == null || num2.length() == 0) return num1;

        int len1 = num1.length();
        int len2 = num2.length();

        String str1 = new StringBuilder(num1).reverse().toString();
        String str2 = new StringBuilder(num2).reverse().toString();

        int carry = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < Math.max(len1, len2); i ++){
            int x = i >= len1 ? 0 : (str1.charAt(i) - '0');
            int y = i >= len2 ? 0 : (str2.charAt(i) - '0');
            int sum = x + y + carry;
            res.append(String.valueOf(sum % 10));
            carry = sum / 10;
        }
        if(carry != 0){
            res.append(String.valueOf(carry));
        }
        return res.reverse().toString();
    }
}
