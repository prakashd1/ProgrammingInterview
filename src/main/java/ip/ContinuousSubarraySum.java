package ip;

import java.util.HashMap;

//https://leetcode.com/problems/continuous-subarray-sum/
public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap <Integer,Integer> map=new HashMap();
        int sum=0;
        int result=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                return true;
            }
            map.put(sum , map.getOrDefault(sum, 0) +1 );


        }
        return false;

    }

    public static void main(String[] args) {
        ContinuousSubarraySum sum=new ContinuousSubarraySum();
        System.out.println(sum.checkSubarraySum(new int[]{23, 2, 4, 6, 7},42));
    }

}
