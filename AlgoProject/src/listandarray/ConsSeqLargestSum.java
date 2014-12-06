package listandarray;
public class ConsSeqLargestSum {
	public static int getConsSeq(int [] a){
		int sum = 0;
		int maxsum = 0;
		for (int t :a){
			sum = sum+t;
			if(sum<0){
				sum = 0;
			}
			else if(sum>maxsum){
				maxsum = sum;
			}
		}
		return maxsum;
	}
	public static void main(String s[]){
		int [] a = {2, -8, 3, -2, 4, -10};
		System.out.print(getConsSeq(a));
	}
}
