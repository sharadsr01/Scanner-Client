package com.stormwind.clientscanner.device;

import com.stormwind.clientscanner.device.dto.SystemInfo;

public abstract class DeviceInfo {
	
	private SystemInfo systemInfo;

	public SystemInfo getSystemInfo() {
		return systemInfo;
	}

	public void setSystemInfo(SystemInfo systemInfo) {
		this.systemInfo = systemInfo;
	}
	
	public void print()
	{
		System.out.println("-------------System Info--------------");
		systemInfo.print();
	}
	
}
