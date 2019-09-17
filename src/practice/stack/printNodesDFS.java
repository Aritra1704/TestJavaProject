package practice.stack;

import java.util.Scanner;

public class printNodesDFS {

	//https://medium.com/compute-and-beyond/breadth-first-insert-search-algorithm-to-create-groot-the-tree-45700b8c1109
	// https://www.geeksforgeeks.org/level-order-tree-traversal/
	// Testing input given below
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
					System.out.println("DFS preorder");
					printNodesDFSpreorder(head);
					break;
				case 3:
					System.out.println("DFS ineorder");
					printNodesDFSinorder(head);
					break;
				case 4:
					System.out.println("DFS postorder");
					printNodesDFSpostorder(head);
					break;
				case 5:
					System.out.println("BFS");
					printNodesBFS(head);
					break;
				case 6:
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
		if(value < node.getValue()) {
			if(node.left == null)
				node.left = new Node(value);
			else
				findFreeNode(node.left, value);
		} else {
			if(node.right == null)
				node.right = new Node(value);
			else
				findFreeNode(node.right, value);
		}
	}
	
	static void printNodesDFSpreorder(Node node) {
		if(node != null) {
			System.out.println(node.getValue());
			printNodesDFSpreorder(node.left);
			printNodesDFSpreorder(node.right);
		}
	}
	
	static void printNodesDFSinorder(Node node) {
		if(node != null) {
			printNodesDFSinorder(node.left);
			System.out.println(node.getValue());
			printNodesDFSinorder(node.right);
		}
	}
	
	static void printNodesDFSpostorder(Node node) {
		if(node != null) {
			printNodesDFSpostorder(node.left);
			printNodesDFSpostorder(node.right);
			System.out.println(node.getValue());
		}
	}
	
	static void printNodesBFS(Node node) {
		if(node != null) {
//			System.out.println(node.getValue());
			int height = calculateHeight(node);
			System.out.println("Height: " + height);
			for(int i = 1; i <= height; i++) {
				printLevel(node, i);
			}
		}
	}

	static int calculateHeight(Node node) {
		if(node == null)
			return 0;
		else {
			int leftHeight = calculateHeight(node.left);
			int rightHeight = calculateHeight(node.right);
			
			if(leftHeight > rightHeight)
				return (leftHeight + 1);
			return (rightHeight + 1);
		}
	}
	
	private static void printLevel(Node node, int level) {
		if(node == null)
			return;
		if(level == 1)
			System.out.println(node.getValue());
		else if(level > 1) {
			printLevel(node.left, level - 1);
			printLevel(node.right, level - 1);
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

/**
 * Testing Input
 * 1
15
1
19
1
12
1
17
1
8
1
7
1
3
1
1
1
2
1
20
2
 */
