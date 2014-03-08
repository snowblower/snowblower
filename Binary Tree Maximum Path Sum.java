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
    public int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null){return 0;}
        ArrayList<Integer> list =new ArrayList<Integer>();
        max(root,list);
        Iterator<Integer> it = list.iterator();
        int result=Integer.MIN_VALUE;
        while(it.hasNext()){
            int itnext = it.next();
            if(itnext>result)
            result = itnext;
        }
        return result;
    }
    
    public int max(TreeNode root,ArrayList<Integer> list){
        if(root==null){return 0;}
        int left =Math.max(0,max(root.left,list));
        int right = Math.max(0,max(root.right,list)); 
        list.add(root.val+left+right);
        int result =Math.max(root.val,Math.max(root.val+right,root.val+left));
        return result;
    }
}