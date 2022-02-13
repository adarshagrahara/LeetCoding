class Solution {
    public int countValidWords(String sentence) {
        String[] tokens = sentence.split("\\s+");
        int numValidWords = 0; // what we'll return
        
        for (String t : tokens) {
            if (isValidWord(t)) {
                ++numValidWords;
            }
        }
        return numValidWords;
    }
    
    private boolean isValidWord(String s) {
        
        if (s.length() == 0) { // case: zero-length token
            return false;
        }
        
        int numHyphens = 0;
        int numPunctuationMarks = 0;
        
        for (int i = 0; i < s.length(); ++i) {
            
            char c = s.charAt(i);
            
            if (c >= 48 && c <= 57) { // case: token contains digit
                return false;
            }
            
            if (c < 48) {
                if (c == '-') {
                    ++numHyphens;
                    if (numHyphens > 1) { // case: token contains more than one hyphen
                        return false;
                    }
                    if (i == 0 || i == s.length() - 1) { // case: hyphen can't be surrounded by letters
                        return false;
                    }
                    if (!(isLowercaseLetter(s.charAt(i - 1)) && isLowercaseLetter(s.charAt(i + 1)))) { // case: hyphen isn't surrounded by letters
                        return false;
                    }
                } else { // c ==  '!' or '.' or  ',' or  ' '
                    ++numPunctuationMarks;
                    if (numPunctuationMarks > 1) {
                        return false; // case: token contains more than one punctuation mark
                    }
                    if (i != s.length() - 1) {
                        return false; // case: token contains punctuation mark not at end of token
                    }
                }
            }
        }
        
        return true;
    }
    
    private boolean isLowercaseLetter(char c) {
        if (c >= 97 && c <= 122) {
            return true;
        } else {
            return false;
        }
    }
}