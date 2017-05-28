
public class AllEvenPositionsToEndOfString {

	public String getTransformedString(String str) {
		if(str==null || str.length()==0 || str.length()==1) {
			return str;
		}
		char [] charArray = str.toCharArray();
		int remLen = str.length();
		int start = 0;
		
		while(remLen>0) {
			
			int tempLen = 1;
			while(3*tempLen+1<=remLen) {
				tempLen=3*tempLen;
			}
			int len = tempLen+1;
			cycleLeaderIteration(charArray,start,len);
			reverse(charArray,start/2,start-1);
			reverse(charArray,start,start+len/2-1);
			reverse(charArray,start/2,start+len/2-1);
			
			remLen-=len;
			start=start+len;
		}
		
		return String.valueOf(charArray);
	}
	
	private void cycleLeaderIteration(char[] charArray, int index, int len) {
		
		for(int i=1;i<len;i*=3) {
			
			int j = i;
			char var = charArray[index+j];
			do{
				
				if(j%2==0) {
					j=j/2;
				} else {
					j=j/2 + len/2;
				}
				
				char temp2 = charArray[index+j];
				charArray[index+j]=var;
				var = temp2;
			} while(j!=i);
		}
	}
	
	private  void reverse(char[] charArray, int start, int end) {
		while(start < end) {
			char temp = charArray[start];
			
			charArray[start]=charArray[end];
			charArray[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		AllEvenPositionsToEndOfString allEvenPositionsToEndOfString = new AllEvenPositionsToEndOfString();
		System.out.println(allEvenPositionsToEndOfString.getTransformedString("a1b2c3d4e5f6g7"));
	}
}
