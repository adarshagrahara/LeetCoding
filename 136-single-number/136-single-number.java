class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length){
            if(i == nums.length-1){
                return nums[i];
            }
            if(nums[i] == nums[i+1]){
                i+=2;
                continue;
            } else{
                return nums[i];
            }
            
        }
        return nums[nums.length -1];
        
    }
}