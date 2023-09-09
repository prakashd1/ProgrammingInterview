package ip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BranchSums {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        ArrayList <Integer>list=new ArrayList();
        dfs(root, list, 0);
        return list;
    }
    public static void dfs(BinaryTree node, ArrayList<Integer> list, int sum){

        if (node ==null) {
            return;
        }
        if(node.left==null && node.right==null){
            list.add(sum+node.value);
            return;
        }
        dfs(node.left, list, node.value+sum);
        dfs(node.right, list, node.value+sum);

    }



}
