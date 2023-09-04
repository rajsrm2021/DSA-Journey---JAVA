class Solution {

    public int helper(int dice, int faces, int target, int dp[][]){
        // base cases;
        if(dice ==1){
            return target>=1 && target<=faces ? 1 : 0 ;

        }

        if(target<0) return 0;

        if(dice==0 && target == 0) return 1;

        if(dp[dice][target] != -1) {
            return dp[dice][target]%1000000007;
        }

        int sum =0;

        for(int i=1; i<=faces; i++){

            sum = (sum + helper(dice-1, faces, target-i, dp)) % 1000000007;
        }

        return dp[dice][target] = sum;
    }
    public int numRollsToTarget(int n, int k, int target) {

        int dp[][] = new int[n + 1][target + 1];
        for(int i=0; i<=n;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(n, k, target,dp);
        
    }
}