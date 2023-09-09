package ip;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/discuss/interview-question/681507/Google-Amazon-FB-(ML-Position)-Phone-Screen-Problems%3A-Spring-2018
public class CodeBreakersGuess {

    public static Map<String, Integer> guessCode(char []a, char[] b){
        Map <String ,Integer> m=new HashMap<>();
        m.put("W", 0); m.put("B",0);

        for(int i=0;i<a.length;i++){
            if(a[i]==b[i])
                m.put("B", m.get("B")+1);
            else{

            }


        }


        return m;

    }

    public static void main(String[] args) {
        System.out.println(guessCode(new char[]{'R', 'R', 'G', 'Y'} , new char[]{'R', 'Y', 'R', 'O'}));
    }
}
