class Solution {
    public int minDifference(int[] nums) {

        if(nums.length<=3){
            return 0;
        }

        int n = nums.length;
        Arrays.sort(nums);

        // case 1: remove smallest 3;
        int a = nums[n-1]-nums[3];
        // case 2: remove largest 3
        int b = nums[n-4] - nums[0];
        // case 3: remove 2 smallest and 1 largest
        int c = nums[n-2] - nums[2];
        // case 3: remove 2 largest and 1 smallest
        int d = nums[n-3] - nums[1];


        return Math.min(a,Math.min(b,Math.min(c,d)));
        
    }
}