package ip;

public class KadanesAlgo {
    public static int kadanesAlgorithm(int[] array) {

        if(array.length ==0 ) return 0;
        int maxSum = array[0];

        for(int i=1;i<array.length;i++){
            array[i] = Math.max(array[i] , array[i-1] + array[i]);
            maxSum = Math.max(array[i] , maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
//        System.out.println(kadanesAlgorithm(new int[]{-2, 1}));
        System.out.println(kadens(new int[]{-2, 1}));
    }

    public static int kadens(int[] arr){
        if(arr==null || arr.length==0) return 0;
        int sum=arr[0];

        for(int i=1;i<arr.length;i++){
            arr[i] = Math.max(arr[i] , arr[i-1] + arr[i]);
            sum = Math.max(sum, arr[i]);
        }

        return sum;
    }

}
