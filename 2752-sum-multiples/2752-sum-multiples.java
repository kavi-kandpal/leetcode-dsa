class Solution {
    public boolean check(int i){
        if(i%3==0||i%5==0||i%7==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int sumOfMultiples(int n) {
        int sum=0;
        for(int i=3;i<=n;i++){
if(check(i)){
    sum=sum+i;
}
        }
        return sum;
    }
}