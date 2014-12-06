package recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermu {
	public static List<String> stringPermu(String s) {
		List<String> temp = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		if (s.length() == 1) {
			list.add(s);
		} else {
			char c = getFirstChar(s);
			temp = stringPermu(removeFirstChar(s));
			for (String t : temp) {
				for (int i = 0; i <= t.length(); i++) {
					list.add(insertCharAt(t, c, i));
				}
			}
		}
		return list;
	}

	public static char getFirstChar(String s) {
		return s.charAt(0);
	}

	public static String removeFirstChar(String s) {
		return s.substring(1);
	}

	public static String insertCharAt(String s, char c, int index) {
		String last = s.substring(index);
		String first = s.substring(0, index);
		return first + c + last;
	}

	public static void main(String s[]) {
		List<String> result = stringPermu("abc");
		for (String t : result) {
			System.out.println(t);
		}
	}
}

	
	
	
	
	