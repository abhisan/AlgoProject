import java.util.ArrayList;
import java.util.List;

//Write a method that returns all subsets of a set.
public class SubSet {
	static ArrayList<ArrayList<Integer>> getSubsets(List<Integer> set, int index) {
		ArrayList<ArrayList<Integer>> allsubsets;
		if (set.size() == index) {
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>()); // Empty set
		} else {
			allsubsets = getSubsets(set, index + 1); //1, 2, 3
			int item = set.get(index);//0, 1, 2, 3
			ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> subset : allsubsets) {
				ArrayList<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset); //
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
		}
		return allsubsets;
	}
	public static void main(String s[]){
		List<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(9);
		set.add(2);
		ArrayList<ArrayList<Integer>> list = getSubsets(set, 0);
		System.out.print(list);
	}
}
