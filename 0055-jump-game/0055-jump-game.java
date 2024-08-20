class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length - 1;
        int goal = n;

        for (int i = n; i >= 0; i--) {
     // nums i par hum bani or ooijan se hum i se kana aage jayem ooise i add kara tani hum 
            if(nums[i] + i >= goal){  
                goal = i;
            }
        }

        return goal ==0;

    }
}