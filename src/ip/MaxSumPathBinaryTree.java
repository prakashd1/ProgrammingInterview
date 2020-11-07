package ip;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//https://leetcode.com/problems/binary-tree-maximum-path-sum/submissions/


class MaxSumPathBinaryTree {
    static int maxSum = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        TreeNode left=new TreeNode(1);
        TreeNode right=new TreeNode(3);
        root.left = left;
        root.right = right;

        System.out.println(new MaxSumPathBinaryTree().maxPathSum(root));
    }

    public int maxPathSum(TreeNode root) {
        findSum(root , 0);
        return maxSum;
    }
    public int findSum(TreeNode node, int curr){
        if(node ==null) return 0;
        int left=0;
        int right=0;

        if(node.left!=null)
            left = findSum(node.left , curr + node.val);

        if(node.right!=null)
            right = findSum(node.right , curr + node.val);

        maxSum= Math.max(maxSum, Math.max(left+right, node.val));
        return maxSum;

    }
}