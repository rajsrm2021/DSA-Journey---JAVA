// Link : https://leetcode.com/problems/symmetric-tree/

/*Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
  */

// code 

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
class Solution {

    public boolean Helper(TreeNode p, TreeNode q){
        if(p==null && q == null) return true;

        if(p==null || q==null || p.val!=q.val) return false;

        return (Helper(p.left,q.right) && Helper(p.right,q.left));
    }
    public boolean isSymmetric(TreeNode root) {

        if(root==null) return true;

        return Helper(root.left,root.right);
        
    }
}