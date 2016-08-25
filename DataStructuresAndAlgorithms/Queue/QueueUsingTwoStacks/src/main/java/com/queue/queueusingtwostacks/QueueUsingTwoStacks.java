package com.queue.queueusingtwostacks;

import java.util.Stack;

public class QueueUsingTwoStacks {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void enQueue(int data) {
		if (stack1.isEmpty()) {
			stack1.push(data);
			return;
		}

		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}

		stack1.push(data);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}

	}

	public int deQueue() {
		return stack1.pop();
	}

	public int peek() {
		return stack1.peek();
	}

	public int size() {
		return stack1.size();
	}

	public boolean isEmpty() {
		return stack1.isEmpty();
	}

	public static void main(String args[]) {

		QueueUsingTwoStacks queueUsingTwoStacks = new QueueUsingTwoStacks();

		queueUsingTwoStacks.enQueue(1);
		queueUsingTwoStacks.enQueue(2);
		queueUsingTwoStacks.enQueue(3);
		queueUsingTwoStacks.enQueue(4);
		queueUsingTwoStacks.enQueue(5);
		queueUsingTwoStacks.enQueue(6);

		while (!queueUsingTwoStacks.isEmpty()) {
			System.out.println(queueUsingTwoStacks.deQueue());
		}

	}
}
