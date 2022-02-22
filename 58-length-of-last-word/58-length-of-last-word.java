class Solution {
    public int lengthOfLastWord(String s) {
        
        String [] words;
            words = s.split(" ");
            String a = words[words.length - 1];
            return a.length();
    }
}