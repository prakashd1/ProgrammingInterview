package ip;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static int findLogestSubstring(String s) {
		int i=0,j=0;
		int max=0;
		Map<Character,Integer> m=new HashMap<>();
		while(i<s.length()) {
			char e=s.charAt(i);
			if(m.containsKey(e)) {
				j=Math.max(j, m.get(e)+1);
			}
			m.put(e, i);
			max=Math.max(max, i-j+1);
			i++;
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		System.out.println(findLogestSubstring("pwwkew"));
	}
}
