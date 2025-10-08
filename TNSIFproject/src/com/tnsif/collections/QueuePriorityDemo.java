package com.tnsif.collections;
import java.util.PriorityQueue;

public class QueuePriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(25);
		pq.add(10);
		pq.add(30);
		pq.add(5);

		System.out.println("PriorityQueue: " + pq);
		System.out.println("Head element (peek): " + pq.peek());

		pq.remove();
		System.out.println("After remove: " + pq);

		pq.offer(15);
		System.out.println("After offer: " + pq);

	}

}
