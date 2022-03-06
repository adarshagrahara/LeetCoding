class Solution {
    public int jump(int[] nums) {
        int a=0;
        int jumps=0;
        int b=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i]>b) b=i+nums[i];
            if(i==a) {
                 a=b;
                 jumps++;
            }
        }
        return jumps;
    }
}