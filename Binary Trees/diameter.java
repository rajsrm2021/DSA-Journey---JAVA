// https://leetcode.com/problems/diameter-of-binary-tree/submissions/

/* Diameter of Binary Tree

Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

 

Example 1:


Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
Example 2:

Input: root = [1,2]
Output: 1
  */


//   code

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 // leetcode when counting start with 0
class Solution {

    int ans = 0;

    public int height(TreeNode root){
        if(root == null) return -1;

        int lh = height(root.left);
        int rh = height(root.right);
         ans = Math.max(ans,(lh+rh+2));

         return   Math.max(rh,lh) + 1 ; 
    }
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null) return 0;

        height(root);
        return ans;
        
    }
}


// gfg when counting start with 1 


class Solution {
    // Function to return the diameter of a Binary Tree.
    int ans = 0;

    public int height(Node root){
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
         ans = Math.max(ans,(lh+rh+1));

         return   Math.max(rh,lh) + 1 ; 
    }
    int diameter(Node root) {
        // Your code here
        
        if(root == null) return 0;
        
        height(root);
        
        return ans;
    }
}