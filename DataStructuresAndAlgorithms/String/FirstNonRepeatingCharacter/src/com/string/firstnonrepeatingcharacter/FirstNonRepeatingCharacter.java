package com.string.firstnonrepeatingcharacter;

public class FirstNonRepeatingCharacter {

	public char getFirstNonRepeating(String str) {
		
		
		int[] count = new int[256];
		int n = str.length();
		for(int i=0;i<n;i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i<n;i++) {
			if(count[str.charAt(i)]==1) {
				return str.charAt(i);
			}
		}
		return 0;
	}
	
	public char getFirstNonRepeatingInOneSwap(String str) {
		
		CountWithIndex[] count= new CountWithIndex[256];
		int n = str.length();
		
		for(int i=0;i<n;i++) {
			if(count[str.charAt(i)]==null) {
				count[str.charAt(i)]=new CountWithIndex(1, i);
			} else {
				count[str.charAt(i)]=new CountWithIndex(count[str.charAt(i)].count++, i);
			}
			
		}
		int result_index=Integer.MAX_VALUE;
		for(int i=0;i<256;i++) {
			
			if(count[i]==null) {
				continue;
			}
			if(count[i].count==1) {
				result_index=Math.min(result_index,count[i].index);
			}
		}
		
		return str.charAt(result_index);
	}
	
	class CountWithIndex{
		public int count;
		public int index;
		
		public CountWithIndex(int count ,int index) {
			this.count = count;
			this.index = index;
		}
	}
	
	
	public static void main(String[] args) {
		FirstNonRepeatingCharacter firstNonRepeatingCharacter = new FirstNonRepeatingCharacter();
		System.out.println(firstNonRepeatingCharacter.getFirstNonRepeatingInOneSwap("abcdabcef"));
	}
}
