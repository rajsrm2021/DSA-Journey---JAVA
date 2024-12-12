class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;

        for(int i=0;i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost) {
            return -1;
        }

        int total = 0;
        int start = 0;

        for(int i=0;i<gas.length;i++){
            total += gas[i] - cost[i];

            if(total < 0){
                total = 0;  // reset the total value
                start = i+1; // if negative is comming so it might be i+1 element our answer
            }
        }

        return start;
        
    }
}