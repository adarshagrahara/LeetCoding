class Solution {
    public boolean isPalindrome(int x) {
            if(x >= 0 ){
                int original = x;
            int reversed = 0;
            
            for (; x != 0; x /= 10) {
                  int digit = x % 10;
                  reversed = reversed * 10 + digit;
            }
            
            return original == reversed;
            }
            return false;
    }
}