package com.string.finiteautomata;

public class FiniteAutomataStringMatchingAlgorithm {
	public static final int MAX_CHAR_NUMBER = 256;
	public int matchingAlgorithm(String pattern, String text) {
		int[][] transitionFunction = computeTransitionFunction(pattern);
		int currentState = 0;
		for(int i=0;i<text.length();i++) {
			currentState = transitionFunction[currentState][text.charAt(i)];
			if(currentState==pattern.length()) {
				return i-pattern.length()+1;
			}
		}
		return -1;
	}
	
	/*
	 * O(m^2) complexity to compute transition function
	 * */
	private int[][] computeTransitionFunction(String pattern) {
		int[][] transitionFunction = new int[pattern.length()][MAX_CHAR_NUMBER];
		for(int i=0;i< pattern.length();i++) {
			for(int j=0 ;j< MAX_CHAR_NUMBER;j++) {
				if(pattern.charAt(i)==(char)j) {
					transitionFunction[i][j]=i+1;
				} else {
					transitionFunction[i][j] = minNumberOfCharMatched(pattern.substring(0, i+1), (char)j);
				}
			}
		}
		return transitionFunction;
	}
	
	private int minNumberOfCharMatched(String pattern, char actual) {
		String temp = pattern+Character.toString(actual);
		int count=0;
		for(int i=0 ;i < pattern.length();i++) {
			if(pattern.charAt(pattern.length()-1-i) == temp.charAt(pattern.length()-count)) {
				count++;
			}
			else{
				if(actual == pattern.charAt(pattern.length()-1-i)) {
					count=1;
				} else{
					count = 0;
				} 
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		FiniteAutomataStringMatchingAlgorithm finiteAutomataStringMatchingAlgorithm = new FiniteAutomataStringMatchingAlgorithm();
		System.out.println(finiteAutomataStringMatchingAlgorithm.matchingAlgorithm("abc", "@%#abbababdfwhhaabctever"));
	}
}

