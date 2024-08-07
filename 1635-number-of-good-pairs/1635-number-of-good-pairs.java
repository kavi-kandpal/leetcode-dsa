class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];  // Assuming values are in the range 0 to 100
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans += count[nums[i]];
            count[nums[i]]++;
        }

        return ans;
    }
}
