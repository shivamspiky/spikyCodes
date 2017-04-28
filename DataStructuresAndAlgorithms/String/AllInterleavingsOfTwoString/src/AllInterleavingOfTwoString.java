
public class AllInterleavingOfTwoString {

	public void allInterleavings(String str1,int start1, String str2, int start2, char[] result, int len) {
		if(str1==null) {
			System.out.println(str2);
			return;
		}
		if(str2==null) {
			System.out.println(str1);
			return;
		}
		if(len==str1.length()+str2.length()) {
			System.out.println(String.valueOf(result));
		}
		
		if(start1<str1.length()) {
			result[len]=str1.charAt(start1);
			allInterleavings(str1,start1+1,str2,start2,result,len+1);
		}
		
		if(start2<str2.length()) {
			result[len]=str2.charAt(start2);
			allInterleavings(str1,start1,str2,start2+1,result,len+1);
		}
	}
	
	public static void main(String[] args) {
		String str1="AB";
		String str2 = "CD";
		char[] result = new char[str1.length()+str2.length()];
		AllInterleavingOfTwoString allInterleavingOfTwoString = new AllInterleavingOfTwoString();
		allInterleavingOfTwoString.allInterleavings(str1, 0, str2, 0, result, 0);
				
	}
}
