public class four {
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 0;
        
        for (int num : nums) {
          
            if (uniqueCount < 2 || num != nums[uniqueCount - 2]) {
                nums[uniqueCount] = num;
                uniqueCount++;
            }
        }
        
        return uniqueCount;
    }
}
