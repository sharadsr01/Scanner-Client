package com.stormwind.clientscanner.ClientScanner.device;

/**
 * 
 * @author Sharad
 *
 */
public class Device {
	private String ip;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public void print(){
		System.out.println("Hello World");
	}
}
