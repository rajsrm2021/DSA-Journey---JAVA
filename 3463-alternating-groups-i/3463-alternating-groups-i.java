class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        if (colors == null || colors.length < 3) {
            return 0;
        }
        
        int n = colors.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int prev = colors[(i - 1 + n) % n];
            int current = colors[i];
            int next = colors[(i + 1) % n];
            
            // Check if current forms an alternating group with its neighbors
            if (current != prev && current != next) {
                count++;
            }
        }
        
        return count;
    }
}
