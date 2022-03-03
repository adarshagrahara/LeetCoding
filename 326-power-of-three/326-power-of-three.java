class Solution {
    public boolean isPowerOfThree(int n) {
        return (n == 0) ? false : Math.pow(3,Math.round(Math.log(n)/Math.log(3))) == (double)n;
    }
}