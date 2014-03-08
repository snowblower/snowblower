/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sum;
    public int sumNumbers(TreeNode root) {
        visit(root);
        return sum;
    }
    
    public void visit(TreeNode root){
        if(root==null){return;}
        if(root.left==null&&root.right==null){
            sum +=root.val;
            return;
        }
        if(root.left!=null){
            root.left.val+=root.val*10;
        }
        visit(root.left);
        if(root.right!=null){
            root.right.val+=root.val*10;
        }
        visit(root.right);
    }
}