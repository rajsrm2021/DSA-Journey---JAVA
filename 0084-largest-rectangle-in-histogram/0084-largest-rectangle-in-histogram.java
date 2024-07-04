import java.util.*;

class Solution {

    public static int[] NSR(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, n);

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(i);
        }

        return result;
    }
     public static int[] NSL(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); 
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
          
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
    
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
      
            stack.push(i);
        }
        
        return result;
    }

    public int largestRectangleArea(int[] heights) {
        int[] right = NSR(heights);
        int[] left = NSL(heights);
        int[] width = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            width[i] = right[i] - left[i] - 1;
        }

        int[] area = new int[heights.length];

        for (int i = 0; i < heights.length; i++) {
            area[i] = heights[i] * width[i];
        }

        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            result = Math.max(result, area[i]);
        }

        return result;
    }
}
