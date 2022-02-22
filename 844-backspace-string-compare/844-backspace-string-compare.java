class Solution {
    public boolean backspaceCompare(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            sb1 = updateStringBuilder(c, sb1);
        }
        
        for (char c : t.toCharArray()) {
            sb2 = updateStringBuilder(c, sb2);
        }
        
        return sb1.toString().equals(sb2.toString());
    }
    
    private StringBuilder updateStringBuilder(char c, StringBuilder sb) {
        if (c != '#') {
            sb.append(c);
        } else {
            if (sb.length() >= 1) {
                sb.setLength(sb.length() - 1);
            }
        }

        return sb;
    }
}