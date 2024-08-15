class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n - 1;  // Start with the last index as the goal
        
        // Traverse the array from the end to the beginning
        for (int i = n - 1; i >= 0; i--) {
            // If from index i, you can reach or go beyond the current goal, update the goal to i
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
        
        // If the goal has reached the start of the array, return true
        return goal == 0;
    }
}
