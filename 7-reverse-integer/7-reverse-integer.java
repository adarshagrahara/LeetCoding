class Solution {
    public int reverse(int x) {
       long count = 0;
        while(x/10 != 0){
            count += x % 10;
            x = x / 10;
            count = count * 10;
            if(count > Integer.MAX_VALUE || count < Integer.MIN_VALUE){
                return 0;
            }
        }
        if(count+x < Integer.MAX_VALUE) {
            return (int) count + x;
        }
        else
        {
            return 0;
        }
        
    }
}