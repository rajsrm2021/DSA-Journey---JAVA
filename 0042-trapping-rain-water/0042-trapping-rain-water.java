class Solution {
    // Algorithm
    // calculate left max
    // calculate right max
    // get min from leftmax and rightmax and subtract height of that idx
    // add all and return value

    public int trap(int[] height) {

        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        rightMax[n-1] = height[n-1];

        for(int i = n-2; i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int waterStore[] = new int[n];

        for(int i=0;i<n;i++){
            waterStore[i] = (Math.min(leftMax[i],rightMax[i]) - height[i]);
        }

        int res = 0;

        for(int num : waterStore){
            res += num;
        }

        return res;
    }
}