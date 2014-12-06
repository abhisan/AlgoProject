package recursion;

public class RodCuttingProblem {
	public static int[] prices = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };

	/**
	 * 
	 * 
	 * 
	 * Top down recursion
	 */
	public static int cutRodTopDown(int n) {
		if (n == 0)
			return 0;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			int q = prices[i - 1] + cutRodTopDown(n - i);
			if (q > max) {
				max = q;
			}
		}
		return max;
	}

	public static int cutRodBottomUp(final int n) {
		int[] r = new int[n];
		r[0] = 0;
		for (int i = 1; i <= n; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 1; j <= i; j++) {
				int q = prices[i] + r[i-1];
				if (q > max) {
					max = q;
				}
			}
			r[i] = prices[i];
		}
		return 0;
	}

	public static void main(String s[]) {
		System.out.println(cutRodTopDown(4));
	}
}
