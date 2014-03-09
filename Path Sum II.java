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
        if(root==null){return result;}
        pathSumHelper(root,result,list,sum,0);
        return result;
    }
    
    public void pathSumHelper(TreeNode root,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list,int sum,int level){
        if(root==null){return;}
        if(root.left==null&&root.right==null){
            if(root.val==sum){
                ArrayList<Integer> arr = new ArrayList<Integer>(list);
                arr.add(root.val);
                result.add(arr);
                return;
            }
            else return;    
        }
        list.add(root.val);
        sum=sum-root.val;
        pathSumHelper(root.left,result,list,sum,level+1);
        pathSumHelper(root.right,result,list,sum,level+1);
        list.remove(level);
        return;
    }
}