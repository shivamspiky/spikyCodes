package com.string.removeduplicates;

public class RemoveAllDuplicatesFromString {

	public String removeAllDuplicates(String str) {
		
		boolean[] visited = new boolean[256];
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(visited[str.charAt(i)]==false) {
				builder.append(str.charAt(i));
				visited[str.charAt(i)]=true;
			}
		}
		
		return builder.toString();
	}
	
	public static void main(String[] args) {
		RemoveAllDuplicatesFromString removeAllDuplicatesFromString = new RemoveAllDuplicatesFromString();
		System.out.println(removeAllDuplicatesFromString.removeAllDuplicates("geeksforgeeks"));
	}
}

