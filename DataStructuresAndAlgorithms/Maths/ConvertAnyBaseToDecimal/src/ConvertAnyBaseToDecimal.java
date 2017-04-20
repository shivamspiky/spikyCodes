
public class ConvertAnyBaseToDecimal {

	public int convert(String str, int base) {
		
		if(str == null || str.length()==0) {
			return -1;
		}
		
		int n = str.length();
		int decimal =0;
		for(int i=0;i<n;i++) {
			decimal += charToVal(str.charAt(n-1-i))*power(base,i);
		}
		
		return decimal;
	}
	
	private int charToVal(char c) {
		return c-'0';
	}
	
	StringBuilder builder;
	private int power(int base, int index) {
		
		if(index==0) {
			return 1;
		}
		int power = 1;
		while(index>0) {
			power *=base;
			index--;
		}
		return power;
	}
	
	public static void main(String[] args) {
		ConvertAnyBaseToDecimal convertAnyBaseToDecimal = new ConvertAnyBaseToDecimal();
		System.out.println("Decimal representation of binary number 11110  is " + convertAnyBaseToDecimal.convert("11110", 2));
	}
	
}
