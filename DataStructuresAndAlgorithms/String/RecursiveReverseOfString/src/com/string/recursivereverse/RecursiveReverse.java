package com.string.recursivereverse;

public class RecursiveReverse {

	public String recursive_reverse(String str) {
		
		if(str==null || str.length()==0 || str.length()==1) {
			return str;
		}
		
		char ch = str.charAt(0);
		String str1 = recursive_reverse(str.substring(1));
		
		return str1+ch;
	}
	
	public static void main(String[] args) {
		RecursiveReverse recursiveReverse = new RecursiveReverse();
		System.out.println(recursiveReverse.recursive_reverse("abcedf"));
	}
}
