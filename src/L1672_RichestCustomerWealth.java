public class L1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int[] sumOfRow = new int[accounts.length];
        for(int i = 0; i < accounts.length; i ++) {
            sum = 0;
            for (int num : accounts[i]) {
                sum += num;
            }
            sumOfRow[i] = sum;
        }
        int max = 0;
        for(int j = 0; j < sumOfRow.length; j ++) {
            max = Math.max(sumOfRow[j], max);
        }
        return max;
    }
}
