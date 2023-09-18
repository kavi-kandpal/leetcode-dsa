class Solution {
   public  int maximumWealth(int[][] accounts) {
        int count = 0;
        for (int i = 0; i < accounts.length; i++) {
            int counter = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                counter += accounts[i][j];

            }
            if (counter >= count) {
                count = counter;
            }
        }
        return count;
    }
}