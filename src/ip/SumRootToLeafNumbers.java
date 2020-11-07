package ip;

import java.util.ArrayList;
import java.util.List;


    public class SumRootToLeafNumbers {
        public int sumNumbers(TreeNode root) {
            int sum = 0;
            List<Integer> l = new ArrayList<>();
            dfs(root, "", l);

            for (Integer x : l)
                sum += x;

            return sum;

        }

        public void dfs(TreeNode node, String current, List<Integer> list) {
            if (node == null) return;

            if (node.left == null && node.right == null) {
                list.add(Integer.parseInt(current + node.val));

                return;
            }
            dfs(node.left, current + node.val, list);
            dfs(node.right, current + node.val, list);
        }

        public static void main(String[] args) {
            SumRootToLeafNumbers s = new SumRootToLeafNumbers();
            TreeNode root =new TreeNode(1);
            TreeNode left =new TreeNode(2);
            TreeNode right =new TreeNode(3);
            root.left=left;
            root.right=right;
            System.out.println(s.sumNumbers(root));

        }
    }
