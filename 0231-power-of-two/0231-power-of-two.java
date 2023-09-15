class Solution {
    public boolean isPowerOfTwo(int n) {
        int ipot=0;
        for(int i=0; i<31; i++){
            ipot =(int) Math.pow(2,i);
            if(ipot==n){
                return true;
            }
        }
        return false; 
    }
}
