/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
                if(root==null){return;}
        LinkedList<TreeLinkNode> queue1 = new LinkedList<TreeLinkNode>();
        queue1.add(root);
        while(!queue1.isEmpty()){
            LinkedList<TreeLinkNode> queue2 = new LinkedList<TreeLinkNode>();
            TreeLinkNode curr = queue1.poll();
            if(curr.left!=null){queue2.add(curr.left);}
            if(curr.right!=null){queue2.add(curr.right);}
            while(!queue1.isEmpty()){
                curr.next=queue1.poll();
                curr=curr.next;
                if(curr.left!=null){queue2.add(curr.left);}
                if(curr.right!=null){queue2.add(curr.right);}
            }
            curr.next = null;
            queue1=queue2;
        }
            
    }
}