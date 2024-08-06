class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {

        int[][] newArray = new int[intervals.length + 1][2];

        // Copy existing intervals to the new array
        for (int i = 0; i < intervals.length; i++) {
            newArray[i] = intervals[i];
        }

        // Add the new interval to the end of the new array
        newArray[intervals.length] = newinterval;

    
        List<int[]>res = new ArrayList<>();

        Arrays.sort(newArray, Comparator.comparingInt(i -> i[0]));

        int[] newInterval = newArray[0];
        res.add(newInterval);

        for(int[] interval : newArray){
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