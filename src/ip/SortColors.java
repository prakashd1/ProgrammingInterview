package ip;

public class SortColors {
    public void sortColors(int[] nums) {
        int start=0,index=0,end=nums.length-1;

        while(index<=end){

            int c=nums[index];
            System.out.println("Before start:" + start + " end: "+end + " index:" + index + " nums[i]:" + c);
            if(c==0){
                swap(nums, start++, index++);
            }else if(c==2){
                swap(nums, index, end--);
            }else index++;
            System.out.println("After start:" + start + " end: "+end + " index:" + index + " nums[i]:" + c);
            System.out.println("-----------------------------------------");

        }
    }
    private void swap(int []nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }

    public static void main(String[] args) {
        int []x=new int[]{2,0,2,1,1,0};
        new SortColors().sortColors(x);
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}
