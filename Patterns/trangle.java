public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here

        for(int i=0;i<n;i++){
            // spaces
            for(int j=0;j<n-i-1;j++){
                 System.out.print(" ");
            }
            // star
            for(int j=0;j<2*i+1;j++){
                 System.out.print("*");
            }
            // space
            for(int j=0;j<n-i-1;j++){
                 System.out.print(" ");
            }
             System.out.println();
        }
         
    }
}