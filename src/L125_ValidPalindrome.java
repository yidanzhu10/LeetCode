import java.util.Locale;

/* A palindrome is a word, number, phrase, or other sequence of characters
   which reads the same backward as forward
*/
public class L125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}|\\s", "").toLowerCase();
        // remove all punctuations and spaces in a string.
        char[] c = s.toCharArray();
        int n = c.length;
        int j = n - 1;
        int i = 0;
        while (i < j) {
            if(c[i] == c[j]) {
                i ++;
                j --;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
