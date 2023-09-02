import java.util.*;

public class fibonacci {

    public static long fib(int n, long[] dp) {

        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 90;
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(fib(n, dp));

    }
}
