class Solution {
    
    public int binarySearch(int arr[],int target){
        
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid= (first+last)/2;

            if(target == arr[mid] ) return mid;

            if(target>arr[mid]) {
               first= mid+1;
            }

            else {
                last = mid-1;
            }
        }

        return last+1;
        
    }
    public int searchInsert(int[] nums, int target) {

       return binarySearch(nums,target);

      

    }
}