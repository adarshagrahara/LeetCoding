class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1]){
            return nums.length;
        } else if(target < nums[0]){
            return 0;
        } else if(nums.length == 1){
            if(nums[0] >= target){
                return 0;
            } else{
                return 1;
            }
        }
        for(int i = 0;i<nums.length;i++){
            if(target == nums[i]){
                return i;
            }
            if(target >= nums[i] && target <= nums[i+1]){
                return i+1;
            }
        }
        return -1;
        
    }
}