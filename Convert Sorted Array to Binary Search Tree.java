/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//short
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        return helper(num,0,num.length);
    }
    public TreeNode helper(int[] num,int start,int end){
        if(start>=end) return null;
        int mid = (start+end)/2;
        TreeNode curr = new TreeNode(num[mid]);
        curr.left = helper(num,start,mid);
        curr.right = helper(num,mid+1,end);
        return curr;
    }
}