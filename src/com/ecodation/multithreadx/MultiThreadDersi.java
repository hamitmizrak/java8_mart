package com.ecodation.multithreadx;

public class MultiThreadDersi extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			ThreadAlani alani = new ThreadAlani();
			// Thread.sleep(1000);
			System.out.println(i + ". sayı ");

		}
	}

}
