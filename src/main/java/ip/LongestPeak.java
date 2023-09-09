package ip;

class LongestPeak {
    public static int longestPeak(int[] array) {
        if(array.length==0) return 0;
        int peak=0;
        for(int i=1;i<array.length-1;i++){
            if(array[i+1]<array[i] && array[i-1]<array[i])
                peak=Math.max(findPeakLength(array, i),peak);

        }
        return peak;
    }
    static int findPeakLength(int[] a, int i){
        int cl=i -2;
        int cr=i + 2 ;
        while(cl >=0 && a[cl] <a[cl+1] ){
            cl--;
        }
        while(cr< a.length && a[cr] < a[cr-1] )
            cr++;
        System.out.println("Peak at " + a[i] + "=" + (cr-cl-1) );
        return cr-cl-1;
    }

    public static void main(String[] args) {
        System.out.println(longestPeak(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
    }

}
