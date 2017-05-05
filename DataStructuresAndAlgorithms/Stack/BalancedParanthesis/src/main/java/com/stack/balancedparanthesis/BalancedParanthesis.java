package com.stack.balancedparanthesis;

import java.util.Stack;

public class BalancedParanthesis {

	public boolean checkBalancedParanthesis(String s) {

		if ( s == null || s.length() == 0 ) {
			return true;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			
			if(matchesOpen(s.charAt(i))) {
				stack.push(s.charAt(i));
			}
			
			else if(matchesClose(s.charAt(i))) {
				if(stack.isEmpty()) {
					return false;
				}
				
				char temp = stack.pop();
				if(!((temp=='(' && s.charAt(i)==')') || (temp=='{' && s.charAt(i)=='}') 
						|| (temp=='[' && s.charAt(i)==']'))) {
					return false;
				}
			}
		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
	
	private boolean matchesOpen(char ch) {
		if(ch=='(' || ch=='{' || ch=='[') {
			return true;
		}
		
		return false;
	}
	
	private boolean matchesClose(char ch) {
		if(ch==')' || ch=='}' || ch==']') {
			return true;
		}
		
		return false;
	}

	public static void main(String args[]) {
		BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
		
		System.out.println(balancedParanthesis.checkBalancedParanthesis("(aa)bb"));
		System.out.println(balancedParanthesis.checkBalancedParanthesis("[aa [ bbb ]"));
		System.out.println(balancedParanthesis.checkBalancedParanthesis("aa } bbb { c"));
		System.out.println(balancedParanthesis.checkBalancedParanthesis("aa [ bb () ]"));
		System.out.println(balancedParanthesis.checkBalancedParanthesis("[aa { ] cc } ]"));
		
		
	}

}
