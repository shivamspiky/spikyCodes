package com.stack.balancedparanthesis;

import java.util.Stack;

public class BalancedParanthesis {

	public boolean checkBalancedParanthesis(String s) {

		if ( s == null || s.length() == 0 ) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				} else {
					return false;
				}
			} else if (s.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(s.charAt(i));
			}
		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
		boolean result = balancedParanthesis.checkBalancedParanthesis(null);
		System.out.println(result);
	}

}
