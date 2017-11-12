package appium.mobilephone;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appium.devices.DeviceCalculator;
import appium.element.ElementCalculator;
import io.appium.java_client.android.AndroidDriver;

public class DeviceCalculatorTest {
	AndroidDriver<WebElement> driver;
	DeviceCalculator device = new DeviceCalculator();

	@BeforeClass
	public void Initialize() throws MalformedURLException {
		driver = new AndroidDriver<WebElement>(device.Server(), device.Capability());
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void StartupTest() {
		Assert.assertNotNull(driver.getContext());
	}

	@Test(priority = 2)
	public void SumFunctionTest() {
		driver.findElement(By.xpath(ElementCalculator.XPathDigit1)).click();
		driver.findElement(By.xpath(ElementCalculator.XPathAdd)).click();
		driver.findElement(By.xpath(ElementCalculator.XPathDigit2)).click();

		String actual = driver.findElement(By.id(ElementCalculator.IdResult)).getText();
		String expected = "3";
		Assert.assertEquals(actual, expected);
	}

	@AfterClass
	public void Cleanup() {
		driver.quit();
	}
}
