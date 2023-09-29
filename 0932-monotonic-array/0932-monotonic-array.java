class Solution {
    public boolean isMonotonic(int[] nums) {
        int c=0;
        int k=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                c++;
            }
        }
         for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                k++;
            }
        }
        if(nums.length-1==c){
            return true;
        }
         if(nums.length-1==k){
            return true;
        }
        return false;
    }
}