class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        
        boolean[][] dp = new boolean[n][n];
        
        int start = 0,end = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = i; j >= 0; j--){
                //Checking whether the substring starting at index i and ending at index j is palindromic or not
                if(s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i - 1][j + 1])){   //i-j <= 2 means strings of length <= 3 if string is of length 2 and s[i] == s[j] then it is palindrome and if string is of length 3 and if s[i] == s[j] and only the middle character will be left which is palindrome in itself.
                    dp[i][j] = true;
                }
                
                //Now we will calculate the length of the substring if the substring starting at i and ending at j is palindrome
                if(dp[i][j] && i - j > end - start){
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start,end + 1);
    }
}