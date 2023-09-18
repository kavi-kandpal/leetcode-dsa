class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int newsum = 0;
        for (int i = 0; i < accounts.length; i++) {
            newsum = 0;
            for(int p = 0; p < accounts[i].length; p++){
                newsum = newsum + accounts[i][p];
            }
            if (newsum > sum) {
                sum = newsum;
            }
        }
        return sum;
    }
}