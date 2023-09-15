class Solution {
    public int[] twoSum(int[] nums, int target) {
      int arr[]=new int[2];
    //   int k=0;
      for(int i=0;i<nums.length;i++){
          int a=0;
          for(int j=i+1;j<nums.length;j++){
          a=nums[i]+nums[j];
          if(a==target){
arr[0]=i;
arr[1]=j;
          }
          }
      }
      return arr;
    }
}