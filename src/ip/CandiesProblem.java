package ip;

//https://leetcode.com/problems/distribute-candies-to-people/

public class CandiesProblem {
    public int[] distributeCandies(int candies, int num_people) {

        int r[]=new int[num_people];
        boolean fwd=true;
        int cnt=1;
        while(candies>0){
          for(int i=0;i<num_people;i++){
            if(candies < cnt){
                r[i]+=candies; candies=0;
            }else {
                candies-=cnt;
                r[i]+=cnt++;
            }
          }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr=new CandiesProblem().distributeCandies(10,3);
        for (int x:arr){
            System.out.print(x + " ");
        }
    }
}
