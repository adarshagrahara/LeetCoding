class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == -2147483648 && divisor == -1) return 2147483647;
        if(dividend == -2147483648 && divisor == 1) return -2147483648;
            
            return (int) Math.floor(dividend/divisor);
    }
}