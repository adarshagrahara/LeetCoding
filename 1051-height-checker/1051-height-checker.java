class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < expected.length; i++)
        {
            if (expected[i] != heights[i])
                count = count + 1;
        }

        return count;
    }
}