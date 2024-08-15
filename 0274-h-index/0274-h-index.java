class Solution {
    public int hIndex(int[] citations) {
        // Sort the citations array
        Arrays.sort(citations);

        int n = citations.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int h = n - mid;

            if (citations[mid] == h) {
                return h; // Found the exact h-index
            } else if (citations[mid] < h) {
                left = mid + 1; // Move right to increase h
            } else {
                right = mid - 1; // Move left to decrease h
            }
        }

        return n - left;
    }
}
