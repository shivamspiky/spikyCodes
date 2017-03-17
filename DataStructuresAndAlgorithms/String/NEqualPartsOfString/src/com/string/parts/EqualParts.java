package com.string.parts;

public class EqualParts {

	public String[]  getEqualParts(String str, int n) {
		int strLen = str.length();
		
		int partLen = strLen/n;
		char[] charArray = str.toCharArray();
		char[] temp = new char[partLen];
		String[] result = new String[n];
		int k=0;
		int j=0;
		for(int i=0; i<strLen;i++) {
			temp[j]=charArray[i];
			j++;
			if((i+1)%partLen==0) {
				result[k]=String.valueOf(temp);
				j=0;
				k++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		EqualParts equalParts = new EqualParts();
		String str = "abcdefgh";
		String[] result = equalParts.getEqualParts(str, 4);
		
		for(int i=0;i< result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
