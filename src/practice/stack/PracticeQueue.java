package practice.stack;

import java.util.LinkedList;
import java.util.Queue; 

public class PracticeQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		CustomQueue cQueue = new CustomQueue(3);
		System.out.println(cQueue.isEmpty());
		cQueue.push(10);
		cQueue.push(20);
		cQueue.push(30);

		System.out.println(cQueue.isFull());
		
		System.out.println(cQueue.pop());
		System.out.println(cQueue.pop());
		System.out.println(cQueue.pop());
		System.out.println(cQueue.pop());
	}
	
	static class CustomQueue {
		int[] queueArray;
		int front = -1, end = -1;
		int capacity;
		
		public CustomQueue(int size) {
			queueArray = new int[size];
			capacity = size;
		}
		
		public void push(int value) {
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}
			queueArray[++end] = value;
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return queueArray[++front];
		}
		
		public boolean isEmpty() {
			return front == end;
		}
		
		public boolean isFull() {
			return end == (capacity - 1);
		}
	}

}
