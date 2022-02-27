class Solution {
      public String longestCommonPrefix(String[] strs) {
            String first = strs[0];
        int last = first.length()-1;
        for (int i = 1; i < strs.length; i++){
            String s = strs[i];
            int j;
            for (j = 0; j < strs[i].length() && j < last+1; j++) {
                if (s.charAt(j) != first.charAt(j)) break;
            }
            if (j == 0) {
                last = -1;
                break;
            }
            if (j >= 1) { 
                last = j-1;
            }
        }
        return (last < 0) ? "" : first.substring(0, last+1);
      }
      
}