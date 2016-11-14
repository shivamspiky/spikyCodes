package com.string.robinkarpstringmatchingalgorithm;

public class RobinKarpStringMAtchingAlgorithm {

	int prime = 3;
	private long calculateHash(String abc) {
		long hash=0;
		for(int i=0 ;i<abc.length() ;i++) {
			hash+=abc.charAt(i)*Math.pow(prime, i);
		}
		return hash;
	}
	
	private long calculateRehash(char remove,char add, long oldHash,int patternLength) {
		
		return (long) (((oldHash-remove)/prime) + add*Math.pow(prime, patternLength-1));
	}
	
	public int stringMatchingFunc(String pattern, String text) {
	
		long patternHash = calculateHash(pattern);
		long textHash = calculateHash(text.substring(0, pattern.length()));
		for (int i=0;i<=text.length()-pattern.length();i++) {
			
			if(textHash==patternHash && pattern.equals(text.substring(i,i+pattern.length()))){
				return i;
			}
			else{
				if(i<=text.length()-pattern.length()-1)
					textHash=calculateRehash(text.charAt(i), text.charAt(i+pattern.length()), textHash, pattern.length());
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		RobinKarpStringMAtchingAlgorithm robinKarpStringMAtchingAlgorithm = new RobinKarpStringMAtchingAlgorithm();
		System.out.println(robinKarpStringMAtchingAlgorithm.stringMatchingFunc("abcd", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabulabcddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddshit"));
	}
}
