package com.stack.reverse;

import java.util.Stack;

public class ReverseStack {
	public Stack<Integer> reverse(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			return stack;
		}
		int top = stack.pop();
		reverse(stack);
		insertAtBottom(stack, top);

		return stack;
	}

	private void insertAtBottom(Stack<Integer> stack, int item) {
		if (stack.isEmpty()) {
			stack.push(item);
			return ;
		}
		int temp = stack.pop();
		insertAtBottom(stack, item);
		stack.push(temp);
	}

	public static void main(String args[]) {

		Stack<Integer> stack = new Stack<Integer>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);

		ReverseStack reverseStack = new ReverseStack();
		reverseStack.reverse(stack);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
