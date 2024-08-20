class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int result[] = new int[n];
        int left[] = new int[n];
        int right[] = new int[n];

        // calculate left product;
        left[0] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // calculate right product
        right[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // calculate the result

        for (int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }

        return result;

    }
}