package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateEnvironment {

	public void Environment() {
		
		System.out.println("Starting Cluster Test");
  		// Create driver
  		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
  		WebDriver driver = new ChromeDriver();

  		// sleep for 3 seconds
  		sleep(3000);

  		// maximize browser window
  		driver.manage().window().maximize();
  		
  		//Select Create Environment Button
		WebElement  clickCreateEnvironmentButton= driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		clickCreateEnvironmentButton.click();
		
		//Enter the Environment Name
  		WebElement EnvironmentName = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  		EnvironmentName .sendKeys("");
  		
  		//Select Deplyoment Agent
  		WebElement  nonProd= driver.findElement(By.xpath(
				""));
		nonProd.click();
		
		//Select Region
		WebElement  selectRegion= driver.findElement(By.xpath(
				""));
		selectRegion.click();
		
		//Select Region from the Dropdown list
		JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement element= driver.findElement (By.xpath(""));
		je.executeScript("arguments[0].scrollIntoView(true)", element);
		
		WebElement clickTestNG = driver.findElement(By.xpath(
				""));
		clickTestNG.click();
		
		//Select CIDR Rannge
		WebElement enterCIDR = driver.findElement(By.xpath(""));
		enterCIDR .sendKeys("");
		
		//Select Number of Subnets
		WebElement selectNumberOfSubnets=driver.findElement(By.xpath(""));
		selectNumberOfSubnets.click();
		
		//Select Number of Subnets from dropdown
				WebElement dropDownSubnets=driver.findElement(By.xpath(""));
				dropDownSubnets.click();
				
		//Select Netmask
				WebElement selectNetmask=driver.findElement(By.xpath(""));
				selectNetmask.click();
				
  		//Enable Retain VPC Logs
				WebElement clickSwitch=driver.findElement(By.xpath(""));
				clickSwitch.click();
				
			// Select Retention period
				WebElement clickOnRetentionPeriod=driver.findElement(By.xpath(""));
				clickOnRetentionPeriod.click();
				
				//Select Retention period from the dropdown list
				WebElement selectRetentionPeriod=driver.findElement(By.xpath(""));
				selectRetentionPeriod.click();
				
				//Select Enable NAT Gateway Switch
				WebElement enableNatGateway=driver.findElement(By.xpath(""));
				enableNatGateway.click();
				
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
