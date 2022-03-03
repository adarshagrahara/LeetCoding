class Solution {
    public int majorityElement(int[] nums) {
        return Arrays.stream(nums).sorted().skip(nums.length/2).findFirst().orElseGet(() -> nums[nums.length - 1]);
    }
}