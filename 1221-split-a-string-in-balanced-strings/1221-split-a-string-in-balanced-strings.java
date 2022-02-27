class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l=0;
        int count = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            if(c == 'R')
            {
                r++;
            }
            if(c == 'L')
            {
                l++;
            }
            if(l==r)
            {
                count++;
                l=0;
                r=0;
            }
        }
        return count;
    }
}