class Solution {
    public void reverse(int arr[], int start, int end){

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {

         if(nums == null || nums.length <= 1 || k % nums.length == 0) {
            return; // No rotation needed for edge cases
        }
         k = k % nums.length;
        reverse(nums, 0,nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k,nums.length-1);
        
    }
}