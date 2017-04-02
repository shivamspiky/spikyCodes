package com.trie.node;

public class TrieNode {

	private static final int NO_OF_ALPHABETS = 26;
	private TrieNode[] children;
	private boolean isEndOfString;
	
	public TrieNode[] getChildren() {
		return children;
	}

	public void setChildren(TrieNode[] children) {
		this.children = children;
	}

	public boolean isEndOfString() {
		return isEndOfString;
	}

	public void setEndOfString(boolean isEndOfString) {
		this.isEndOfString = isEndOfString;
	}

	public static int getNoOfAlphabets() {
		return NO_OF_ALPHABETS;
	}

	public TrieNode(){
		children = new TrieNode[NO_OF_ALPHABETS];
		isEndOfString = false;
	}
	
	public static int alphabetToIndex(char c) {
		return c - 'a';
	}
}
