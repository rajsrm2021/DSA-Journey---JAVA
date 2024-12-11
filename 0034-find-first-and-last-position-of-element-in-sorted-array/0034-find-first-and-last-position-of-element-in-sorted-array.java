class Solution {

    public int firstOccurance(int nums[],int target){
        
        int first = 0, last = nums.length-1, res = -1;

        while(first<=last){
            int mid = first + (last - first) / 2;

            if(nums[mid] == target){
                res = mid;
                last = mid-1;
            }else if(nums[mid] < target){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }

        return res;
    }


    public int lastOccurance(int nums[],int target){
        
        int first = 0, last = nums.length-1, res = -1;

        


        while(first<=last){
            int mid = first + (last - first) / 2;

            if(nums[mid] == target){
                res = mid;
                first = mid+1;
            }else if(nums[mid] < target){
                first = mid+1;
            }else{
                last = mid-1;
            }
        }

        return res;
    }
    public int[] searchRange(int[] nums, int target) {

        int res[] = new int[2];

        res[0] = firstOccurance(nums,target);
        res[1] = lastOccurance(nums,target);


        return res;
        
    }
}