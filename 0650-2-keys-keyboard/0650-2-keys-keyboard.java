class Solution {
    int solve(int curr, int clipA, int n){
        if(curr==n){
            return 0;
        }
        if(curr > n) {
            return 10000;
        }

        int copyAllPaste = 1 + 1 + solve(curr + curr, curr, n);

        int past = 1 + solve(curr + clipA , clipA, n);

        return Math.min(copyAllPaste,past);
    }
    public int minSteps(int n) {
        if(n==1) return 0;

        return 1 + solve(1,1, n);
        
    }
}