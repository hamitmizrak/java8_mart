package com.ecodation.multithreadx;

public class MultThreadMainTest {

	public static void main(String[] args) throws InterruptedException {
		MultiThreadDersi dersi = new MultiThreadDersi();
		MultiThreadDersi dersi2 = new MultiThreadDersi();
		MultiThreadDersi dersi3 = new MultiThreadDersi();

		//
		// System.out.println("id:" + dersi.getId());
		// System.out.println(dersi.getClass());
		// System.out.println(dersi.isAlive());
		// // dersi.wait();
		// // dersi.notifyAll();
		// // dersi.join();
		// System.out.println(dersi.getName());
		// dersi.setName("0. thread adı");
		// System.out.println(dersi.getName());
		// System.out.println(dersi2.getName());
		// System.out.println("--------------------------------------------------------");
		//
		// dersi.setPriority(Thread.MAX_PRIORITY);
		// dersi2.setPriority(Thread.MIN_PRIORITY);

		dersi.start();
		dersi2.start();
		dersi3.start();

	}
}
