package ip;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
class Max_level {

    int max_level;
}
public class Test {

    Max_level max = new Max_level();
    public static void main(String[]  args) {
        


    }


    TreeNode root;

    public List<Integer> rightSideView(TreeNode root) {
        HashMap <Integer,Integer> map=new HashMap();
        rightViewUtil(root, 0, map);
        return new ArrayList<>(map.values());
    }
    void rightViewUtil(TreeNode node, int level,HashMap <Integer,Integer> map){
        if(node==null) return;

        if(!map.containsKey(level)){
            map.put(level, node.val);
        }

        rightViewUtil(node.right, level, map);
        rightViewUtil(node.left, level, map);
    }
}
