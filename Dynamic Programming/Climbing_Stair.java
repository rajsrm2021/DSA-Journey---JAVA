public class Climbing_Stair{
    public static int climbing(int n, int[] dp){
        if(n<=1) return 1;

        if(dp[n] !=0) return dp[n];

        dp[n] = climbing(n-1,dp)+climbing(n-2,dp);

        return dp[n];
    }
    public static void main(String args[]){
        int n = 5;
        int[] dp = new int[n+1];
        System.out.println(climbing(n,dp));
    }
}