class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] k = new boolean[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            if(k[nums[i]])return nums[i];
            else k[nums[i]] = true;
        }
        return -1;
    }
}