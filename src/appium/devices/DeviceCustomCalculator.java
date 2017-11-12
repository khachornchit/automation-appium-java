package appium.devices;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class DeviceCustomCalculator {
	public URL Server() throws MalformedURLException {
		return new URL("http://127.0.0.1:4753/wd/hub");	
	}
	private String DEVICE_NAME = DeviceName.MobilePhone;
	private String PLATFORM_NAME = "Android";
	private String APP = "D:\\OneDrive\\AndroidDevelopment\\Apk\\app-release.apk";	
	
	public DesiredCapabilities Capability() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		cap.setCapability(MobileCapabilityType.APP, APP);		
		return cap;
	}
}