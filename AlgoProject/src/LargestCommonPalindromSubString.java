public class LargestCommonPalindromSubString {
	/**
	 * len => 5 to 1 j=> 0 to 5-len
	 * 
	 * len 5 5 {0} substring(0, 5)
	 * 
	 * len 4 4 {0} substring(0, 4) 3 {1} substring(1, 5)
	 * 
	 * len 43 3 {0} substring(0, 3) 2 {1} substring(1, 4) 1 {2} substring(2, 5)
	 */

	/**
	 * Top down approach without recursion
	 */
	public String longestPalindrome(String s) {
		for (int len = s.length(); len > 0; --len) {
			for (int j = 0; j <= s.length() - len; ++j) {
				String sub = s.substring(j, j + len);
				if (isPalindrome(sub))
					return sub;
			}
		}
		return new String();
	}

	private boolean isPalindrome(String s) {
		if (s.length() <= 1)
			return true;
		else
			return s.charAt(0) == s.charAt(s.length() - 1)
					&& isPalindrome(s.substring(1, s.length() - 1));
	}
}
