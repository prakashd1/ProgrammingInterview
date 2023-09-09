package ip;

//https://leetcode.com/problems/sum-of-two-integers/
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;

    }

    public static void main(String[] args) {
        SumOfTwoIntegers sum=new SumOfTwoIntegers();
        System.out.println(sum.getSum(2, 3));
    }
}
