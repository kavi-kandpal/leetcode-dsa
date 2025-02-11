class Solution {
    public int searchInsert(int[] nums, int target) {
        int k=0;
        if(nums[0]==1 && target==0)return k;
        
        if(target>nums[nums.length-1])return nums.length;

        for(int i=0;i<nums.length-1;i++){
               int j=i+1;
            if(nums[i]==target){
                return i;
            }
             else if(nums[i]<target && nums[j]>=target ){
                return i+1;
             }
           
        }
        return 0;
    }
}