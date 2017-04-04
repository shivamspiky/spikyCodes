package com.trie.prefixmatching;

import com.trie.node.TrieNode;

public class PrefixMatching {
	
	public int prefixLastIndex(TrieNode root , String str) {
		
		if(root == null || str == null) {
			return -1;
		}
		TrieNode temp = root;
		int n = str.length();
		int i=0;
		for(;i<n;i++) {
			if(temp.getChildren()[TrieNode.alphabetToIndex(str.charAt(i))]==null) {
				return i-1;
			}
			temp=temp.getChildren()[TrieNode.alphabetToIndex(str.charAt(i))];
		}
		
		return i-1;
	}
	
	public void insert(TrieNode root, String str) {
		
		if(root == null || str == null) {
			return;
		}
		
		TrieNode temp = root;
		
		int n = str.length();
		for(int i = 0; i<n ; i++) {
			
			if(temp.getChildren()[TrieNode.alphabetToIndex(str.charAt(i))]==null) {
				temp.getChildren()[TrieNode.alphabetToIndex(str.charAt(i))]=new TrieNode();
			}
			temp=temp.getChildren()[TrieNode.alphabetToIndex(str.charAt(i))];
		}
		temp.setEndOfString(true);
	}
	
	public static void main(String[] args) {
		TrieNode root = new TrieNode();
		PrefixMatching prefixMatching = new PrefixMatching();
		
		prefixMatching.insert(root, "shiv");
		prefixMatching.insert(root,"yahooo");
		prefixMatching.insert(root,"geeksforgeeks");
		
		String word = "geeksf";
		int index = prefixMatching.prefixLastIndex(root,word);
		System.out.println(index);
		char[] charArray = new char[index+1];
		
		for(int i=0;i<=index;i++) {
			charArray[i]=word.charAt(i);
		}
		
		System.out.println(String.valueOf(charArray));
		
		
	}
}
