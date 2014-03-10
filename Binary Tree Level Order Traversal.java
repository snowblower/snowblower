/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //preorder 
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root==null) return result;
        helper(result,1,root);
        return result;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> result, int num,TreeNode root){
        if(root==null) return;
        while(result.size()<num){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            result.add(curr);
        }
        result.get(num-1).add(root.val);
        helper(result,num+1,root.left);
        helper(result,num+1,root.right);
    }
}