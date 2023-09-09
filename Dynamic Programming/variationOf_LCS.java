class Solution {

    public int LCS(int[] nums, int[] arr, int n, int m, int dp[][]){
  
        if(n == 0 || m == 0) {
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(nums[n-1] == arr[m-1]) {
            return dp[n][m] = LCS(nums, arr, n-1, m-1, dp) + 1;
        }

        int ans1 = LCS(nums, arr, n-1, m, dp);
        int ans2 = LCS(nums, arr, n, m-1, dp);

        return dp[n][m] = Math.max(ans1, ans2);
    }
    public int helper(int[] nums){

        HashSet<Integer> map = new HashSet<>();

         for (int num : nums) {
            map.add(num);
        }

        int[] arr = new int[map.size()];
        int i = 0;
        for (Integer num : map) {
            arr[i] = num;
            i++;
        }

        Arrays.sort(arr);

        int n = nums.length;
        int m = arr.length;

        int dp[][] = new int[n+1][m+1];

        for(int k=0;k<=n;k++){
            for(int j=0;j<=m;j++){
                dp[k][j] = -1;
            }
        }

        return LCS(nums, arr, n, m, dp);
    }

    public int lengthOfLIS(int[] nums) {

        return helper(nums);
        
    }
}