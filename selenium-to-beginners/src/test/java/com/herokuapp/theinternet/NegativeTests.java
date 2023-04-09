package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NegativeTests {
	@Parameters({ "username","password" })
	@Test
	public void negativeLoginTest(String username, String password) {

		System.out.println("Logging in With  Username and Password Test");
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
		WebElement usernameElement = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
		usernameElement.sendKeys(username);

		sleep(1000);

		// enter password
		WebElement passwordElement = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
		passwordElement .sendKeys(password);

		sleep(1000);
		// click login button

		WebElement logInButton = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		logInButton.click();

		sleep(7000);
		

		// Improper login username message

		WebElement errorMessage = driver.findElement(
				By.xpath("//div[@id='root']//div[@role='alert']/div[@class='MuiAlert-message css-1xsto0d']"));
		String expectedErrorMessage = "Email or Password is invalid!";
		String actualErrorMessage = errorMessage.getText();
		
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),"Actual error message does not contain expected. \nActual: "
		  + actualErrorMessage +
		"\nExpected: " + expectedErrorMessage);

	
		//Close browser
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
