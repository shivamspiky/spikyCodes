
public class NumberToStringLiteral {

	String[] tens = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty",
			"ninety"};
	String[] two_digits = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	public void words(int num,StringBuilder builder) {
		
		if(num==0 && builder.toString().equals("")) {
			builder.append("zero");
			return;
		}
		
		if(num==0 && !builder.toString().equals("")) {
			return;
		}
		
		if(num >= 1000000000) {
			words(num/1000000000,builder);
			builder.append(" billion");
			words(num%1000000000,builder);
		}
		
		else if(num>=1000000) {
			words(num/1000000,builder);
			builder.append(" million");
			words(num%1000000,builder);
		}
		
		else if(num>=1000) {
			words(num/1000,builder);
			builder.append(" thousand");
			words(num%1000,builder);
		}
		
		else if(num>=100) {
			words(num/100,builder);
			builder.append(" hundred");
			words(num%100,builder);
		}
		else if(num>=20) {
			builder.append(" " + tens[num/10-1]);
			words(num%10,builder);
		}
		else if(num>=10) {
			builder.append(" " + two_digits[num-10]);
		} else {
			builder.append(" " + ones[num]);
		}
	}
	
	public static void main(String[] args) {
		NumberToStringLiteral numberToStringLiteral = new NumberToStringLiteral();
		StringBuilder builder = new StringBuilder();
		numberToStringLiteral.words(12345678, builder);
		System.out.println(builder.toString());
	}
}
