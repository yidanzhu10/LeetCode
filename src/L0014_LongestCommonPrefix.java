public class L0014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        String pre = strs[0];
        for(int i = 1; i < strs.length; i ++) {
            while(!strs[i].startsWith(pre)){ // Or while(strs.indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
                if(pre.length() == 0) return "";
            }
        }
        return pre;
    }
    public static String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        for(int i = 0; i < strs[0].length(); i ++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j ++) {
                if(i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[j].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"Flower", "Flow", "Flight"};
        longestCommonPrefix2(strs);
    }
}
