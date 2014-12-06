public class LargestPalindromeSequence {
	// If last and first characters of X are same, then L(0, n-1) = L(1, n-2) +
	// 2.
	// Else L(0, n-1) = MAX (L(1, n-1), L(0, n-2)).

	public static int palindromeSubSequenceWRec(String s, int start, int end) {
		if (start == end)
			return 1;
		if (s.charAt(start) == s.charAt(end)) {
			if (start + 1 == end) {
				return 2;
			} else
				return palindromeSubSequenceWRec(s, start + 1, end - 1) + 2;
		} else {
			return Math.max(palindromeSubSequenceWRec(s, start, end - 1),
					palindromeSubSequenceWRec(s, start + 1, end));
		}
	}
	
	//incomplete
	public static int palindromeSubSequenceWORec(String s, int start, int end) {
		char[] charc = new char[5];
		int i = 0;
		int j = s.length() - 1;
		int length = 0;
		while (true) {
			char front = charc[i];
			char back = charc[j];
			if (front == back) {
				length = 2;
				i++;
				j--;
			} else {
				break;
			}
		}
		return 0;
	}
	
	public static void main(String s[]){
		String str = "BBABCBCAB";
		System.out.println(LargestPalindromeSequence.palindromeSubSequenceWRec(str,0,str.length()-1));
	}
}