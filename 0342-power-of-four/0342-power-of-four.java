class Solution {
    public boolean isPowerOfFour(int n) {
        int t=0;
        for(int i=0;i<16;i++){
             t=(int)Math.pow(4,i);
            if(t==n){
                return true;
            }
        }
        return false;
    }
}