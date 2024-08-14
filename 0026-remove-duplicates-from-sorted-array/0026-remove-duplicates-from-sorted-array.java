class Solution {
    public int removeDuplicates(int[] nums) {

        int count = 0;

        if(nums.length==1){
            return 1;
        }

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[count] = nums[i];
                count++;
            }
        }

        if(nums[nums.length-1]!=nums[count]){
            nums[count] = nums[nums.length-1];
            count++;
        }

        return count;
        
    }
}