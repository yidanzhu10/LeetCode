public class L0006_ZigzagConversion {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i ++) {
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while(i < s.length()) {
            int rowIndex = 0;
            while(i < s.length() && rowIndex < numRows) {
                sb[rowIndex].append(s.charAt(i));
                i ++;
                rowIndex ++;
            }
            rowIndex -= 2;
            while(i < s.length()  && rowIndex > 0) {
                sb[rowIndex].append(s.charAt(i));
                i ++;
                rowIndex --;
            }
        }
        for(int j = 1; j < numRows; j ++) {
            sb[0].append(sb[j].toString());
        }
        return sb[0].toString();
    }
}
