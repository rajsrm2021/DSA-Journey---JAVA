class Solution {

    public static int helper(int[] coins, int amount, int [] dp){
        // base cases
        if(amount == 0) return 0;

        if(amount < 0) return Integer.MAX_VALUE-1;

        if(dp[amount] != -1) {
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
           int ans = helper(coins, amount-coins[i],dp);

           if(ans != Integer.MAX_VALUE)
            min= Math.min(min,1+ans);
        }

        return dp[amount] = min;
    }
    public int coinChange(int[] coins, int amount) {

        int dp[] = new int [amount+1];
        Arrays.fill(dp,-1);

        int ans= helper(coins, amount, dp);

        if(ans == Integer.MAX_VALUE){
            return -1;
        }

        return ans;
        
    }
}