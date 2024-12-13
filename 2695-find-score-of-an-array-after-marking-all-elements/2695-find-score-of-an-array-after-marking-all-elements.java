import java.util.PriorityQueue;

class Solution {
    class Pair {
        int num;
        int idx;

        public Pair(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }

    public long findScore(int[] nums) {
        int n = nums.length;
        boolean[] mark = new boolean[n];

        // Priority Queue with a comparator to handle ties
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.num == b.num) {
                return a.idx - b.idx; // Smaller index first
            }
            return a.num - b.num; // Smaller value first
        });

        // Fill the priority queue
        for (int i = 0; i < n; i++) {
            pq.add(new Pair(nums[i], i));
        }

        long score = 0;

        // Process the priority queue
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int val = curr.num;
            int index = curr.idx;

            // Only process if the current index is not marked
            if (!mark[index]) {
                score += val;

                // Mark current index and its neighbors
                mark[index] = true;
                if (index > 0) {
                    mark[index - 1] = true;
                }
                if (index < n - 1) {
                    mark[index + 1] = true;
                }
            }
        }

        return score;
    }
}
