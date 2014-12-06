public class Fibonacci {
	public static int fib(int n){
		int p0=0;
		int p1=1;
		int fib=0;
		if(n==0)
			return fib = p0;
		else if (n==1)
			return fib = p1;
		else
			for(int i = 2; i<=n;i++){
				fib = p0+p1;
				p0=p1;
				p1=fib;
			}
		return fib;
	}
	public static void main(String s[]){
		System.out.println(fib(4));
	}
	//0,1,1,2,3
}
