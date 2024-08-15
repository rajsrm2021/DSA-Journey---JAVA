class Solution {
    public int maxProfit(int[] nums) {

        int maxProfit = 0;
        int minSoFar = nums[0];

        for(int num: nums){
            minSoFar = Math.min(num, minSoFar);
            int profit = num - minSoFar;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
        
    }
}