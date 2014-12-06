package listandarray;
public class RotateArray {
	
	// A[1 2 3 4 5 6], pivot=2 => [3 4 5 6 1 2]. left rotate
	// length = 6
	// A[1 2 3 4 5 6], pivot=2 => [2 3 4 5 6 1] right rotate
	// A[1 2 3 4 5], pivot  = 2 => [3 4 5 1 2]
	public int[] rotate(int[] array, int pivot) {
		int length = array.length;
		if (length == 0 || pivot % length == 0)
			return array;
		pivot = ((pivot % 	length) + length) % length; // limit and make positive
		int[] dest = new int[length];
		for (int i = 0; i < length; i++) {
			int index = (i + pivot) % length;
			dest[index] = array[i];
		}
		return dest;
	}

	public int findElement(int[] a, int k) {
		if (a.length == 0 || a == null)
			return -1;
		int s = 0, e = a.length - 1;
		
		while (s <= e) {
			int mid = (s + e) / 2;
			if (a[mid] == k)
				return mid;
			else if (k > a[mid]) {
				if (a[s] > a[mid] && a[s] <= k)
					e = mid - 1;
				else
					s = mid + 1;
			} else {
				if (a[e] < a[mid] && a[e] >= k)
					s = mid + 1;
				else
					e = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String s[]){
		int []a = {3,4,5,6,1,2}; 
		RotateArray ra = new RotateArray();
		System.out.println(ra.findElement(a, 4));
	}
	
}