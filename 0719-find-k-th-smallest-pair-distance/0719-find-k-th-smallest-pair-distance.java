class Solution {

    private int slidingWindow(int[] nums, int D){
        int i=0;
        int j = 1;

        int n = nums.length;
        int pairCount = 0;

        while(j<n){
            while(nums[j] - nums[i] > D){
                i++;
            }
            pairCount += (j - i);
            j++;
        }

        return pairCount;
    }

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums[nums.length - 1] - nums[0];
        int result = 0;

        while(low<=high){
            int mid = low + (high - low) / 2;

            int countPair = slidingWindow(nums, mid);

            if(countPair<k){
                low = mid + 1;

            }else{
                result = mid;
                high = mid-1;
            }
        }

        return result;

    }
}