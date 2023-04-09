
package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PositiveTests {
	@Parameters({ "first-name" })
	@Test
	public void loginTest() {

		System.out.println("Starting LoginTest");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// Open Test Page
		String url = "https://dashboard-stg.optiq.ai/login";
		driver.get(url);
		System.out.println("Page is Opened");

		// sleep for 1 seconds
		sleep(1000);

		// enter username
		WebElement username = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
		username.sendKeys("manoj@ptiq.ai");

		sleep(1000);

		// enter password
		WebElement password = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
		password.sendKeys("manoj@123");

		sleep(1000);
		// click login button

		WebElement logInButton = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		logInButton.click();

		sleep(7000);

		// verifications:
		// new url

		String expectedUrl = "https://dashboard-stg.optiq.ai/environment";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not same as expected");

		// logout button is visible
		/*
		 * WebElement logOutButton =driver.findElement(By.xpath(""));
		 * Assert.assertTrue(logOutButton.isDisplayed(),"Log Out Button is Not Visible"
		 * );
		 */

		// successful login message
		/*
		 * WebElement successMessage =driver.findElement(By.xpath("")); String
		 * expectedMessage="You logged into a secure area!"; String
		 * actualMessage=successMessage.getText();
		 * Assert.assertEquals(actualMessage,expectedMessage,
		 * "Actual message is not same as expected");
		 */
		// ANOTHER METHOD: Assert.assertTrue(condition,message); that is
		// Assert.assertTrue(actualMessage.contains(expectedMessage),"Actual message
		// does not contain the expected message.\n Actual Message: " + actualMessage +
		// "\n Expected Message:" + expectedMessage);

		// Close Browser
		driver.quit();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
