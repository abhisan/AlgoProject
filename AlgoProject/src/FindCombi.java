
public class FindCombi {
	public static void main(String[] args) {
		int[] a = { 5, 5, 10, 2, 3 };
		// int[] a={1, 2, 3, 4, 5}; toSearch=15
		int i = find15Combi(a, 0, 15);
		System.out.println(i);
	}
	private static int find15Combi(int[] a, int start, int toSearch) {
		int i = 0;		
		for (; start < a.length; start++) {	
			if (a[start] == toSearch) {
				i++;			
			} 
			else if (a[start] < toSearch)
				i = i + find15Combi(a, start + 1, toSearch - a[start]);		
		}		
		return i;
	}
}
