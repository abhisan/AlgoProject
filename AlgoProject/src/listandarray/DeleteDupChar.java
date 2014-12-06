package listandarray;
public class DeleteDupChar {
	static String s;
	public static void removeDuplicatesEff(char[] str) {
		if (str == null)
			return;
		int len = str.length;
		if (len < 2)
			return;
		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
			System.out.println(str);
		}
		str[tail] = 0;
		System.out.println(str);
	}
	public static void main(String s[]){
		removeDuplicatesEff("abcccf".toCharArray());
	}
}
/*
 * 
 * abcccf
 * abcf
 */
