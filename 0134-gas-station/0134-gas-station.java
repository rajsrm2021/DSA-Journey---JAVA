class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalCost = 0;
        int totalGas = 0;

        // Calculate total gas and total cost
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // If total gas is less than total cost, return -1
        if (totalGas < totalCost)
            return -1;

        int total = 0;
        int start = 0;

        // Iterate through each station to find the starting point
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];

            // If total is negative, reset total and update start
            if (total < 0) {
                total = 0;
                start = i + 1;
            }
        }

        return start;
    }
}