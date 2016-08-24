package com.queue.reverse;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	public void reverse(Queue<Integer> queue) {
		if (queue.isEmpty()) {
			return;
		}
		int temp = queue.remove();
		reverse(queue);
		queue.add(temp);
	}

	public static void main(String args[]) {
		ReverseQueue reverseQueue = new ReverseQueue();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		reverseQueue.reverse(queue);
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}

	}

}
