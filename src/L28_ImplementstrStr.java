import java.util.HashSet;
import java.util.Set;

public class L28_ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(haystack == null || haystack.length() < needle.length()) return -1;
        if(haystack == null || needle.length() == 0) return 0;

        for(int i = 0 ; i < haystack.length(); i ++){
            if(haystack.charAt(i) == needle.charAt(0)){
                int len = 0;
                while(i + len < haystack.length() && len < needle.length() && haystack.charAt(i + len) == needle.charAt(len)) {
                    len ++;
                }
                if( len == needle.length()) return i;
            }
        }
        return -1;
    }
    public int strStr2(String haystack, String needle){
        if(haystack == null || needle == null) return 0;
        int m = haystack.length();
        int n = needle.length();
        Set<String> set = new HashSet<>();
        set.add(needle);

        for(int i = 0; i < m - n + 1; i ++) {
            String cur = haystack.substring(i, i + n);
            if(set.contains(cur)) return i;
        }
        return -1;
    }
}
