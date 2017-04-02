package com.trie.delete;

import com.trie.node.TrieNode;

public class DeletionInTrie {
	
	public void delete(TrieNode root, String str) {
		
		if(root==null || str == null) {
			return;
		}
		
		deleteUtil(root,str,0);
	}
	
	private boolean deleteUtil(TrieNode node, String str, int index) {
		
		if(node == null) {
			return true;
		}
		
		if(index == str.length()) {
			for(TrieNode temp : node.getChildren()) {
				if(temp!=null) {
					node.setEndOfString(false);
					return true;
				}
			}
			
			//node = null;
			return false;
		}
		
		boolean flag = deleteUtil(node.getChildren()[TrieNode.alphabetToIndex(str.charAt(index))], str, index+1);
		
		if(flag) {
			return true;
		}
		TrieNode[] children = node.getChildren();
		children[TrieNode.alphabetToIndex(str.charAt(index))] =null;
		node.setChildren(children);
		
		if(node.isEndOfString()) {
			return true;
		}
		
		for(TrieNode temp : node.getChildren()) {
			if(temp!=null) {
				return true;
			}
		}
		
		//node = null;
		return false;
	}
	
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
		DeletionInTrie insertionAndDeletionInTrie = new DeletionInTrie();
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
		System.out.println(insertionAndDeletionInTrie.search(root,"als"));
		System.out.println(insertionAndDeletionInTrie.search(root,"three"));
		System.out.println(insertionAndDeletionInTrie.search(root,"their"));
//		insertionAndDeletionInTrie.delete(root, "als");
//		insertionAndDeletionInTrie.delete(root, "");
		insertionAndDeletionInTrie.delete(root, "theirs");
		System.out.println("Next iteration starts after deletion");
		System.out.println(insertionAndDeletionInTrie.search(root,"there"));
		System.out.println(insertionAndDeletionInTrie.search(root,"all"));
		System.out.println(insertionAndDeletionInTrie.search(root,"theirs"));
		System.out.println(insertionAndDeletionInTrie.search(root,""));
		System.out.println(insertionAndDeletionInTrie.search(root,"als"));
		System.out.println(insertionAndDeletionInTrie.search(root,"three"));
		System.out.println(insertionAndDeletionInTrie.search(root,"their"));
	}

}
