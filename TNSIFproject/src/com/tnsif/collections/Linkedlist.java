package com.tnsif.collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Apple");
		ll.add("Banana");
		ll.add("Cherry");
		System.out.println(ll);

		ll.addFirst("Start");
		ll.addLast("End");
		System.out.println(ll);

		ll.remove("Banana");
		System.out.println(ll);

		System.out.println("First element: " + ll.getFirst());
		System.out.println("Last element: " + ll.getLast());

	}

}
