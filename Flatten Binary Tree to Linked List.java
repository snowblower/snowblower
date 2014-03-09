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
    public void flatten(TreeNode root) {
        if(root==null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(curr);
            if(curr.right!=null){stack.push(curr.right);}
            if(curr.left!=null) {stack.push(curr.left);
        }
        while(!list.isEmpty()){
            TreeNode curr = list.poll();
            curr.left = null;
            if(!list.isEmpty()){
                curr.right = list.peek();
            }
        }
    }
}