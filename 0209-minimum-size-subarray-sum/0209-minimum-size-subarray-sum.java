class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int l=0,r=0,sum=0,minlen = Integer.MAX_VALUE;

        while(r<nums.length){
            sum += nums[r];
            while(sum>=target){
                minlen = Math.min(minlen, r-l+1);
                sum -= nums[l];
                l++;
            }
            
            r++;

        }

        return minlen == Integer.MAX_VALUE ? 0 : minlen;
        
    }
}