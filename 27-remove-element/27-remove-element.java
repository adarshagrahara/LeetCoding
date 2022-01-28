class Solution {
    private int idx = -1;
	
	public int removeElement(int[] nums, int val) {
		for ( int i = 0; i < nums.length; i++ ) {
			if ( nums[i] == val && idx == -1 ) {
				idx = i;
			} else if ( nums[i] != val && idx >= 0 ) {
				int temp = nums[idx];
				nums[idx] = nums[i];
				nums[i] = temp;
				idx++;
			}
		}
		return idx == -1 ? nums.length : idx;
    }
}