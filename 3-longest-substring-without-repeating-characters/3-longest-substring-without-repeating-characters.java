class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int slow = 0;
        int maxLen = 0;
        for(int fast = 0; fast < s.length(); fast++){
            char c = s.charAt(fast);
            if(map.containsKey(c)){
                if(map.get(c) >= slow)
                    slow = map.get(c) + 1;
            }
            maxLen = Math.max(maxLen, fast - slow + 1);
            map.put(s.charAt(fast), fast);
        }
        return maxLen;
    }
}