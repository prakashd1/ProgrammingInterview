package ip.advent2022;

import java.io.File;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Day25 {
    Map<Character,Integer> m =new HashMap<>();
    public Day25(){
        m.put('-', -1);
        m.put('=', -2);
    }

    public long snafuToInt(String s){
        int pwr=0;
        long result=0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int x =Character.getNumericValue(c);
                result+= Math.pow(5,pwr++) * x;
            }else{
                int x = m.get(c);
                result+= Math.pow(5,pwr++) * x;
            }
        }
        return result;
    }
    public String intToSnafu(BigInteger num){
        StringBuilder sb = new StringBuilder();
        int prev=0;

        while(num.signum()>0){
            BigInteger x = num.mod(BigInteger.valueOf(5));
            if(x.intValue() == 4){
                sb.append("-");
                num = num.divide(BigInteger.valueOf(5)).add(BigInteger.valueOf(1));
            }else if(x.intValue() ==3){
                sb.append("=");
                num = num.divide(BigInteger.valueOf(5)).add(BigInteger.valueOf(1));
            }else{
                String s = x.toString();
                sb.append(s);
                num = num.divide(BigInteger.valueOf(5));
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) throws Exception {
        Day25 d = new Day25();
        File file = new File("resources/day25.txt");
        Scanner sc = new Scanner(file);
        BigInteger sum = new BigInteger("0");
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            long x = d.snafuToInt(line);
            sum = sum.add(BigInteger.valueOf(x));
        }
        System.out.println(sum);
        System.out.println(d.intToSnafu(sum));
    }
}
