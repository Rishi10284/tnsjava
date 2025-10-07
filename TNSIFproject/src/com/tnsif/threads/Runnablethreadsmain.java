package com.tnsif.threads;

public class Runnablethreadsmain {
	public static void main(String [] args) {
		Runnablethreads rt = new Runnablethreads();
		Thread t1 = new Thread(rt);
		t1.start();
	}

}
