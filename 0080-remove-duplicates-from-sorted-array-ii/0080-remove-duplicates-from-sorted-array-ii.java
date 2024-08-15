class Solution {
    public int removeDuplicates(int[] nums) {

        int cnt1 = 0; // this will track outer element
        int cnt2 = 1; // this will count the number occurance;

        for(int i=1; i<nums.length; i++){

            if(nums[cnt1] != nums[i]){
                cnt1++;
                nums[cnt1] = nums[i];
                cnt2 = 1; // reset
            } else if(cnt2 < 2){
                cnt1++;
                nums[cnt1] = nums[i];
                cnt2++;
            }
        }


        return cnt1 + 1;
        
    }
}