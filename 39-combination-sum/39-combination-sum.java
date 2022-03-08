class Solution {
   public void backtrack(int idx,int target ,int[] nums,List<Integer> ans ,List<List<Integer>> answer){
        if (idx == nums.length){
           if (target == 0){
            answer.add(new ArrayList<>(ans));
            return ;
           }
        }
        if (idx<nums.length){
            if (nums[idx] <= target){  
               ans.add(nums[idx]);
               backtrack(idx,target-nums[idx],nums,ans,answer);
               ans.remove(ans.size()-1);
           }
    
           backtrack(idx+1,target,nums,ans,answer);
        }
        return ;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> answer= new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(0,target,candidates,ans,answer);
        return answer;
    }
}