package com.herokuapp.theinternet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AWSInstances {
	
	
	
		@Test(priority =1 )
		public void EmptyClusterNameTextField() {
			System.out.println("Starting Cluster Test");
			// Create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			// sleep for 3 seconds
			sleep(3000);

			// maximize browser window
			driver.manage().window().maximize();

			// Login to Optic.ai Page
			String url = "https://iqcentre.signin.aws.amazon.com/console\r\n"
					+ "";
			driver.get(url);
			System.out.println("Page is Opened");

			sleep(3000);
			
			//Clear the content from the Account ID
			WebElement includeDirectory = driver.findElement(By.xpath("/html//input[@id='account']"));
			includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

			includeDirectory.sendKeys("iqcentre");
			
			
			//Clear the content from the User Name Text Field and Enter the User Name
			WebElement includeDirectory2 = driver.findElement(By.xpath("/html//input[@id='username']"));
			includeDirectory2.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

			includeDirectory2.sendKeys("pramod@optiq.ai");
			
			
			
			//Clear the content from the Password  Text Field
			WebElement includeDirectory3 = driver.findElement(By.xpath("/html//input[@id='password']"));
			includeDirectory3.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

			includeDirectory3.sendKeys("Ap@8105868080");
			
			
			// Select Sign in Button
			WebElement selectSignIn= driver.findElement(
					By.xpath("/html//a[@id='signin_button']"));
			selectSignIn.click();
			sleep(3000);
			
			// Wait for the Console Home to Be displayed on the page
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(400));
			By successMessageLocator = By.xpath("/html//div[@id='c']/div/div/div[@class='awsui_layout-wrapper_lm6vo_12jn7_98']/div[@class='awsui_layout_lm6vo_12jn7_98']//div[@class='awsui_content-wrapper_zycdx_xatmz_97']/div/div[1]/div//main[@class='main-0-1-12']/ol[@class='list-0-1-11']/li[@class='draggableListItem-0-1-13 draggableListItem-d0-0-1-14']/div/div//div[@role='button']//h2[.='Recently visited']");
			WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
			sleep(2000);
			
//			
//			// Enter EC2 in the search Bar
//			WebElement enterEc2InSearchBar = driver.findElement(By.xpath("/html//input[@id='awsc-concierge-input']"));
//			enterEc2InSearchBar.sendKeys("EC2");
//			sleep(3000);
//			
			// Select Ec2 from the list
			WebElement selectEc2FromTheList = driver
					.findElement(By.className("_nav-dropdown__button_8hy5c_63 _nav-dropdown__button--primary_8hy5c_112"));
			selectEc2FromTheList.click();
			sleep(3000);
			
			
			
			

	
			
			
			
			
			
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
