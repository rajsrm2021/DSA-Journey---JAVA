class Solution {
      private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    // Method to find the minimum digit sum in the array
    public int minElement(int[] nums) {
        int n = nums.length;
        
        // Replace each number with its digit sum
        for (int i = 0; i < n; i++) {
            nums[i] = digitSum(nums[i]);
        }

        // Find the minimum element in the modified array
        int ans = Arrays.stream(nums).min().getAsInt();
        return ans;
    }

}