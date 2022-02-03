class Solution {
    
      
      
      public int findFinalValue(int[] nums, int original) {
            Arrays.sort(nums);
        
        int start  = 0;
        int last = nums.length-1;
        
        while(start<=last) {
            int mid = start + (last-start)/2;
            if(nums[mid]==original) {
                original*=2;
                start = mid+1;
                last = nums.length-1;
            }else if(nums[mid]>original) last = mid-1;
            else start = mid+1;
        }
        
        return original;
      }
}