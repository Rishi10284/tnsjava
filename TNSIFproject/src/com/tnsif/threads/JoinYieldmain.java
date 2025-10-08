package com.tnsif.threads;

public class JoinYieldmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JoinYield t1 = new JoinYield();
		 JoinYield t2 = new JoinYield();

	        t1.setName("Thread-1");
	        t2.setName("Thread-2");

	        t1.start();
	        t2.start();

	        try {
	            // Main waits for t1 to finish before continuing
	            t1.join();
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }

	        System.out.println("Main thread finished after t1 completes.");

	}

}
