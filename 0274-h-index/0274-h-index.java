import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort the array in ascending order
        
        int n = citations.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int hIndex = n - mid; // Number of papers with at least hIndex citations
            
            if (citations[mid] >= hIndex) {
                right = mid - 1; // Check if there is a higher possible H-index
            } else {
                left = mid + 1; // Increase the search range
            }
        }

        return n - left; // Return the highest possible H-index found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] citations = {6, 5, 3, 1, 0}; // Example array
        System.out.println("H-index: " + sol.hIndex(citations)); // Output the H-index
    }
}
