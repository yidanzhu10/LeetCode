public class L0557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] list = s.split("\\s+");
        StringBuilder res = new StringBuilder();

        for(String word : list) {
            res.append(new StringBuffer(word).reverse() + " ");
        }
        return res.toString().trim();
    }
}
