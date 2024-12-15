class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {

        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] singleClass : classes) {

            int passed = singleClass[0];
            int total = singleClass[1];

            double gain = (double) calculateAvg(passed, total);

            pq.add(new double[] { gain, passed, total });
        }

        while(extraStudents-- > 0){
            double[] curr = pq.poll();
            double gain = curr[0];
            int pass = (int)curr[1];
            int total = (int)curr[2];

            pq.offer(
                new double[]{
                    calculateAvg(pass+1,total+1),
                    pass+1,
                    total+1

                }
            );

            
        }

        double totalPassRatio = 0;

        while(!pq.isEmpty()){
            double[] curr = pq.poll();
            int pass = (int)curr[1];
            int total = (int)curr[2];
            totalPassRatio += (double) pass/total;

        }

        return totalPassRatio / classes.length;

    }

    public double calculateAvg(int a, int b) {
        return ((double) (a + 1) / (b + 1) - (double) a / b);
    }
}