package practice.stack;

import java.util.Scanner;

public class PracticeBinaryTree {

	private static Node head = null;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continueRunning = true;
		while(continueRunning) {
			int option = scan.nextInt();
			switch(option) {
				case 1: 
					int input = scan.nextInt();
					addNode(input);
					break;
				case 2:
//					showAllNodes();
					printNodes(head);
					break;
				case 3:
					continueRunning = false;
				
			}
		}
		

	}
	
	static void addNode(int value) {
		if(head == null)
			head = new Node(15);
		else {
			findFreeNode(head, value);
		}
	}
	
	static void findFreeNode(Node node, int value) {
		if(node.left == null)
			node.left = new Node(value);
		else if(node.right == null)
			node.right = new Node(value);
		else {
			findFreeNode(node.left, value);
			findFreeNode(node.right, value);
		}
	}
	
	static void showAllNodes() {
		if(head != null)
			System.out.println(head.getValue());
		printNodes(head.left);
		printNodes(head.right);
	}
	
	static void printNodes(Node node) {
		if(node != null) {
			System.out.println(node.getValue());
			printNodes(node.left);
			printNodes(node.right);
		}
	}

	static class Node {
		Node left = null;
		Node right = null;
		int value = 0;
		
		public Node(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
		public void setLeft(Node node) {
			this.left = node;
		}
		
		public Node getLeft() {
			return left;
		}
		
		public void setRight(Node node) {
			this.right = node;
		}
		
		public Node getRight() {
			return right;
		}
	}
}
