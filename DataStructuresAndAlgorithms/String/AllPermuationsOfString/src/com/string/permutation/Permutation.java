package com.string.permutation;

public class Permutation {

	public void permute(String str, int l, int r) {
		
		if(l==r) {
			System.out.println(str);
		}
		
		for(int i=l;i<=r;i++) {
			str = swap(str,l,i);
			permute(str,l+1,r);
			str = swap(str,l,i);
		}
	}
	
	private String swap(String str, int l, int r) {
		
		char[] charArray = str.toCharArray();
		char temp = charArray[l];
		charArray[l]=charArray[r];
		charArray[r]=temp;
		return String.valueOf(charArray);
		
	}
	
	public static void main(String[] args) {
		new Permutation().permute("ABCD", 0, 3);
	}
}
