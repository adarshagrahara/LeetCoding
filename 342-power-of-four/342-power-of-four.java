class Solution {
    public boolean isPowerOfFour(int n) {
        return (n == 0) ? false : Math.pow(4,Math.round(Math.log(n)/Math.log(4))) == (double)n;
    }
}