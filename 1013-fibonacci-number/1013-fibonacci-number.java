class Solution {
    public int fib(int n) {
        int p1 = 0, p2 = 1, num = 0;
        if (n == 0) return 0;
        else if (n==1) return 1;
        else {
            while(n-->1){
                num = p1 + p2;
                p1 = p2;
                p2 = num;
            }
        }
        return num;
    }
}