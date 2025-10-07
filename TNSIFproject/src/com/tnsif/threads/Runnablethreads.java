package com.tnsif.threads;

public class Runnablethreads implements Runnable{
	public void  run() {
		for(int i = 0; i < 5; i++) {
			try {
			System.out.println("Runnable Interface");
			Thread.sleep(2000);
		    }catch (Exception e) {
			System.out.println(e);
		}
	}

}
}
