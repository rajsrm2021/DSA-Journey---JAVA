class Solution {

    public int binarySearch(int []nums,int target){

        int left = 0, right = nums.length-1;

        while(left <= right){

            int mid = right - (right - left)/2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }

        return -1;
    }


    public int search(int[] nums, int target) {

        
        return binarySearch(nums, target);
    }
}