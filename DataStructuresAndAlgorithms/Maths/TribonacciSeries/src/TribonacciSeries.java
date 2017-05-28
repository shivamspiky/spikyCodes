
public class TribonacciSeries {

	public int nthNumber(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		if(n==2) {
			return 1;
		}
		
		int prev2 = 0;
		int prev1 = 1;
		int prev = 1;
		
		int num=0;
		for(int i=3;i<=n;i++) {
			num = prev + prev1 + prev2;
			prev2=prev1;
			prev1=prev;
			prev=num;
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		TribonacciSeries tribonacciSeries = new TribonacciSeries();
		System.out.println(tribonacciSeries.nthNumber(10));
	}
}
