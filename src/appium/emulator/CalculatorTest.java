package appium.emulator;
//package plutosolutions.test;
//
//import java.net.MalformedURLException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import plutosolutions.model.AndroidEmulator;
//
//public class CalculatorTest {
//	static AndroidDriver<WebElement> driver;
//	
//	public static void main(String[] args) throws MalformedURLException {
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, AndroidEmulator.DEVICE_NAME);
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, AndroidEmulator.PLATFORM_NAME);
//		cap.setCapability(MobileCapabilityType.APP, AndroidEmulator.APP);
//		driver = new AndroidDriver<WebElement>(AndroidEmulator.Server(), cap);
//		
////		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
//		driver.quit();
//	}
//
//}
