package com.ecodation.multithreadx;

import java.io.Serializable;
import java.util.Date;

public class ThreadAlani implements Serializable {
	private static final long serialVersionUID = -61430531310317209L;

	private long threadId;
	private String threadAdi;
	private Date tarih;

	public ThreadAlani() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void deneme() {

	}

	public synchronized void deneme2() {

	}

	static {

	}

	Object object = new Object();

	public ThreadAlani(long threadId, String threadAdi, Date tarih) {
		this.threadId = threadId;
		this.threadAdi = threadAdi;
		this.tarih = tarih;
	}

	public long getThreadId() {
		return threadId;
	}

	public void setThreadId(long threadId) {
		this.threadId = threadId;
	}

	public String getThreadAdi() {
		return threadAdi;
	}

	public void setThreadAdi(String threadAdi) {
		this.threadAdi = threadAdi;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	@Override
	public String toString() {
		return "ThreadAlani [threadId=" + threadId + ", threadAdi=" + threadAdi + ", tarih=" + tarih + "]";
	}

}
