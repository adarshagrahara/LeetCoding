class Solution {
      public int[] searchRange(int[] nums, int target) {
            List<Integer> l = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                  if (nums[i] == target) {
                        l.add(i);
                  }
            }
            if (l.size() == 1) {
                  l.add(l.get(0));
                  return l
                              .stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
                  
            } else if (l.size() == 0) {
                  return new int[]{-1, -1};
                  
            } else if (l.size() > 2) {
                  for (int i = 1; i < l.size() - 1; ) {
                        l.remove(i);
                  }
                  
                  return l
                              .stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
            } else {
                  return l
                              .stream()
                              .mapToInt(Integer::intValue)
                              .toArray();
            }
      }
}