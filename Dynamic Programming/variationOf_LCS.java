class Solution {

    public int LCS(int[] nums, int[] arr, int n, int m, int dp[][]) {
        // base case
        if (n == 0 || m == 0) {
            return 0;
        }
        // check if element is found in dp array then return it
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        // if the last element is same return +1;
        if (nums[n - 1] == arr[m - 1]) {
            return dp[n][m] = LCS(nums, arr, n - 1, m - 1, dp) + 1;
        }
        // check 2 cases go to note book for revision
        int ans1 = LCS(nums, arr, n - 1, m, dp);
        int ans2 = LCS(nums, arr, n, m - 1, dp);
        // return max of ans1 and ans2
        return dp[n][m] = Math.max(ans1, ans2);
    }

    public int helper(int[] nums) {
        // creat hashset to remove duplicate element in array
        HashSet<Integer> map = new HashSet<>();
        // put element in map
        for (int num : nums) {
            map.add(num);
        }
        // created new array of size map
        int[] arr = new int[map.size()];
        int i = 0;
        for (Integer num : map) { // put element in new array
            arr[i] = num;
            i++;
        }
        // sort the array in accending order to get the LIS in increasing order
        Arrays.sort(arr);
        // same as LCS approach of DP of memorization
        int n = nums.length;
        int m = arr.length;

        int dp[][] = new int[n + 1][m + 1];

        for (int k = 0; k <= n; k++) {
            for (int j = 0; j <= m; j++) {
                dp[k][j] = -1;
            }
        }

        return LCS(nums, arr, n, m, dp);
    }

    public int lengthOfLIS(int[] nums) {

        return helper(nums);

    }
}