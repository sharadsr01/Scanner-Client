package com.stormwind.clientscanner.device.impl;

import com.stormwind.clientscanner.device.DeviceInfo;
import com.stormwind.clientscanner.device.dto.SystemInfo.Status;
import com.stormwind.clientscanner.util.Util;
import com.stormwind.clientscanner.util.dto.Result;

public class WindowsDeviceInfo extends DeviceInfo{
	public void initialize(){
		Result result=Util.runCmd("systeminfo");
		switch (result.getStatus())
		{
		case SUCCESS:
			this.getSystemInfo().setStatus(Status.SUCCESS);
			this.getSystemInfo().setSysInfoItems(Util.convertResultToInfoItem(result.getLines()));
			break;
		case ERROR:
		case TIMEOUT:
		case WMIC_DISABLED:
		case NOT_INITIALIZED:
		default:
			System.out.println("Not Implemented yet !!!");
			break;
		}
	}
	
}
