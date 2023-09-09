package ip;

import java.util.Arrays;

public class MaxArray {

    public static int maxSubsetSumNoAdjacent(int[] array) {
        int res[] = array.clone();
        if(array.length==0) return 0;
        if(array.length ==1) return array[0];
        res[1]=Math.max(array[0],array[1]);

        for(int i=2;i<array.length;i++){
            res[i] = Math.max(res[i-2] +array[i] , res[i-1]);
        }
        return res[array.length-1];
    }

    public static void main(String[] args) {
        System.out.println(maxSubsetSumNoAdjacent(new int[]{75, 105, 120, 75, 90, 135}));
    }
}
