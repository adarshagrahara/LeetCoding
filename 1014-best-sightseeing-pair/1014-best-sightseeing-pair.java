class Solution {
    public static int maxScoreSightseeingPair(int[] values) {
        int max = -1;
        int currMax = values[0];
        for(int i =1;i<values.length;i++){
            int tempMax = currMax + (values[i] - i);
            max = Math.max(tempMax, max);
            currMax = Math.max(currMax, values[i] + i);
        }
        return max;
    }
}