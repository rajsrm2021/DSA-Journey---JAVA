class Solution {
    int solve(int curr, int clipA, int n, int memo[][]) {
        if (curr == n) {
            return 0;
        }
        if (curr > n) {
            return 10000;
        }

        if (memo[curr][clipA] != -1) {
            return memo[curr][clipA];
        }

        int copyAllPaste = 1 + 1 + solve(curr + curr, curr, n,memo);

        int past = 1 + solve(curr + clipA, clipA, n,memo);

        return memo[curr][clipA] = Math.min(copyAllPaste, past);
    }

    public int minSteps(int n) {
        if (n == 1)
            return 0;

        int memo[][] = new int[n + 1][n + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return 1 + solve(1, 1, n, memo);

    }
}