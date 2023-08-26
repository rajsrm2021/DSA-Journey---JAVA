// Boyer-Moore Majority Voting Algorithm is used to find majority element in an array
// it ia a famous question of leet code 

// Link : https://leetcode.com/problems/majority-element/

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
  */


//   code


class Solution {
    public int majorityElement(int[] nums) {
        int ansindex=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[ansindex]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ansindex=i;
                count=1;
            }
        }

        count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[ansindex]==nums[j]){
                count++;
            }
        }

        if(count>nums.length/2){
            return nums[ansindex];
            

        }
        return -1;
    }
    
}