/* 
Link : https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
There are 3 approach
1.recursion
2.memorization dynamic programming
3.tabulation dynamic programming
*/ 

// 1. Recurssion approach

class Solution1 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        //  w = allowed weight;
        // wt = item wt;
        // val = item valuation
        // n = index;
        
        // using recurssion approach
        // base case:
        if(n == 0 || W == 0){
            return 0;
        }
        
        if(wt[n-1] <= W){ // valid
            // two cases arises:
            // case 1: include
            int ans1 = val[n-1] + knapSack( W-wt[n-1], wt, val, n-1);
            
            // case 2: exclude
            int ans2 =  knapSack(W, wt, val, n-1);
            
            return Math.max(ans1, ans2);
        }
        
        else{ // not allowed
            return knapSack(W, wt, val, n-1);
        }
    } 
}


// 2. Dynamic Approach

class Solution2 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    
    public static int helper(int W, int wt[], int val[], int n, int dp[][]){
        //  w = allowed weight;
        // wt = item wt;
        // val = item valuation
        // n = index;
        
        // using recurssion approach
        // base case:
        if(n == 0 || W == 0){
            return 0;
        }
        
        // dp
        
        if(dp[n][W] != -1) return dp[n][W];
        
        if(wt[n-1] <= W){ // valid
            // two cases arises:
            // case 1: include
            int ans1 = val[n-1] + helper( W-wt[n-1], wt, val, n-1, dp);
            
            // case 2: exclude
            int ans2 =  helper(W, wt, val, n-1, dp);
            
            dp[n][W] =  Math.max(ans1, ans2);
            
            return dp[n][W];
        }
        
        else{ // not allowed
            dp[n][W] =  helper(W, wt, val, n-1, dp);
            
            return dp[n][W];
        }
        
        
    }
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         
        int[][] dp = new int[val.length + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
          for (int j = 0; j < dp[0].length; j++) {
        dp[i][j] = -1;
       }
     }
         
         return helper(W, wt, val, n, dp);
    } 
}


//  variation of 0/1 knapsack is cutting rod
// link : https://practice.geeksforgeeks.org/problems/rod-cutting0840/1

class Solution{
    
    public int helper(int val[], int[] wt, int remaning, int n, int dp[][]){
        
        // base case
        if(n==0 || remaning==0) return 0;
        
        if(dp[n][remaning] != -1) return dp[n][remaning] ;
        
        // two cases 
        // include and not to include
        // If the weight of the current piece is greater than the remaining length (N),
        // we can't include it in the solution
        if (wt[n - 1] > remaning) {
            return dp[n][remaning] = helper(val, wt, remaning, n - 1, dp);
        }
        // Find the maximum value by either including or excluding the current piece
        int include = val[n - 1] + helper(val, wt, remaning - wt[n - 1], n, dp);
        int exclude = helper(val, wt, remaning, n - 1, dp);
        
        
        return dp[n][remaning] = Math.max(include, exclude);
        
        
    }
    public int cutRod(int price[], int n) {
        //code here
        
        
		int len[] = new int[n]; // weight  // price == value
		int dp[][] = new int[n+1][n+1];
		
		for(int i=0;i<=n;i++){
		    Arrays.fill(dp[i],-1);
		}
		
		
        for(int i=0;i<n;i++){
            len[i] = i+1;
        }
        
        return helper(price, len, n, n, dp);
        
        
    }
}
