
public class shuffleArray {
	public static void shuffleArray(int[] cards) {
		int temp, index;
		for (int i = 0; i < cards.length; i++){
			double rand = Math.random();
			index = (int) (rand * (cards.length - i))     + i;
			temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
	public static void main(String s[]){
		int [] array = {1,2,3,4,5};
		shuffleArray(array);
		for(int a:array){
			System.out.println(a);
		}	
	}
}
