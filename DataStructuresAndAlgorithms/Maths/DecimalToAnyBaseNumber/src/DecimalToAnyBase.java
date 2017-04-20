
public class DecimalToAnyBase {

	public String convert(int n ,int base) {
		
		StringBuilder builder = new StringBuilder();
		int power = 1;
		
		/*find the highest power of base dividing the element*/
		while(power <= n) {
			power *= base;
		}
		power = power/base;
		
		/*find the most significant bit to lowest significant bit*/
		while(power > 0) {
			builder.append(n/power);
			n=n%power;
			power = power /base;
		} 
		
		return builder.toString();
	}
	
	public static void main(String[] args) {
		DecimalToAnyBase convert = new DecimalToAnyBase();
		System.out.println("Binary representation of 10 is " + convert.convert(31, 2));
	}
}
