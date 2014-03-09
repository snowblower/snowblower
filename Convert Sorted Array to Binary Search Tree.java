/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//old version
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        TreeNode root = creatTree(num);
        return root;
    }
    
    public TreeNode creatTree(int[] num){
        if(num.length==0){
            return null;
        }
        if(num.length==1){
            TreeNode node = new TreeNode(num[0]);
            return node;
        }
        int curr = num[num.length/2];
        TreeNode node = new TreeNode(curr);
        node.left=creatTree(Arrays.copyOfRange(num,0,num.length/2));
        node.right=creatTree(Arrays.copyOfRange(num,num.length/2+1,num.length));
        return node;
    }
}