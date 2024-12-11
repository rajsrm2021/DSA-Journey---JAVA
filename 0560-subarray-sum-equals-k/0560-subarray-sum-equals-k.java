class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int presum = 0;
        int cnt = 0;

        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            int rem = presum - k;

            cnt += map.getOrDefault(rem,0);

            map.put(presum, map.getOrDefault(presum,0)+1 );
        }


        return cnt;
        
    }
}