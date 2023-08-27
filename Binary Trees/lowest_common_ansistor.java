// Lowest common ansistor 

// link : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/


/*Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

 

Example 1:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.
Example 2:


Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
Example 3:

Input: root = [1,2], p = 1, q = 2
Output: 1
  */

// code 

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // if root is null return null
        if(root == null) return null;

        // if root is value of p or q then return root only
        if(root.val == p.val || root.val == q.val) return root;

        // find where the value is, recursion will do that you just beleave that ans will come
        TreeNode left = lowestCommonAncestor(root.left , p , q ) ; 
        TreeNode right = lowestCommonAncestor(root.right , p , q ) ; 

        // if left is null i.e. value is in right return right
        if(left == null) return right;

        // if right is null i.e. value is in left return left
        if(right == null) return left;

        // if no one is null then data is in both sub tree and ans wil be root
        return root ;
        
    }
}