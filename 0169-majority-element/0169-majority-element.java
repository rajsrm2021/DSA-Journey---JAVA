class Solution {
    public int majorityElement(int[] nums) {

        int ans = nums[0];
        int count = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != ans){
                count--;
                if(count==0){
                    ans = nums[i];
                    count = 1;
                }
            }else{
                count++;
            }
        }

        count = 0;

        for(int num: nums){
            if(num == ans){
                count++;
            }
        }

        return count>nums.length/2 ? ans : -1;
        
    }
}