package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
	public static Integer [] abc = {1,2,3};
	public static List<List<Integer>> getSubSet(List<List<Integer>> set, int index){
		List<List<Integer>> temp = cloneArray(set);
		for(List<Integer> a : temp){
			a.add(abc[index]);
		}
		set.addAll(temp);
		index++;
		if(index<abc.length){
		
			//set.addAll(getSubSet(set,index));
			getSubSet(set,index);
		}
		return set;
	}
	
	public static List<List<Integer>> getSubSet_ver2(int index){
		List<List<Integer>> superList = new ArrayList<List<Integer>>();
		if(index==abc.length){
			superList.add(new ArrayList<Integer>());
		}
		else{
			superList = getSubSet_ver2(index+1);
			List<List<Integer>> temp = new ArrayList<List<Integer>>(); 
			for(List<Integer> t : superList){
				List<Integer> t1 = new ArrayList<Integer>();
				t1.addAll(t);
				t1.add(abc[index]);
				temp.add(t1);
			}
			superList.addAll(temp);
		}
		return superList;
	}
	
	
	
	
	public static List<List<Integer>> cloneArray(List<List<Integer>> l){
		List<List<Integer>> temp = new ArrayList<List<Integer>>();
		List<Integer> innerList;
		for(List<Integer> i: l){
			innerList = new ArrayList<Integer>();
			for(Integer value : i){
				innerList.add(value);
			}
			temp.add(innerList);
		}
		return temp;
	}
	public static void main(String s[]){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		//list.add(new ArrayList<Integer>());
		//list = getSubSet(list, 0);
		list = getSubSet_ver2(0);
		System.out.print(list);
	}
}
/*if(set.size()==0){
	set.add(new ArrayList<Integer>());
}
else
{*/