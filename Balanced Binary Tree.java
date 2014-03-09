/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//inefficient method
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){return true;}
        if(Math.abs(max(root.left)-max(root.right))>1) return false;
        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        return left&&right;
    }
    
    public int max(TreeNode root){
        if(root==null){return 0;}
        int left = max(root.left)+1;
        int right = max(root.right)+1;
        return Math.max(left,right);
    }
}