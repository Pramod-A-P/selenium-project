package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCluster {
      public void EKSClusterTest() {
    	  
    	  System.out.println("Starting Cluster Test");
  		// Create driver
  		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
  		WebDriver driver = new ChromeDriver();

  		// sleep for 3 seconds
  		sleep(3000);

  		// maximize browser window
  		driver.manage().window().maximize();
  		
  	// enter Cluster  Name
  			WebElement username = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  			username.sendKeys("");
  			
  	//Select Environment 
  			WebElement clickOnEnvironment = driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			clickOnEnvironment.click();
  			
  		//Selecting Deployment Agent
  			WebElement selectingEKSDeploymentAgent = driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			selectingEKSDeploymentAgent.click();
  			
  		//Selecting the Node Groups
  			
  		//Enter Minimum Instance
  			WebElement minInstance = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  			minInstance.sendKeys("");
  			
  		//Enter Maximum Instance
  			WebElement maxInstance = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  			maxInstance.sendKeys("");
  			
  		//Enter Maximum Instance
  			WebElement desiredInstance = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  			desiredInstance.sendKeys("");
  			
  		//Enter Desired Instance
  			WebElement diskCapacity = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
  			diskCapacity.sendKeys("");
  			
  		//Select Instance Type
  			WebElement  clickOnInstanceDropDown= driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			clickOnInstanceDropDown.click();
  			
  			//Selecting Instance type from the drop down
  			JavascriptExecutor je=(JavascriptExecutor)driver;
  			WebElement element= driver.findElement (By.xpath("//body/ul[4]//a[@href='https://github.com/cbeust/testng/']"));
  			je.executeScript("arguments[0].scrollIntoView(true)", element);
  			
  			WebElement clickTestNG = driver.findElement(By.xpath(
  					"//body/ul[4]//a[@href='https://github.com/cbeust/testng/']"));
  			clickTestNG.click();
  			
  			//Selecting Monitoring Agent
  			WebElement  selectMontitoringAgent= driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			selectMontitoringAgent.click();
  			
  			//Selecting Logging Agent
  			WebElement  selectLoggingAgent= driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			selectLoggingAgent.click();
  			
  		//Selecting Add-on Agents
  			WebElement  antiVirusAndFIM= driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			antiVirusAndFIM.click();
  			
  		//Selecting Amazon EBS CSI Driver
  			WebElement  amazonEbs= driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			amazonEbs.click();
  			
  		//Selecting Amazon VPC CNI
  			WebElement  amazonVpc= driver.findElement(By.xpath(
  					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
  			amazonVpc.click();	
  			
  			
  			
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
