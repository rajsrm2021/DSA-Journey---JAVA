class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        double maxSum = sum;
        int start = 0;
        int end = k;

        while(end<nums.length){
            sum-=nums[start];
            start++;
            sum+=nums[end];
            end++;

            maxSum = Math.max(sum,maxSum);
        }

        return maxSum/k;
        
    }
}