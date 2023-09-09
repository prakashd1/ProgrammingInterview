package ip;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/single-number/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> s =new HashSet<>();

        for(int x:nums){
            if(s.contains(x)){
                s.remove(x);
            }else s.add(x);
        }

        return new ArrayList<Integer>(s).get(0);

//        int xor=0;
//        for(int i=0; i<nums.length; i++)
//            xor ^= nums[i];
//        return xor;
    }

    public static void main(String[] args) {
        long nt = System.currentTimeMillis();
        SingleNumber s=new SingleNumber();
        System.out.println(s.singleNumber(new int[] {2,2,1}));
        System.out.println("Time taken " + (System.currentTimeMillis() - nt) + " ms");
    }
}
