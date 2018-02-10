package com.stormwind.clientscanner;
import com.stormwind.clientscanner.device.DeviceInfo;

public class Runner {
	
	DeviceInfo deviceInfo;
	
	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public void execute(){
		deviceInfo.print();
	}
	
}
