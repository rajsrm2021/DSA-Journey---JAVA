class Solution {
    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, Comparator.comparingInt(i -> i[0]));
        int count = 1;

        int newInterval[] = points[0];

        for (int[] point : points) {
            
            if (point[0] > newInterval[1]) {
                count++;
                newInterval = point; // Move to the new interval
            } else {
                // Update the end of the overlapping interval
                newInterval[1] = Math.min(newInterval[1], point[1]);
            }
        }

        return count;

    }
}