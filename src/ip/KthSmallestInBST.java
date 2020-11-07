package ip;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestInBST {
    static int num = 0;
    static int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        count =k;
        traverse(root);
        return num;
    }
    public void traverse(TreeNode node){
        if(node==null) return;
        if(node.left!=null) traverse(node.left);
        count--;
        if(count==0){
            num = node.val;
            return;
        }
        if(node.right!=null)  traverse(node.right);
    }
}
