package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateEcsCluster {

	public void CreateCluster() {
	
		System.out.println("Starting Cluster Test");
  		// Create driver
  		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
  		WebDriver driver = new ChromeDriver();

  		// sleep for 3 seconds
  		sleep(3000);

  		// maximize browser window
  		driver.manage().window().maximize();
  		
  		//Enter the Cluster Name
  		WebElement clusterName = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  		clusterName.sendKeys("");
  		
  		
  	//Enter the Environment Name
  		WebElement EnvironmentName = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  		EnvironmentName.sendKeys("");
  		
  		//Select Deployment Agent
  		WebElement  clickOnDeploymentAgent= driver.findElement(By.xpath(
					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  		clickOnDeploymentAgent.click();
			
		
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
