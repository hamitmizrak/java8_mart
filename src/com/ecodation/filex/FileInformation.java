package com.ecodation.filex;

import java.io.Serializable;
import java.util.Date;

public class FileInformation implements Serializable {
	private static final long serialVersionUID = 5617506655478801362L;

	// object field
	private long fileId;
	private String path;
	private Date date;
	private static Date logDate;

	// parametresiz constructor
	public FileInformation() {
		// TODO Auto-generated constructor stub
	}

	// parametreli constructor
	public FileInformation(long fileId, String path, Date date) {
		this.fileId = fileId;
		this.path = path;
		this.date = date;
	}

	// toString
	@Override
	public String toString() {
		return "FileInformation [fileId=" + fileId + ", path=" + path + ", date=" + date + "]";
	}

	// getter and setter
	public long getFileId() {
		return fileId;
	}

	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {

		this.date = date;
	}

	public static Date getLogDate() {
		return logDate;
	}

	// loglama tarih
	public static void setLogDate() {
		FileInformation.logDate = new Date(System.currentTimeMillis());
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
