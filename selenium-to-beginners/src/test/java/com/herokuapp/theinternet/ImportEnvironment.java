package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImportEnvironment {

	public void Import() {

		System.out.println("Starting Cluster Test");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// Enter the Environment Name
		WebElement EnvironmentName = driver.findElement(By.xpath("/html//input[@id=':rr:']"));
		EnvironmentName.sendKeys("");

		// Select Deplyoment Agent
		WebElement nonProd = driver.findElement(By.xpath("//div[@role='presentation']/div[3]//div[@role='radiogroup']//span[.='Non-Prod']"));
		nonProd.click();

		// Select Region
		WebElement selectRegion = driver.findElement(By.xpath("/html//input[@id=':rt:']"));
		selectRegion.click();

		// Select Region from the Dropdown list
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(""));
		je.executeScript("arguments[0].scrollIntoView(true)", element);
		
		//Select  the dropdown element
	WebElement dropdown=driver.findElement(By.xpath(""));
		
		//Wait until the dropdown options are visible
		WebDriverWait Wait=new WebDriveWait(driver, 10);
		Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		
		//Create a Select Object and select an item from the dropdown list
		Select select=new Select(dropdown);
		select.selectByVisibleText(" select the options visible from the list");
		
		//Select the Public Subnets element
		WebElement publicSubnets = driver.findElement(By.xpath(""));
		publicSubnets.click();
		
		//Select the Public Subnets from the Dropdown
		WebElement publicSubnetsInList = driver.findElement(By.xpath(""));
		publicSubnetsInList.click();
		
		//Select the Private Subnets element
		WebElement privateSubnets = driver.findElement(By.xpath(""));
		privateSubnets.click();
		
		//Select the Public Subnets from the Dropdown
				WebElement privateSubnetsInList = driver.findElement(By.xpath(""));
				privateSubnetsInList.click();
				
		//Select Import Button
				WebElement ImportEnvironment = driver.findElement(By.xpath(""));
				ImportEnvironment.click();
		
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
