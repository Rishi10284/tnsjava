package com.tnsif.threads;

public class ThreadbyExtends extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++){
			try {
				System.out.println("Hello");
				Thread.sleep(2000);
			}catch(Exception e) {
				System.out.println("Catch block"+e);
			}
			
        }
	}
}
	


	
