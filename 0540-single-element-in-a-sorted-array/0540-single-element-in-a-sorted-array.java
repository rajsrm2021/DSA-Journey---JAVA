class Solution {
    // if element is sorted means the pair is always there if mid is even and arr[mid]==arr[mid+1]
    // then elemet in left side is alys not duplicat 
    // ans will be in right side
    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end= nums.length-1;
        
        while(start< end){

            int mid = start + (end-start)/2;

            if(mid%2==1) mid--;  // checking even odd condition

            if(nums[mid] == nums[mid+1]){
                start = mid+2;
            }else{
                end = mid;
            }

        }

        return nums[start];

        
    }
}