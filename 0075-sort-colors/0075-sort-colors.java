
class Solution {
    public void sortColors(int[] nums) {
    // we use here count sort we can also use count.sort;
    int a=0;
    int j=0;
    int k=0;
    for(int i=0;i<nums.length;i++){
         if(nums[i]==0){
        a++;
  }
    else if(nums[i]==1){
    j++;
    }
    else{
    k++;
    }    
        }
        for(int i=0;i<nums.length;i++){
            if(a!=0){
                nums[i]=0;
                a--;
            }
            else if(j!=0){
                nums[i]=1;
                j--;
            }
            else{
                nums[i]=2;
            }
        }
    }
}