package com.company;

public class Client {

	public static void main(String[] args) {
		//Collection<Integer> queue = new Queue<>(new ArrayLinkedList<>());
		Collection<Integer> queue = new Queue<>(new SinglyLinkedList<>());
		queue.offer(10);
		queue.offer(40);
		queue.offer(99);

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		System.out.println(queue.poll());

		//Collection<Integer> stack = new Stack<>(new ArrayLinkedList<>());
		Collection<Integer> stack = new Stack<>(new SinglyLinkedList<>());
		stack.offer(10);
		stack.offer(40);
		stack.offer(99);

		System.out.println(stack.poll());
		System.out.println(stack.poll());
		System.out.println(stack.poll());

		System.out.println(stack.poll());
	}

}
