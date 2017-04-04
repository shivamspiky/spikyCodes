package com.trie.node;

public class TrieNode {

	public static final int NO_OF_ALPHABETS = 26;
	
	private TrieNode[] children;
	private boolean isEndOfString;
	
	public TrieNode(){
		children=new TrieNode[NO_OF_ALPHABETS];
		isEndOfString = false;
	}

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
	
}
