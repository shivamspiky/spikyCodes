package com.trie.node;

public class InsertionAndDeletionInTrie {

	public void insert(TrieNode root, String str) {
		
		if(str==null || root == null) {
			return;
		}
		
		TrieNode temp = root;
		int n = str.length();
		for(int i=0;i<n;i++) {
			int index = TrieNode.alphabetToIndex(str.charAt(i));
			
			if(temp.getChildren()[index]==null) {
				temp.getChildren()[index] = new TrieNode();
			}
			temp = temp.getChildren()[index];
		}
		
		temp.setEndOfString(true);
	}
	
	public boolean search (TrieNode root, String str) {
		
		if(root == null || str == null) {
			return false;
		}
		
		int n = str.length();
		TrieNode temp = root;
		for(int i=0;i<n;i++) {
			int index = TrieNode.alphabetToIndex(str.charAt(i));
			if(temp.getChildren()[index]==null) {
				return false;
			}
			temp=temp.getChildren()[index];
		}
		
		if(temp.isEndOfString()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		TrieNode root = new TrieNode();
		InsertionAndDeletionInTrie insertionAndDeletionInTrie = new InsertionAndDeletionInTrie();
		insertionAndDeletionInTrie.insert(root, "als");
		insertionAndDeletionInTrie.insert(root, "all");
		insertionAndDeletionInTrie.insert(root, "three");
		insertionAndDeletionInTrie.insert(root, "there");
		insertionAndDeletionInTrie.insert(root, "their");
		insertionAndDeletionInTrie.insert(root, "");
		
		System.out.println(insertionAndDeletionInTrie.search(root,"there"));
		System.out.println(insertionAndDeletionInTrie.search(root,"all"));
		System.out.println(insertionAndDeletionInTrie.search(root,"theirs"));
		System.out.println(insertionAndDeletionInTrie.search(root,""));
	}
}
