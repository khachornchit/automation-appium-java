package appium.mobilephone;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appium.devices.DeviceCustomCalculator;
import io.appium.java_client.android.AndroidDriver;

public class DeviceCustomCalculatorTest {
	AndroidDriver<WebElement> driver;
	DeviceCustomCalculator device = new DeviceCustomCalculator();

	@BeforeClass
	public void Setup() throws MalformedURLException {
		driver = new AndroidDriver<WebElement>(device.Server(), device.Capability());
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void StartupTest() {
		Assert.assertNotNull(driver.getContext());
	}

	@Test(priority = 2)
	public void SumFunctionTest() {
		float numberA = 15;
		float numberB = 16;
		float expected = 31;
		float actual = 0;

		driver.findElement(By.id("editTextA")).sendKeys(Float.toString(numberA));
		driver.findElement(By.id("editTextB")).sendKeys(Float.toString(numberB));
		driver.findElement(By.id("buttonSum")).click();
		actual = Float.parseFloat(driver.findElement(By.id("textViewResult")).getText());

		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 3)
	public void ClearFunctionTest() {
		driver.findElement(By.id("buttonClear")).click();

		String expectedA = "";
		String expectedB = "";
		String expectedResult = "";

		String actualA = driver.findElement(By.id("editTextA")).getText();
		String actualB = driver.findElement(By.id("editTextB")).getText();
		String actualResult = driver.findElement(By.id("textViewResult")).getText();

		Assert.assertEquals(actualA, expectedA);
		Assert.assertEquals(actualB, expectedB);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@AfterClass
	public void Cleanup() {
		driver.quit();
	}
}
