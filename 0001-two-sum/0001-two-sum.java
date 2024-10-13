class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = i + 1; // j should start as i + 1, not equal to i
        int arr[] = new int[2];
        int n = nums.length;
        
        while (i < n) {
            if (j < n) {
                int key = nums[i] + nums[j];
                if (key == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
                j++;
            } else {
                i++;
                j = i + 1; 
        }
   
    }
         return arr;
}
}
