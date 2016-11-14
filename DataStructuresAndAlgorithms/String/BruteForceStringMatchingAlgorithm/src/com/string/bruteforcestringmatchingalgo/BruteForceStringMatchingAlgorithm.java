package com.string.bruteforcestringmatchingalgo;

public class BruteForceStringMatchingAlgorithm {

//	int prime = 3;
//	
//	public long calculateHash(String abc) {
//		long hash=0;
//		for(int i=0 ;i<abc.length() ;i++) {
//			hash+=abc.charAt(i)*Math.pow(prime, i);
//		}
//		return hash;
//	}
//	
//	public long calculateRehash(char remove,char add, long oldHash,int patternLength) {
//		long rehash=0;
//		return (long) (((oldHash-remove)/prime) + add*Math.pow(prime, patternLength-1));
//	}
	
	public int stringMatchingFunc(String pattern, String text) {
		for(int i=0;i<=text.length()-pattern.length() ;i++) {
			if(pattern.equals(text.substring(i, i+pattern.length()))) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		BruteForceStringMatchingAlgorithm bruteForceStringMatchingAlgorithm = new BruteForceStringMatchingAlgorithm();
		System.out.println(bruteForceStringMatchingAlgorithm.stringMatchingFunc("abc", "bulabclshit"));
	} 
}
