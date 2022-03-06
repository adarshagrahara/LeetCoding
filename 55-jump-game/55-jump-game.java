class Solution {
    public boolean canJump(int[] nums) {
        int maxReachablePos= 0;
        for(int i=0; i<nums.length-1; i++){
            maxReachablePos = Math.max(maxReachablePos, i+nums[i]);
            if(i >= maxReachablePos){
                return false;
            }
        }
        return true;
    }
}