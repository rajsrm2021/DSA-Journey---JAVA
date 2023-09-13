// variation of edit distance 

public class stringConversion {

    public static int helper_LCS(String str1, String str2, int n, int m, int dp[][]){

        // base case
        if(n==0 || m==0) return 0;

        if(dp[n][m] != -1) {
            return dp[n][m];
        }

        // two cases same and dffer last character
        // case1: same
        if(str1.charAt(n-1) == str2.charAt(m-1)) 
            return dp[n][m] = helper_LCS(str1, str2, n-1, m-1 ,dp) + 1 ;

        // case2: differ
        int ans1 = helper_LCS(str1, str2, n-1, m, dp);
        int ans2 = helper_LCS(str1, str2, n, m-1, dp);

        return dp[n][m] = Math.max(ans1, ans2);

    }

    public static int helper(String s1, String s2, int n, int m){

        int dp[][] = new int[n + 1][m + 1];

         for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
          }
         }

         int ans = helper_LCS(s1, s2, n, m, dp);

         int delete = n-ans;
         int insert = m-ans;

         return delete+insert;
    }

    public static void main(String args[]){

        String s1 = "abcedf";
        String s2 = "aceg";

        System.out.println("Total insertion and deletion opertion are : "+helper(s1, s2, s1.length(), s2.length()));
    }

}
