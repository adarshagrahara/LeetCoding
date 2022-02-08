class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
       
        for(int i=0;i<n;i++){
              nums[(nums[i]-1)%(n+1)] +=(n+1);
        }
        
        for(int j=0;j<n;j++){
            if(nums[j]/(n+1)>1) return j+1;
        }
        
        return -1;
        
    }
}