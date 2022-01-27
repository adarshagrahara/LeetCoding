class Solution {
      public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            List<Double> l = new ArrayList<Double>();
            for (double j : nums1) {
                  l.add(j);
            }
            for (double i : nums2){
                  l.add(i);
            }
            Collections.sort(l);
            if(l.size() %2 == 0){
                  return (l.get(l.size()/2) + l.get(l.size()/2 - 1))/2;
            } else{
                  return l.get((l.size()+1)/2 - 1);
            }
      }
}