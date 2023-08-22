/*103. Binary Tree Zigzag Level Order Traversal */

/*Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between). */

/*Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: [] */

// Solution

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
import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return result;
        List<Integer> list = new ArrayList<>();
        Boolean leftToRight = true;

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr= q.poll();
                level.add(curr.val);

                if(curr.left!=null){
                    q.add(curr.left);
                } 
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

            if(leftToRight){
                list.addAll(level);

            }else{
                Collections.reverse(level);
                list.addAll(level);
            }
            leftToRight = !leftToRight;
            result.add(new ArrayList<>(list));
                list.clear();
        
            
        }
        
        return result;
    }
}