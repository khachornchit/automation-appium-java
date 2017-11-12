package appium.devices;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class DeviceCalculator {
	public URL Server() throws MalformedURLException {
		return new URL("http://127.0.0.1:5001/wd/hub");	
	}
	
	private String DEVICE_NAME = DeviceName.MobilePhone;
	private String PLATFORM_NAME = "Android";
	private String APP = "D:\\OneDrive\\AndroidDevelopment\\Apk\\calculator-1.apk";
	
	public DesiredCapabilities Capability() {
		File app = new File("/data/app/com.asus.calculator-1.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		cap.setCapability("appPackage", "com.android2.calculator3");
		cap.setCapability("appActivity", "com.xlythe.calculator.material.Calculator");
		return cap;
	}	
}
