package sort;

public class MergeSort {
	public static void merge(int[] a, int[] b, int n, int m) {
		int anewend = n + m - 1;
		int i = n - 1;
		int j = m - 1;
		while (i >= 0 && j >= 0) {
			if (a[i] > b[j]) {
				a[anewend] = a[i];
				i--;
			} else {
				a[anewend] = b[j];
				j--;
			}
			anewend--;
		}
		while (i >= 0) {
			a[anewend] = a[i];
			i--;
			anewend--;
		}
		while (j >= 0) {
			a[anewend] = b[j];
			j--;
			anewend--;
		}
	}

	public static void main(String s[]) {
		int[] a = { 2, 6, 8, 9 };
		int[] b = { 1, 5, 7, 8, 10 };
		merge(a, b, 4, 5);
		System.out.print(a.toString());
	}
}
// 01 234 56

