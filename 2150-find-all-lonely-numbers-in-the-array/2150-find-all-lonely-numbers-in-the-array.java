class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList();
        HashMap<Integer, Integer> s = new HashMap();
        for (int i: nums) {
            s.put(i, s.getOrDefault(i, 0) + 1);
        }
        
        for (int i: nums) {
            if (s.get(i) == 1 && !s.containsKey(i+1) && !s.containsKey(i-1)) ans.add(i);
        }
        
        return ans;
    }
}