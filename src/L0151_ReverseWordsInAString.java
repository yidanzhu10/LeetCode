public class L0151_ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] list = s.split("\\s+");
        String res = "";
        for(int i = list.length - 1; i >= 0; i --) {
            res += list[i] + " ";
        }
        return res.trim();
    }
}
