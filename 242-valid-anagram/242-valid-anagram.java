class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> chars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }
        
        List<Character> chars1 = new ArrayList<>();
        for (char ch1 : t.toCharArray()) {
            chars1.add(ch1);
        }
        Collections.sort(chars);
        Collections.sort(chars1);
        
        if(chars.equals(chars1)){
            return true;
        }  
        
        return false;
        
    }
}