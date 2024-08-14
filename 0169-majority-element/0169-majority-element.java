class Solution {
    public int majorityElement(int[] nums) {

        int count = 1;
        int ans = nums[0];

        for(int i=1;i<nums.length;i++){

            if(ans != nums[i]){
                count--;
                if(count == 0){
                    ans = nums[i];
                    count = 1;
                }
            }else{
                count++;
            }

        }

        int count1 = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans){
                count1++;
            }
        }

        return count1>nums.length/2 ? ans : -1;
        
    }
}