package recursion;
import java.util.ArrayList;
import java.util.List;


public class RobotMoveOnNMMatrix {
	static int n = 2;
	static int m = 3;
	public static void move(int x, int y, List<String> array){
		if(array==null)
			array = new ArrayList<String>();
		
		if(x==n && y==m){
			print(array);
			return;
		}
		if(x<n){
			List<String> temp = copyArray(array);
			temp.add(":Right:");
			move(x+1,y, temp);
		}
		if(y<m){
			List<String> temp = copyArray(array);
			temp.add( ":Down:");
			move(x,y+1,temp);
		}
		
	}
	
	public static void print(List<String> array){
		for(String s : array){
			System.out.print(s);
		}
		System.out.print("\n");
	}
	
	public static List<String> copyArray(List<String> list){
		List<String> newArray = new ArrayList<String>();
		
		for(String s: list){
			newArray.add(s);
		}
		return newArray;
	}
	public static void main(String s[]){
		int x = 1;
		int y = 1;
		move(x,y,new ArrayList<String>());
	}
}
