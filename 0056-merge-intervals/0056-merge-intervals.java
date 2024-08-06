class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length<=1) return intervals;
        List<int[]>res = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        int[] newInterval = intervals[0];
        res.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }else{

                newInterval = interval;
                res.add(newInterval);

            }
        }


        return res.toArray(new int[res.size()][]);
    }
}