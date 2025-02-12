import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // O(n log n) sorting
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicates found
    }
}
