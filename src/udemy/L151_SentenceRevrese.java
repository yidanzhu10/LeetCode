package udemy;

public class L151_SentenceRevrese {

	public static void main(String[] args) {
		String s = "The sky is blue";
		reverseWords(s);

	}
	public static String reverseWords(String s) {
		
		String [] words = s.split("\\s+");
		String reverseWords = "";
		
		for (int i = words.length - 1; i > 0; i --) {
			reverseWords = words[i] + words[i - 1];
		}
		String result = reverseWords.trim();
		
		return result;
        
    }

}
