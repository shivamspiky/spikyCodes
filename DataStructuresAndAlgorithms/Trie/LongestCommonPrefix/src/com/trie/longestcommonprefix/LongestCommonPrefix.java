package com.trie.longestcommonprefix;

import com.trie.node.TrieNode;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(TrieNode root) {
		if(root == null) {
			return null;
		}
		
		TrieNode temp = root;
		int count =0;
		int commonCount=0;
		StringBuilder builder = new StringBuilder();
		do {
			count=0;
			int index = -1;
			for(int i=0;i<TrieNode.NO_OF_ALPHABETS ;i++) {
				if(temp.getChildren()[i]!=null) {
					count++;
					index=i;
				}
			}
			
			if(count==1) {
				temp = temp.getChildren()[index];
				commonCount++;
				builder.append((char)(index+'a'));
			}
			
		} while(count==1);
		
		return builder.toString();
	}
	
	public void insert(TrieNode root, String str) {
		if(root ==null || str ==null) {
			return;
		}
		
		TrieNode temp =  root;
		int n= str.length();
		for(int i=0;i<n;i++) {
			int childrenIndex = alphabetToIndex(str.charAt(i));
			if(temp.getChildren()[childrenIndex]==null) {
				temp.getChildren()[childrenIndex]= new TrieNode();
			}
			temp = temp.getChildren()[childrenIndex];
		}
		
		temp.setEndOfString(true);
	}
	
	private int alphabetToIndex(char ch) {
		return ch-'a';
	}
	
	public static void main(String[] args) {
		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
		
		TrieNode root = new TrieNode();
		
		longestCommonPrefix.insert(root,"geeksforgeeks");
		longestCommonPrefix.insert(root,"geek");
		longestCommonPrefix.insert(root,"geezer");
		System.out.println(longestCommonPrefix.longestCommonPrefix(root));
	}
}
