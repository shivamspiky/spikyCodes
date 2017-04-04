package com.trie.node;


public class TrieNode {

	public static final int NO_OF_ALPHABETS = 26;
	private boolean isEndOfString;
	private TrieNode[] children;
	public boolean isEndOfString() {
		return isEndOfString;
	}
	public void setEndOfString(boolean isEndOfString) {
		this.isEndOfString = isEndOfString;
	}
	
	
	public TrieNode(){
		isEndOfString = false;
		children = new TrieNode[NO_OF_ALPHABETS];
	}
	
	public static int alphabetToIndex(char ch) {
		return ch - 'a';
	}
	public TrieNode[] getChildren() {
		return children;
	}
	public void setChildren(TrieNode[] children) {
		this.children = children;
	}
}
