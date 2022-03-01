class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
    int maxo = Integer.MAX_VALUE;
    int p = 0;
    for(int i=0; i<nums.length; i++){
        int lumps = nums[i];
        int j = i+1;
        int k = nums.length-1;
        while(j < k){
            if(lumps+nums[j]+nums[k] == target){
                return target;
            }
            else if(lumps+nums[j]+nums[k] > target){
                int o = (int)(Math.abs(lumps+nums[j]+nums[k]-target));
                if(o < maxo){
                    maxo = o;
                    p = lumps+nums[j]+nums[k];
                }
                k--;
            }
            else{
                int o = (int)(Math.abs(target-lumps-nums[j]-nums[k]));
                if(o < maxo){
                    maxo = o;
                    p = lumps+nums[j]+nums[k];
                }
                j++;
            }
        }
    }
    return p;
    }
}