class Solution {
    public double largestTriangleArea(int[][] points) {
        int size = points.length;
        double ret = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                for (int k = j + 1; k < size; k++) {
                    int x1 = points[i][0] - points[k][0];
                    int y1 = points[i][1] - points[k][1];
                    double area = Math.abs(x * y1 - y * x1) / (2 * 1.000000);
                    if (area > ret) {
                        ret = area;
                    }
                }
            }
        }
        
        return ret;
    }
}