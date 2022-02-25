class Solution {
    public String shortestPalindrome(String s) {
        int len = s.length();
        if(len<=1)
            return s;
        StringBuilder tail = new StringBuilder(s+"#");
        tail.reverse();
        String restruct = s+tail.toString();
        int[] next = new int[restruct.length()];
        int i = 1;
        int j = 0;
        while(i<restruct.length()){
            
         if(restruct.charAt(i) ==restruct.charAt(j)){
                j++;
                next[i] = j;
                i++;
            }else{
                if(j==0){
                    next[i] = 0;
                    i++;
                }else{
                    j=next[j-1];
                }
               
            }
            
        }
        int end = next[restruct.length()-1];

      return tail.substring(1,len-end+1)+s;  
    }
    
}