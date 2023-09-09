package ip;

import java.util.*;

public class AnagramsOfString {
    public static List<Integer> slidingWindow(String s, String p){
        int []letters =new int[26];
        for (int i=0;i<s.length();i++){
            letters[s.charAt(i)-'a']++;
        }
        int j=0;
        int rem = p.length();
        List<Integer> result = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            while(j<s.length() && j-i <p.length()){
                if(letters[s.charAt(j++)-'a']-- > 0)
                    rem--;

            }
            if(rem==0 && j-i == p.length()) result.add(i);
            if(letters[s.charAt(i)-'a']++ >=0) rem++;
        }

        return result;
    }

    public static void main(String[] args) {
//        System.out.println(slidingWindowTemplateByHarryChaoyangHe("cbaebabacd", "abc"));
        System.out.println(slidingWindow("cbaebabacd", "abc"));

    }

    public static List<Integer> slidingWindowTemplateByHarryChaoyangHe(String s, String t) {
        //init a collection or int value to save the result according the question.
        List<Integer> result = new LinkedList<>();
        if(t.length()> s.length()) return result;

        //create a hashmap to save the Characters of the target substring.
        //(K, V) = (Character, Frequence of the Characters)
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //maintain a counter to check whether match the target string.
        int counter = map.size();//must be the map size, NOT the string size because the char may be duplicate.

        //Two Pointers: begin - left pointer of the window; end - right pointer of the window
        int begin = 0, end = 0;

        //the length of the substring which match the target string.
        int len = Integer.MAX_VALUE;

        //loop at the begining of the source string
        while(end < s.length()){

            char c = s.charAt(end);//get a character

            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);// plus or minus one
                if(map.get(c) == 0) counter--;//modify the counter according the requirement(different condition).
            }
            end++;

            //increase begin pointer to make it invalid/valid again
            while(counter == 0 /* counter condition. different question may have different condition */){

                char tempc = s.charAt(begin);//***be careful here: choose the char at begin pointer, NOT the end pointer
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);//plus or minus one
                    if(map.get(tempc) > 0) counter++;//modify the counter according the requirement(different condition).
                }

                /* save / update(min/max) the result if find a target*/
                // result collections or result int value

                begin++;
            }
        }
        return result;
    }
}
