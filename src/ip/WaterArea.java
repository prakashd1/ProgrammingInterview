package ip;



public class WaterArea {
    public static int waterArea( int[] heights) {
        if(heights.length==0) return 0;
        int left = 0, right = heights.length - 1, area = 0;
        int lmax=heights[left], rmax=heights[right];

        while (left < right){
            if(heights[left] < heights[right]){
                left++;
                lmax = Math.max(lmax,heights[left]);
                area+=lmax-heights[left];
            }else {
                right--;
                rmax = Math.max(rmax , heights[right]);
                area+=rmax-heights[right];
            }
        }
        return area;


    }

    public static void main(String[] args) {
        System.out.println(waterArea(new int[]{0, 8, 0, 0, 5, 0, 0, 10, 0, 0, 1, 1, 0, 3}));
    }
}
