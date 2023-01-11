package ip.advent2022;

package com.pd;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Day25 {
    Map<Character,Integer> m =new HashMap<>();
    TreeMap<Integer, String> map =new TreeMap<>();
    public Day25(){
        m.put('-', -1);
        m.put('=', -2);
    }

    public int SnafuToInt(String s){
        int pwr=0;
        int result=0;
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
    public String intToSnafu(int num){
        StringBuilder sb = new StringBuilder();
        int prev=0;

        while(num>0){
            int x = num % 5;
            if(x == 4){
                sb.append("-");
                num = num/5 + 1;
            }else if(x ==3){
                sb.append("=");
                num = num/5 + 1;
            }else{
                String s = Integer.toString(x);
                sb.append(s);
                num = num/5;
            }
        }
        return sb.reverse().toString();
    }

    public int findHP(int num){
        return (int)(Math.log(num)/ Math.log(5)) + 1;
    }



    public static void main(String[] args) {

        Day25 d = new Day25();
        d.constructMapping();

        System.out.println(d.intToSnafu(353));
    }

    public void constructMapping(){
        map.put(-2 , "=");
        map.put(-1, "-");
        map.put(1, "1");
        map.put(3, "5=");
        map.put(4, "5-");
        for(int i=1;i<8;i++){
            int num =(int) Math.pow(5,i);
            String repeat = "0".repeat(i-1);
            int lowerNum = (int) Math.pow(5,i-1);
            map.put(num-lowerNum, "1-" + repeat);
            map.put(num-lowerNum*2, "1=" + repeat);

        }

    }
}
