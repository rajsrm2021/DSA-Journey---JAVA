/* edit distance;
  
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
 

Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation: 
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation: 
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')
 */



class Solution {

    public int solve(String s1, String s2, int n, int m, int dp[][]){
        // base case
        if(n==0) return m;

        if(m==0) return n;

        int count = 0;

        if(dp[n][m] != -1) {
            return dp[n][m];
        }

        // cases are two last char is same or diff

        if(s1.charAt(n-1) == s2.charAt(m-1) ){
            return solve(s1, s2, n-1, m-1, dp);
        } 

        else{
            int insert = solve(s1, s2, n, m-1, dp) + 1;
            int delete = solve(s1, s2, n-1, m, dp) + 1;
            int replace = solve(s1, s2, n-1, m-1, dp)+ 1;

            count = Math.min(Math.min(insert, delete), replace);
        }

        return dp[n][m] = count ;

    }
    public int minDistance(String word1, String word2) {

        int dp[][] = new int [word1.length()+1][word2.length()+1];

        for(int i = 0;i<=word1.length();i++)
            Arrays.fill(dp[i],-1);

        return solve(word1, word2, word1.length(), word2.length(), dp);
        
    }
}