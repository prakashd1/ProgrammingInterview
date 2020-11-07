package ip;



import java.util.ArrayDeque;
import java.util.ArrayList;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] !=9){
                digits[i]++;
                return digits;
            }else
                digits[i]=0;

        }
        int []x=new int[digits.length+1];
        x[0]=1;
        return x;


    }

    public static void main(String[] args) {
        System.out.println(new PlusOne().plusOne(new int[]{}));
    }
}
