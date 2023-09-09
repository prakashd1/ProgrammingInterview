package ip;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://www.facebookrecruiting.com/portal/coding_practice_question/?problem_id=2869293499822992
public class ReverseAndMakeEqual {
    public static void main(String[] args) {

    }

    public static boolean areTheyEqual(int[] array_a, int[] array_b) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:array_a) {
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }
        for(int i:array_b) {
            if(!m.containsKey(i)){
                return false;
            }
            if(m.get(i)==1){
                m.remove(i);
            }else{
                m.put(i,m.get(i)-1);
            }

        }

        return m.size() ==0;
    }
}
