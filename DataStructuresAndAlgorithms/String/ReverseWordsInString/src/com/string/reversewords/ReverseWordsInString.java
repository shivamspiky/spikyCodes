package com.string.reversewords;

public class ReverseWordsInString {

	public String reverse(String str) {
		
		if(str==null || str.length()==0 || str.length()==1) {
			return str;
		}
		
		char[] charArray = str.toCharArray();
		//System.out.println(String.valueOf(charArray));
		int n = str.length();
		//System.out.println(n);
		int i=0;
		int j=0;
		reverse(charArray,0,n-1);
		//System.out.println(charArray);
		while(j<n) {
			if(j==n-1) {
				reverse(charArray,i,j);
				j++;
			}
			
			else if(charArray[j]==' ') {
				reverse(charArray,i,j-1);
				j++;
				i=j;
			}
			else {
				j++;
			}
		}
		
		return String.valueOf(charArray);
	}
	
	private void reverse(char[] charArray, int i, int j) {
		
		while(i<j) {
			char temp = charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		String str = "Hi shivam how you are doing";
		ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
		System.out.println(reverseWordsInString.reverse(str));
	}
}
