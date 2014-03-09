/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//better way
public class Solution { 
    private boolean result;
    public boolean isBalanced(TreeNode root) {
        result = true;
        helper(root);
        return result;
    }
    
    public int helper(TreeNode root){
        if(root==null) return 0;
        int left =helper(root.left);
        int right = helper(root.right);
        if(Math.abs(left-right)>1) result = false;
        return Math.max(left+1,right+1);
    }
}