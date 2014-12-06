package recursion;

public class EightQueenProblem {
	public static int columnForRow[] = new int [8];
	public static boolean check(int row) {
		for (int i = 0; i < row; i++) {
			int diff = Math.abs(columnForRow[i] - columnForRow[row]);
			if (diff == 0 || diff == row - i)
				return false;
		}
		return true;
	}
		
	public static void placeQueen(int row){
		if (row == 8) {
			printBoard();
			return;
		}
		for (int i = 0; i < 8; i++) {
			columnForRow[row]=i;
			if(check(row)){
				placeQueen(row+1);
			}
		}
	}
	
	public static void printBoard(){
		for(int row=0; row< 8; row++){
			printSpace(columnForRow[row]);
			System.out.print("Q");
			printSpace(8-columnForRow[row]-1);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public static void main(String s[]){
		placeQueen(0);
	}
	public static void printSpace(int i){
		for(int j=0; j<i;j++)
			System.out.print("*");
	}
	
}
/*
  0 1 2 3 4 5 6 7
0
1
2
3
4
5
6
7
*/