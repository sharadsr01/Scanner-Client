package com.stormwind.clientscanner.util.dto;

import java.util.List;

public class Result {
	public enum Status{TIMEOUT,SUCCESS,WMIC_DISABLED,NOT_INITIALIZED,ERROR}
	private Status status;
	private List<String> lines;
	
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public List<String> getLines() {
		return lines;
	}
	public void setLines(List<String> lines) {
		this.lines = lines;
	}

}
