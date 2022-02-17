class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length){
            if(i == nums.length-1){
                return nums[i];
            }
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                i+=3;
                continue;
            } else{
                return nums[i];
            }
            
        }
        return nums[nums.length -1];
    }
}