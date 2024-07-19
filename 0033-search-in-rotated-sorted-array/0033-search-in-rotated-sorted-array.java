class Solution {

    // step 1: kth time arr sorted questiom find how many time array is roated
    // step 2: search half and half
    // step 3: gurantee one will give -1 and other will give result;

    // step 1: 
    public int kth(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid]>arr[end]){
                start =mid+1;
            }else{
                end = mid;
            }
        }

        return start;
    }

    public int BS(int arr[],int target,int start,int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
    public int search(int[] nums, int target) {

        int k = kth(nums);

        int left = BS(nums,target,0,k-1);
        int right = BS(nums,target,k,nums.length-1);

        if (left != -1) {
            return left;
        } else {
            return right; // Correct this to return the right result directly
        }
        
    }
}