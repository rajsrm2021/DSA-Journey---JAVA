import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        // Correct the sorting method to lowercase 'sort'
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int ele1 = nums[i];
            int ptr1 = i + 1;
            int ptr2 = nums.length - 1;

            while (ptr1 < ptr2) {
                int sum = ele1 + nums[ptr1] + nums[ptr2];
                if (sum == 0) {
                    // Found a triplet
                    List<Integer> temp = new ArrayList<>();
                    temp.add(ele1);
                    temp.add(nums[ptr1]);
                    temp.add(nums[ptr2]);
                    res.add(temp);

                    // Skip duplicates for the second and third elements
                    while (ptr1 < ptr2 && nums[ptr1] == nums[ptr1 + 1]) ptr1++;
                    while (ptr1 < ptr2 && nums[ptr2] == nums[ptr2 - 1]) ptr2--;

                    // Move the pointers
                    ptr1++;
                    ptr2--;
                } else if (sum < 0) {
                    ptr1++;
                } else {
                    ptr2--;
                }
            }
        }

        return res;
    }
}
