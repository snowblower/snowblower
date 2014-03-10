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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> result =new ArrayList<ArrayList<Integer>>();
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        ArrayList<Integer> list_int = new ArrayList<Integer>();
        if(root==null)return result;
        list.add(root);
        list_int.add(root.val);
        result.add(list_int);
        while(!list.isEmpty()){
            ArrayList<TreeNode> curr = new ArrayList<TreeNode>();
            ArrayList<Integer> curr_int =new ArrayList<Integer>();
            for(TreeNode n :list){
                if(n.left!=null){
                    curr.add(n.left);
                    curr_int.add(n.left.val);
                }
                if(n.right!=null){
                    curr.add(n.right);
                    curr_int.add(n.right.val);
                }
            }
            if(!curr_int.isEmpty()){
                result.add(curr_int);
            }
            list=curr;
        }
        return result;
    }
}