package recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintPar {
	static int n = 0;

	public static void printPar(List<Character> array) {
		if (array == null) {
			array = new ExtList();
		}
		List<Character> temp;
		if (array.size() == n * 2) {
			flushPar(array);
			return;
		}
		if (isOpenParValid(array)) {
			temp = copyArray(array);
			temp.add('(');
			printPar(temp);
		}
		if (isCloseParValid(array)) {
			temp = copyArray(array);
			temp.add(')');
			printPar(temp);
		}
	}

	public static boolean isOpenParValid(List<Character> list) {
		ExtList ext = (ExtList) list;
		if (ext.openPar != n)
			return true;
		return false;
	}

	public static boolean isCloseParValid(List<Character> list) {
		ExtList ext = (ExtList) list;
		if (ext.openPar > ext.closePar)
			return true;
		return false;
	}

	public static void flushPar(List<Character> array) {
		for (Character c : array) {
			System.out.print(c);
		}
		System.out.print("\n");
	}

	public static List<Character> copyArray(List<Character> list) {
		List<Character> newArray = new ExtList();

		for (Character s : list) {
			newArray.add(s);
		}
		return newArray;
	}

	public static void main(String s[]) {
		printPar(null);
	}
}

class ExtList extends ArrayList<Character> implements List<Character> {
	private static final long serialVersionUID = 6010748554062727143L;
	public int openPar = 0;
	public int closePar = 0;

	public boolean add(Character o) {
		if (o == '(')
			openPar++;
		else if (o == ')')
			closePar++;
		else
			return false;
		return super.add(o);
	}

	public void add(int index, Character element) {
		super.add(index, element);
	}
}