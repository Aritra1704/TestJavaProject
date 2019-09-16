package practice.stack;

import java.util.LinkedList;

public class PracticeStack {

	private static LinkedList<Integer> linkedList;
	public static void main(String[] args) {
		linkedList = new LinkedList<>();

		push(1);
		push(2);
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		
		Stack stack = new Stack(3);
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.isFull());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

	static void push(int value) {
		linkedList.add(value);
	}
	
	static int pop() {
		if(linkedList.isEmpty())
			return -1;
		return linkedList.pollLast();
	}
	
	static boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	static class Stack {
		int[] stackArray;
		int top = -1;
		int capacity;
		
		public Stack(int size) {
			stackArray = new int[size];
			capacity = size;
		}
		
		public void push(int value) {
			if(isFull()) {
				System.out.println("Stack is full");
				return;
			}
			stackArray[++top] = value;
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			return stackArray[top--];
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
				return -1;
			}
			return stackArray[top];
		}
		
		public boolean isEmpty() {
			return top == -1;
		}
		
		public boolean isFull() {
			return top == (capacity - 1);
		}
	}
}
