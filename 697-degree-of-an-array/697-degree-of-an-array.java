class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        int degree=0,len=0;
        HashMap<Integer,Integer> first=new HashMap<>();//to store index of its first occurrence
        for(int i=0;i<nums.length;i++)
        {
            first.putIfAbsent(nums[i],i);
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
            if(freq.get(nums[i]) > degree)
            {
                degree=freq.get(nums[i]);
                len=i-first.get(nums[i])+1;
            }
            else if(freq.get(nums[i]) == degree)
            {
                len=Math.min(len,i-first.get(nums[i])+1);
            }
        }
        return len;
    }
}