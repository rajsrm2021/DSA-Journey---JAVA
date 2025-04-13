class Solution {
    final int MOD = 1000000007;

    public long findPower(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long half = findPower(a, b / 2);
        long res = (half * half) % MOD;

        if (b % 2 == 1) {
            res = (res * a) % MOD;
        }

        return res;
    }

    public int countGoodNumbers(long n) {
        long evenIdx = (n + 1) / 2;
        long oddIdx = n / 2;

        long res = (findPower(5, evenIdx) * findPower(4, oddIdx)) % MOD;
        return (int) res;
    }
}
