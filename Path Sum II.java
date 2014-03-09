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
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(root,sum,result,list);
        return result;
    }
    
    public void helper(TreeNode root, int sum, ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list){
        if(root==null) return;
        ArrayList<Integer> curr = new ArrayList<Integer>(list);
        curr.add(root.val);
        if(root.left==null&&root.right==null&&sum==root.val){
            result.add(curr);
            return;
        }
        helper(root.left,sum-root.val,result,curr);
        helper(root.right,sum-root.val,result,curr);  
    }
}