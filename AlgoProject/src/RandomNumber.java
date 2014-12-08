public class RandomNumber {
	public static int rand(int lower, int higher) {
		return lower + (int) (Math.random() * (higher - lower + 1));
	}

	public static void main(String s[]) {
		System.out.println(rand(3, 6));
		// System.out.println((int)4.6);
		// System.out.println(Math.abs(-4.5));
		for (int i = 0; i < 40; i++)
			System.out.print(rand5());

	}

	public static int rand7() {
		while (true) {
			int num = 5 * (rand5() - 1) + (rand5() - 1);
			if (num < 21)
				return (num % 7 + 1);
		}
	}

	/**
	 * Values range from 1~5 Formula : lower + rand()(upper-lower+1)
	 */
	public static int rand5() {
		double rand = Math.random();// [0,1)
		return 1 + (int) (rand * (5 - 1 + 1));
	}

}
/**
 * lower higher rand value 0 5 0~1 0 lower 0.9 5 0.5
 */
