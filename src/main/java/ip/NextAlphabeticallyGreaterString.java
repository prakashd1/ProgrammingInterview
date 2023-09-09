package ip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextAlphabeticallyGreaterString {

	public static void main(String[] args) {

		System.out.println(findNextAlphabeticallyGreaterString("baca"));
	}

	public static String findNextAlphabeticallyGreaterString(String s) {
		String nextString = "";
		List<Character> l = new ArrayList<>();
		for (char c : s.toCharArray()) {
			l.add(c);
		}
		int breakIndex = Integer.MAX_VALUE;
		for (int i = 1; i < l.size(); i++) {
			if (l.get(i) > l.get(i - 1)) {
				breakIndex = i - 1;
			}
		}

		if (breakIndex == Integer.MAX_VALUE)
			return s;
		int justBetter = Integer.MAX_VALUE;
		int swapInd = Integer.MAX_VALUE;
		for (int j = breakIndex + 1; j < l.size(); j++) {
			int x = l.get(j);
			int y = l.get(breakIndex);
			if ((x < justBetter) && (x > y)) {
				swapInd = j;
				justBetter = x;
			}
		}

//		Collections.swap(l, breakIndex, swapInd);
//		StringBuilder sb = new StringBuilder("");
//		char carr=l.toArray();
//		Arrays.sort(l.subList(swapInd+1, l.size()-1));

		return new String();

	}
}
