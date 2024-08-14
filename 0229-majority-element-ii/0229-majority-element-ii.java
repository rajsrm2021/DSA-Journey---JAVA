class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int ans1 = nums[0];
        int ans2 = nums[0];
        int count1 = 1;
        int count2 = 0; // Start with 0 to handle two distinct candidates

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == ans1) {
                count1++;
            } else if (nums[i] == ans2) {
                count2++;
            } else if (count1 == 0) {
                ans1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                ans2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == ans1) {
                count1++;
            } else if (num == ans2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3) {
            result.add(ans1);
        }
        if (count2 > nums.length / 3 && ans1 != ans2) { // Ensure they are distinct
            result.add(ans2);
        }

        return result;
    }
}
