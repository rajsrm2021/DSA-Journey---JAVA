/* 
There are 3 approach
1.recursion
2.memorization dynamic programming
3.tabulation dynamic programming
*/ 

class Solution 
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