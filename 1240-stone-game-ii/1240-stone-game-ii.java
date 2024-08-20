class Solution {
    int n;
    int[][][] memo;

    public int stoneGameII(int[] piles) {

        n = piles.length;

       memo = new int[n][n + 1][2];
        for (int[][] row : memo) {
            for (int[] r : row) {
                Arrays.fill(r, -1);
            }
        }

        return solveForAlice(piles, 1, 0, 1);

    }

    private int solveForAlice(int[] piles, int person, int i, int m) {
        if (i >= n)
            return 0;

          if (memo[i][m][person] != -1) {
            return memo[i][m][person];
        }

        int result = (person == 1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        int stone = 0;

        for(int x = 1; x <=Math.min(2*m,n-i);x++){
            stone += piles[i + x - 1];

            if(person == 1){ // Alice
                result = Math.max(result, stone + solveForAlice(piles, 0, i+x, Math.max(m,x)));
            }

            else{
                result = Math.min(result, solveForAlice(piles, 1, i+x, Math.max(m, x)));
            }
        }
 
        return memo[i][m][person] = result;
    }
}