import java.util.TreeMap;

class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        long ans = 0;
        int left = 0;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int right = 0; right < n; right++) {
            // Add the current number to the TreeMap
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Check if the difference between the smallest and largest elements exceeds 2
            while (map.lastKey() - map.firstKey() > 2) {
                int leftValue = nums[left];
                map.put(leftValue, map.get(leftValue) - 1);
                if (map.get(leftValue) == 0) {
                    map.remove(leftValue);
                }
                left++;
            }

            // Count all valid subarrays ending at 'right'
            ans += (right - left + 1);
        }

        return ans;
    }
}
