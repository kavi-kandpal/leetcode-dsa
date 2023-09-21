class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int a;
        int v=nums1.length+nums2.length;
          int [] arr=new int [v];
        if(nums1.length>nums2.length)
       { a=nums1.length-nums2.length;}
       else
       { a=nums2.length-nums1.length;}
       int count=0;
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
            count++;
        }
        for(int i=0;i<nums2.length;i++){
            arr[count]=nums2[i];
        count++;
        }
        Arrays.sort(arr);
      double e;
        int q;
        double r;
        if(arr.length%2==0){
             int k=arr.length/2;
q=arr[k-1]+arr[k];
r=(double)q/2;
return r;
        }
 int s=arr.length/2;
            e=arr[s];
            return e;
    }
}