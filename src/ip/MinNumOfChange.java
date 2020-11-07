package ip;
//https://leetcode.com/problems/coin-change/

import java.util.Arrays;

public class MinNumOfChange {
    public static int minNumberOfCoinsForChange(int n, int[] denoms) {
        int res[] = new int[n+1];
        Arrays.fill(res, Integer.MAX_VALUE);
        res[0]=0;
        for(int d:denoms){
            for(int amt=d;amt<=n;amt++){
                int cmp = Integer.MAX_VALUE;
                if(res[amt-d] != Integer.MAX_VALUE){
                    cmp = 1 + res[amt-d];
                }
                res[amt] = Math.min(res[amt] , cmp );
            }
        }
        return res[n]==Integer.MAX_VALUE ? -1 : res[n];
    }

    public static void main(String[] args) {
        System.out.println(minNumberOfCoinsForChange(3,new int[]{2,1} ));
    }

}
