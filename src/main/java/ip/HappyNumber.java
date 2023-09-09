package ip;

public class HappyNumber {
    public boolean isHappy(int n) {

        for(int i=0;i<10;i++){
            n=findSum(n);
            if(n==1) return true;
        }
        return false;
    }
    int findSum(int n){
        int sum=0;
        while(n>0){
            int i = n%10;
            n = n/10;
            sum = sum + (i *i);
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }
}
