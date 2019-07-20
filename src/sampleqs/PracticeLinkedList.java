package sampleqs;

import java.util.Iterator;
import java.util.LinkedList;

public class PracticeLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkList = new LinkedList<String>();
		
		linkList.add("Aritra");
		linkList.add("Ranjan");
		linkList.add("Pal");
		linkList.add("Jeet");
		linkList.add("Bhuto");
		
		Iterator<String> iterate = linkList.listIterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		LinkedList<String> ll1 = new LinkedList<String>();
		System.out.println("Inital list of elements: " + ll1);
		ll1.add("Aritra");
		ll1.add("Ranjan");
		ll1.add("Pal");
		System.out.println("After adding the above elements: " + ll1);
		
		ll1.add(1, "Jeet");
		System.out.println("After changing element1: " + ll1);
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Aditya");
		ll2.add("Guddu");
		ll1.addAll(ll2);
		System.out.println("After adding elements of 2: " + ll1);
		
		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("Prakash");
		ll3.add("Giri");
		
		ll1.addAll(1, ll3);
		System.out.println("After adding elements of 3: " + ll1);
		
		ll1.addFirst("Try");
		System.out.println("After adding element at first: " + ll1);
		
		ll1.addLast("end");
		System.out.println("After adding element at end: " + ll1);
	}
}
