import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) { // If adjacent elements are not equal
                return nums[i];
            }
        }
        return nums[nums.length - 1]; // Last element is the single one
    }
}
