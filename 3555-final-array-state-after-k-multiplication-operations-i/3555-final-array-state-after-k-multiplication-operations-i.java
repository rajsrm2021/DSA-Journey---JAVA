class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            // Find the index of the minimum value
            int minIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }

            // Replace the minimum value with its product with multiplier
            nums[minIndex] *= multiplier;

            // Decrement k to move to the next operation
            k--;
        }

        return nums;
    }
}
