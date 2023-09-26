class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<20;i++){
            int y=(int)Math.pow(3,i);
            if(y==n){
                return true;
            }
        }
        return false;
    }
}