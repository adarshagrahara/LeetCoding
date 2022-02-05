class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
                  if(words[i].equals(new StringBuffer(words[i]).reverse().toString())) return words[i];
            
            }
            return "";
        
    }
}