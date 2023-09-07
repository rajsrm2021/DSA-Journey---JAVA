// longest common subsequence

class Solution {
    public int helper(String str1, String str2, int n, int m, int dp[][]){

        // base case
        if(n==0 || m==0) return 0;

        if(dp[n][m] != -1) {
            return dp[n][m];
        }

        // two cases same and dffer last character
        // case1: same
        if(str1.charAt(n-1) == str2.charAt(m-1)) 
            return dp[n][m] = helper(str1, str2, n-1, m-1 ,dp) + 1 ;

        // case2: differ
        int ans1 = helper(str1, str2, n-1, m, dp);
        int ans2 = helper(str1, str2, n, m-1, dp);

        return dp[n][m] = Math.max(ans1, ans2);

    }

    public int longestCommonSubsequence(String text1, String text2) {

        int dp[][] = new int[text1.length() + 1][text2.length() + 1];

         for (int i = 0; i <= text1.length(); i++) {
            for (int j = 0; j <= text2.length(); j++) {
                dp[i][j] = -1;
          }
         }

        return helper(text1, text2, text1.length(), text2.length(), dp);
        
    }
}