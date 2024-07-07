class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        long profit = 0;
        int n = enemyEnergies.length;
        Arrays.sort(enemyEnergies);
        
        if (enemyEnergies[0] > currentEnergy)
            return 0;
        
        int j = n - 1;
        while (j >= 0) {
            if (enemyEnergies[0] <= currentEnergy) {
                profit += currentEnergy / enemyEnergies[0];
                currentEnergy %= enemyEnergies[0];
            } else {
                currentEnergy += enemyEnergies[j];
                j--;
            }
        }
        
        return profit;
    }
}