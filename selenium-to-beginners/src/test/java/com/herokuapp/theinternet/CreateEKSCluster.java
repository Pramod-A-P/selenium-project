package com.herokuapp.theinternet;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CreateEKSCluster {
	
	// Test Case 1: Creating EKS Cluster keeping Cluster Name text field empty
	
	@Test(priority = 1)
	public void testingforEmptyEnvironmentNameTextFeild() {

		System.out.println("Starting Cluster Test");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// Login to Optic.ai Page
		String url = "https://dashboard-stg.optiq.ai/login";
		driver.get(url);
		System.out.println("Page is Opened");
		System.out.println("Test Case 1: Creating EKS Cluster keeping Cluster Name text field empty");
		sleep(3000);

		// Login with valid credentials
		WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
		enterUsername.sendKeys("mkg243001@gmail.com");
		sleep(2000);
		// Enter Password
		WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
		enterPassword.sendKeys("manoj@123");

		sleep(2000);

		// Click on Login Button
		WebElement clickLoginButton = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		clickLoginButton.click();

		sleep(3000);

		// Click on the Cluster Tab
		WebElement clickOnClusterPage = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
		clickOnClusterPage.click();

		sleep(2000);

		// Click on the Create Cluster Button
		WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
		clickOnCreateClusterButton.click();

		sleep(4000);

		// Enter Name of the Cluster
		WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
		enterClustername.sendKeys("");
		sleep(1000);
		
		
		// Click on Environment Dropdown
		WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
		clickOnEnvironmentDropdown.click();
		sleep(1000);

		// Select Type of Environment
		WebElement selectEnvironmentType = driver
				.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
		selectEnvironmentType.click();
		sleep(1000);

		// Select Deployment Agent as EKS
		WebElement selectDeploymentAgentAsEKS = driver.findElement(
				By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
		selectDeploymentAgentAsEKS.click();
		sleep(3000);
		


		
	//----------------------------------------------------------------------------------------------------------------------------------	
		// Adding Node Groups
		// Enter Minimum, Maximum and Desired Instances
		WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
		minimumInstance2.sendKeys("1");

		WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
		maxInstance2.sendKeys("10");

		WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
		desiredInstance2.sendKeys("8");

		WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
		diskCapacity2.sendKeys("25");

		// Click on Instance Type dropdown
		WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
		clickOnInstanceType2.click();
		sleep(1000);

		// Select the Instance Type

		WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
		selectInstanceType2.click();
		sleep(2000);
		
// ---------------------------------------------------------------------------------------------------------------------------
		// scroll till the End of the page
		WebElement element2 = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
		sleep(1000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(false)", element2);
		sleep(2000);

//----------------------------------------------------------------------------------------------------------------------------
		// Selecting Add on Agents

		// Selecting Monitoring Agent as Cloud Watch
		WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
				By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
		selectMonitoringAgenttoCloudWatch.click();
		sleep(2000);

		// Selecting Logging Agent as Cloudwatch
		WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
				By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
		selectLoggingAgenttoCloudWatch.click();
		sleep(2000);

		// Selecting Add on Agents
		WebElement selectAntivirusFIMAgents = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		selectAntivirusFIMAgents.click();
		sleep(2000);

		WebElement selectAmazonEbsCsiDriver = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		selectAmazonEbsCsiDriver.click();
		sleep(2000);

		WebElement selectAmazonVpcCni = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		selectAmazonVpcCni.click();
		sleep(2000);
		// ----------------------------------------------------------------------------------------------------------------------------
		// Scroll Back to the Top
		WebElement scrolltoClusterName = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
		sleep(1000);
		
		je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
		
		
		//Click on Create Button
		WebElement clickOnCreateButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		clickOnCreateButton.click();
	//------------------------------------------------------------------------------------------------------------------------------------------	
		
		sleep(2000);
		
		// Validation

		WebElement errorMessage = driver
				.findElement(By.className("MuiFormHelperText-root"));
		String expectedErrorMessage = "Invalid cluster name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
		"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
		+ expectedErrorMessage);
	
		
//-----------------------------------------------------------------------------------------------------------------------------------------
		driver.close();
		
	}

	// Test Case 2: Creating EKS Cluster keeping Min Instance  text field empty
	
	@Test(priority = 2)
	public void MinInstanceTextFieldEmpty() {

		System.out.println("Starting Cluster Test");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// Login to Optic.ai Page
		String url = "https://dashboard-stg.optiq.ai/login";
		driver.get(url);
		System.out.println("Page is Opened");
		System.out.println("Test Case 2: Creating EKS Cluster keeping Min Instance  text field empty");
		sleep(3000);

		// Login with valid credentials
		WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
		enterUsername.sendKeys("mkg243001@gmail.com");
		sleep(2000);
		// Enter Password
		WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
		enterPassword.sendKeys("manoj@123");

		sleep(2000);

		// Click on Login Button
		WebElement clickLoginButton = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		clickLoginButton.click();

		sleep(3000);

		// Click on the Cluster Tab
		WebElement clickOnClusterPage = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
		clickOnClusterPage.click();

		sleep(2000);

		// Click on the Create Cluster Button
		WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
		clickOnCreateClusterButton.click();

		sleep(4000);

		// Enter Name of the Cluster
		WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
		enterClustername.sendKeys("EKS-DEV");
		sleep(1000);
		
		
		// Click on Environment Dropdown
		WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
		clickOnEnvironmentDropdown.click();
		sleep(1000);

		// Select Type of Environment
		WebElement selectEnvironmentType = driver
				.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
		selectEnvironmentType.click();
		sleep(1000);

		// Select Deployment Agent as EKS
		WebElement selectDeploymentAgentAsEKS = driver.findElement(
				By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
		selectDeploymentAgentAsEKS.click();
		sleep(3000);
		


		
	//----------------------------------------------------------------------------------------------------------------------------------	
		// Adding Node Groups
		// Enter Minimum, Maximum and Desired Instances
		WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
		minimumInstance2.sendKeys("");

		WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
		maxInstance2.sendKeys("10");

		WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
		desiredInstance2.sendKeys("8");

		WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
		diskCapacity2.sendKeys("25");

		// Click on Instance Type dropdown
		WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
		clickOnInstanceType2.click();
		sleep(1000);

		// Select the Instance Type

		WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
		selectInstanceType2.click();
		sleep(2000);
		
// ---------------------------------------------------------------------------------------------------------------------------
		// scroll till the End of the page
		WebElement element2 = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
		sleep(1000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(false)", element2);
		sleep(2000);

//----------------------------------------------------------------------------------------------------------------------------
		// Selecting Add on Agents

		// Selecting Monitoring Agent as Cloud Watch
		WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
				By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
		selectMonitoringAgenttoCloudWatch.click();
		sleep(2000);

		// Selecting Logging Agent as Cloudwatch
		WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
				By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
		selectLoggingAgenttoCloudWatch.click();
		sleep(2000);

		// Selecting Add on Agents
		WebElement selectAntivirusFIMAgents = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		selectAntivirusFIMAgents.click();
		sleep(2000);

		WebElement selectAmazonEbsCsiDriver = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		selectAmazonEbsCsiDriver.click();
		sleep(2000);

		WebElement selectAmazonVpcCni = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		selectAmazonVpcCni.click();
		sleep(2000);
		// ----------------------------------------------------------------------------------------------------------------------------
		// Scroll Back to the Top
		WebElement scrolltoClusterName = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
		sleep(1000);
		
		je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
		
		
		//Click on Create Button
		WebElement clickOnCreateButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		clickOnCreateButton.click();
	//------------------------------------------------------------------------------------------------------------------------------------------	
		
		sleep(2000);
		
		// Validation

		WebElement errorMessage = driver
				.findElement(By.className("MuiFormHelperText-root"));
		String expectedErrorMessage = "Minimum limit is 1.";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
		"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
		+ expectedErrorMessage);
	
		sleep(2000);
//-----------------------------------------------------------------------------------------------------------------------------------------
		driver.close();
		
	}

	
	// Test Case 3: Creating EKS Cluster keeping Max Instance  text field empty
	
		@Test(priority = 3)
		public void MaxInstanceTextFieldEmpty() {

			System.out.println("Starting Cluster Test");
			// Create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			// sleep for 3 seconds
			sleep(3000);

			// maximize browser window
			driver.manage().window().maximize();

			// Login to Optic.ai Page
			String url = "https://dashboard-stg.optiq.ai/login";
			driver.get(url);
			System.out.println("Page is Opened");
			System.out.println("Test Case 3: Creating EKS Cluster keeping Max Instance  text field empty");
			sleep(3000);

			// Login with valid credentials
			WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
			enterUsername.sendKeys("mkg243001@gmail.com");
			sleep(2000);
			// Enter Password
			WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
			enterPassword.sendKeys("manoj@123");

			sleep(2000);

			// Click on Login Button
			WebElement clickLoginButton = driver.findElement(By.xpath(
					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
			clickLoginButton.click();

			sleep(3000);

			// Click on the Cluster Tab
			WebElement clickOnClusterPage = driver.findElement(By
					.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
			clickOnClusterPage.click();

			sleep(2000);

			// Click on the Create Cluster Button
			WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
					"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
			clickOnCreateClusterButton.click();

			sleep(4000);

			// Enter Name of the Cluster
			WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
			enterClustername.sendKeys("EKS-DEV");
			sleep(1000);
			
			
			// Click on Environment Dropdown
			WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
					"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
			clickOnEnvironmentDropdown.click();
			sleep(1000);

			// Select Type of Environment
			WebElement selectEnvironmentType = driver
					.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
			selectEnvironmentType.click();
			sleep(1000);

			// Select Deployment Agent as EKS
			WebElement selectDeploymentAgentAsEKS = driver.findElement(
					By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
			selectDeploymentAgentAsEKS.click();
			sleep(3000);
			


			
		//----------------------------------------------------------------------------------------------------------------------------------	
			// Adding Node Groups
			// Enter Minimum, Maximum and Desired Instances
			WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
			minimumInstance2.sendKeys("1");

			WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
			maxInstance2.sendKeys("");

			WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
			desiredInstance2.sendKeys("8");

			WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
			diskCapacity2.sendKeys("25");

			// Click on Instance Type dropdown
			WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
			clickOnInstanceType2.click();
			sleep(1000);

			// Select the Instance Type

			WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
			selectInstanceType2.click();
			sleep(2000);
			
	// ---------------------------------------------------------------------------------------------------------------------------
			// scroll till the End of the page
			WebElement element2 = driver
					.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
			sleep(1000);
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(false)", element2);
			sleep(2000);

	//----------------------------------------------------------------------------------------------------------------------------
			// Selecting Add on Agents

			// Selecting Monitoring Agent as Cloud Watch
			WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
					By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
			selectMonitoringAgenttoCloudWatch.click();
			sleep(2000);

			// Selecting Logging Agent as Cloudwatch
			WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
					By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
			selectLoggingAgenttoCloudWatch.click();
			sleep(2000);

			// Selecting Add on Agents
			WebElement selectAntivirusFIMAgents = driver
					.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
			selectAntivirusFIMAgents.click();
			sleep(2000);

			WebElement selectAmazonEbsCsiDriver = driver
					.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
			selectAmazonEbsCsiDriver.click();
			sleep(2000);

			WebElement selectAmazonVpcCni = driver
					.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
			selectAmazonVpcCni.click();
			sleep(2000);
			// ----------------------------------------------------------------------------------------------------------------------------
			// Scroll Back to the Top
			WebElement scrolltoClusterName = driver
					.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
			sleep(1000);
			
			je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
			
			
			//Click on Create Button
			WebElement clickOnCreateButton = driver.findElement(By.xpath(
					"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
			clickOnCreateButton.click();
		//------------------------------------------------------------------------------------------------------------------------------------------	
			
			sleep(2000);
			
			// Validation

			WebElement errorMessage = driver
					.findElement(By.className("MuiFormHelperText-root"));
			String expectedErrorMessage = "Minimum limit is 1.";
			String actualErrorMessage = errorMessage.getText();

			Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
			"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
			+ expectedErrorMessage);
		
			sleep(2000);
	//-----------------------------------------------------------------------------------------------------------------------------------------
			driver.close();
			
		}
	
	
		// Test Case 4: Creating EKS Cluster keeping Desired Instance  text field empty
		
			@Test(priority = 4)
			public void DesiredInstanceTextFieldEmpty() {

				System.out.println("Starting Cluster Test");
				// Create driver
				System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				// sleep for 3 seconds
				sleep(3000);

				// maximize browser window
				driver.manage().window().maximize();

				// Login to Optic.ai Page
				String url = "https://dashboard-stg.optiq.ai/login";
				driver.get(url);
				System.out.println("Page is Opened");
				System.out.println("Test Case 4: Creating EKS Cluster keeping Desired Instance  text field empty");
				sleep(3000);

				// Login with valid credentials
				WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
				enterUsername.sendKeys("mkg243001@gmail.com");
				sleep(2000);
				// Enter Password
				WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
				enterPassword.sendKeys("manoj@123");

				sleep(2000);

				// Click on Login Button
				WebElement clickLoginButton = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
				clickLoginButton.click();

				sleep(3000);

				// Click on the Cluster Tab
				WebElement clickOnClusterPage = driver.findElement(By
						.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
				clickOnClusterPage.click();

				sleep(2000);

				// Click on the Create Cluster Button
				WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
				clickOnCreateClusterButton.click();

				sleep(4000);

				// Enter Name of the Cluster
				WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
				enterClustername.sendKeys("EKS-DEV");
				sleep(1000);
				
				
				// Click on Environment Dropdown
				WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
						"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
				clickOnEnvironmentDropdown.click();
				sleep(1000);

				// Select Type of Environment
				WebElement selectEnvironmentType = driver
						.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
				selectEnvironmentType.click();
				sleep(1000);

				// Select Deployment Agent as EKS
				WebElement selectDeploymentAgentAsEKS = driver.findElement(
						By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
				selectDeploymentAgentAsEKS.click();
				sleep(3000);
				


				
			//----------------------------------------------------------------------------------------------------------------------------------	
				// Adding Node Groups
				// Enter Minimum, Maximum and Desired Instances
				WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
				minimumInstance2.sendKeys("1");

				WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
				maxInstance2.sendKeys("10");

				WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
				desiredInstance2.sendKeys("");

				WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
				diskCapacity2.sendKeys("25");

				// Click on Instance Type dropdown
				WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
				clickOnInstanceType2.click();
				sleep(1000);

				// Select the Instance Type

				WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
				selectInstanceType2.click();
				sleep(2000);
				
		// ---------------------------------------------------------------------------------------------------------------------------
				// scroll till the End of the page
				WebElement element2 = driver
						.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
				sleep(1000);
				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(false)", element2);
				sleep(2000);

		//----------------------------------------------------------------------------------------------------------------------------
				// Selecting Add on Agents

				// Selecting Monitoring Agent as Cloud Watch
				WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
						By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
				selectMonitoringAgenttoCloudWatch.click();
				sleep(2000);

				// Selecting Logging Agent as Cloudwatch
				WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
						By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
				selectLoggingAgenttoCloudWatch.click();
				sleep(2000);

				// Selecting Add on Agents
				WebElement selectAntivirusFIMAgents = driver
						.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
				selectAntivirusFIMAgents.click();
				sleep(2000);

				WebElement selectAmazonEbsCsiDriver = driver
						.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
				selectAmazonEbsCsiDriver.click();
				sleep(2000);

				WebElement selectAmazonVpcCni = driver
						.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
				selectAmazonVpcCni.click();
				sleep(2000);
				// ----------------------------------------------------------------------------------------------------------------------------
				// Scroll Back to the Top
				WebElement scrolltoClusterName = driver
						.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
				sleep(1000);
				
				je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
				
				
				//Click on Create Button
				WebElement clickOnCreateButton = driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				clickOnCreateButton.click();
			//------------------------------------------------------------------------------------------------------------------------------------------	
				
				sleep(2000);
				
				// Validation

				WebElement errorMessage = driver
						.findElement(By.className("MuiFormHelperText-root"));
				String expectedErrorMessage = "Minimum limit is 1.";
				String actualErrorMessage = errorMessage.getText();

				Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
				+ expectedErrorMessage);
			
				sleep(2000);
		//-----------------------------------------------------------------------------------------------------------------------------------------
				driver.close();
				
			}
	
	
			
			// Test Case 5: Creating EKS Cluster keeping Disk Capacity  text field empty
			
				@Test(priority = 5)
				public void DiskCapacityTextFieldEmpty() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println(" Test Case 5: Creating EKS Cluster keeping Disk Capacity  text field empty");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Add on Agents
					WebElement selectAntivirusFIMAgents = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAntivirusFIMAgents.click();
					sleep(2000);

					WebElement selectAmazonEbsCsiDriver = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonEbsCsiDriver.click();
					sleep(2000);

					WebElement selectAmazonVpcCni = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonVpcCni.click();
					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Validation

					WebElement errorMessage = driver
							.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Minimum limit is 20.";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
					"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
					+ expectedErrorMessage);
				
					sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}
	
	
				
				// Test Case 6: Creating EKS Cluster keeping Instance Type Dropdown  field empty
				
				@Test(priority = 6)
				public void InstanceTypeDropDownEmpty() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println("Test Case 6: Creating EKS Cluster keeping Instance Type Dropdown  field empty");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

//					// Click on Instance Type dropdown
//					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
//					clickOnInstanceType2.click();
//					sleep(1000);
//
//					// Select the Instance Type
//
//					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
//					selectInstanceType2.click();
//					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Add on Agents
					WebElement selectAntivirusFIMAgents = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAntivirusFIMAgents.click();
					sleep(2000);

					WebElement selectAmazonEbsCsiDriver = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonEbsCsiDriver.click();
					sleep(2000);

					WebElement selectAmazonVpcCni = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonVpcCni.click();
					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Validation

					WebElement errorMessage = driver
							.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Must select at least one instance type";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
					"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
					+ expectedErrorMessage);
				
					sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}
	
				
// Test Case 7: Creating EKS Cluster keeping Environment Dropdown  field empty
				
				@Test(priority = 7)
				public void EnvironmentDropDownEmpty() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println(" Test Case 7: Creating EKS Cluster keeping Environment Dropdown  field empty");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV");
					sleep(1000);
					
					
//					// Click on Environment Dropdown
//					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
//							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
//					clickOnEnvironmentDropdown.click();
//					sleep(1000);
//
//					// Select Type of Environment
//					WebElement selectEnvironmentType = driver
//							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
//					selectEnvironmentType.click();
//					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Add on Agents
					WebElement selectAntivirusFIMAgents = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAntivirusFIMAgents.click();
					sleep(2000);

					WebElement selectAmazonEbsCsiDriver = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonEbsCsiDriver.click();
					sleep(2000);

					WebElement selectAmazonVpcCni = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonVpcCni.click();
					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Validation

					WebElement errorMessage = driver
							.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Please select an Environment";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
					"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
					+ expectedErrorMessage);
				
					sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}
				
				
// Test Case 8: Creating EKS Cluster with disk capacity less than 20
				
				@Test(priority = 8)
				public void DiskCapacityLessThanMin() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println("Test Case 8: Creating EKS Cluster with disk capacity less than 20");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("5");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Add on Agents
					WebElement selectAntivirusFIMAgents = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAntivirusFIMAgents.click();
					sleep(2000);

					WebElement selectAmazonEbsCsiDriver = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonEbsCsiDriver.click();
					sleep(2000);

					WebElement selectAmazonVpcCni = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonVpcCni.click();
					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Validation

					WebElement errorMessage = driver
							.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Minimum limit is 20.";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
					"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
					+ expectedErrorMessage);
				
					sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}		
	
// Test Case 9: Creating EKS Cluster with desired Instance more than max instance
				
				@Test(priority = 9)
				public void DesiredInstanceMoreThanMax() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println("Test Case 9: Creating EKS Cluster with desired Instance more than max instance");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("20");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Add on Agents
					WebElement selectAntivirusFIMAgents = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAntivirusFIMAgents.click();
					sleep(2000);

					WebElement selectAmazonEbsCsiDriver = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonEbsCsiDriver.click();
					sleep(2000);

					WebElement selectAmazonVpcCni = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonVpcCni.click();
					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Validation

					WebElement errorMessage = driver
							.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Desired Instance should lie between min. & max. instance";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
					"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
					+ expectedErrorMessage);
				
					sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}			
				
// Test Case 10: Creating EKS Cluster with Valid Name
				
				@Test(priority = 10)
				public void ValidClusterName() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println("Test Case 10: Creating EKS Cluster with Valid Name");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Add on Agents
					WebElement selectAntivirusFIMAgents = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAntivirusFIMAgents.click();
					sleep(2000);

					WebElement selectAmazonEbsCsiDriver = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonEbsCsiDriver.click();
					sleep(2000);

					WebElement selectAmazonVpcCni = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
					selectAmazonVpcCni.click();
					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1800));
					By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[4]/p[text()='Success']");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					sleep(2000);
				
					
					// Validation:1 to check whether cluster is being created or not

					WebElement createdEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[1]/p"));
					String expectedEnvironment = "EKS-DEV";
					String actualEnvironment = createdEnvironment.getText();
					
					
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[4]/p"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					
					


					Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
							"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

				sleep(2000);
				
				
				//Click on  EKS-DEV Cluster
				WebElement clickOnEksDev = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[1]/p"));
				clickOnEksDev.click();
				
				
	//Validation:1, to check whether the elements are displayed on the web page or not i.e Environment,Deployment Agent and others
				
				//Important Validation Type 2
				
				Map<String, String> xpathTextMap = new HashMap<>();
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']", "At-Dev");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Elastic Kubernetes Service (EKS)']", "Elastic Kubernetes Service (EKS)");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Monitoring: ']", "Monitoring:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[1]/p[.='Cloud Watch']", "Cloud Watch");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Logging: ']", "Logging:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[2]/p[.='Cloud Watch']", "Cloud Watch");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Cluster Auto Scaling: ']", "Cluster Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='AWS Auto Scaler']", "AWS Auto Scaler");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Pod Auto Scaling: ']", "Pod Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='HPA']", "HPA");

				for (Map.Entry<String, String> entry : xpathTextMap.entrySet()) {
				    String xpathExpression = entry.getKey();
				    String expectedText = entry.getValue();

				    WebElement element = driver.findElement(By.xpath(xpathExpression));
				    String actualText = element.getText();

				    if (actualText.contains(expectedText)) {
				        System.out.println("Expected Text: " + expectedText + ", is displayed on the web page.");
				        System.out.println("Actual: " + actualText);
				        System.out.println("Expected: " + expectedText);
				    }

				    Assert.assertTrue(actualText.contains(expectedText),
				            "Expected Text: " + expectedText + ", is not displayed on the web page. \nActual: " + actualText + "\nExpected: " + expectedText);
				}	  
			  
				
				
				sleep(2000);
				
//Validation:2, to check whether the Instances are being displayed or not on the Page
				
				//Click on Node Group Drop Down
				WebElement clickOnNodeGroupDropDown= driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[@role='button']/div[@class='MuiAccordionSummary-content MuiAccordionSummary-contentGutters css-17o5nyn']"));
				clickOnNodeGroupDropDown.click();
				
				
				
				//Important Validation Type 2
				
				Map<String, String> xpathTextMap2 = new HashMap<>();
				xpathTextMap2.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[2]//div[@role='region']//input[@value='1']", "1");
				xpathTextMap2.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[2]//div[@role='region']//input[@value='10']", "10");
				xpathTextMap2.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[2]//div[@role='region']//input[@value='5']", "5");
				xpathTextMap2.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[2]//div[@role='region']//input[@value='23']", "23");
		
				for (Map.Entry<String, String> entry : xpathTextMap2.entrySet()) {
				    String xpathExpression = entry.getKey();
				    String expectedInstanceValue = entry.getValue();

				    WebElement element = driver.findElement(By.xpath(xpathExpression));
				    String actualInstanceValue = element.getAttribute("value");

				    if (actualInstanceValue.contains(expectedInstanceValue)) {
				        System.out.println("Expected Instance: " + expectedInstanceValue + " is displayed on the web page.");
				        System.out.println("Actual Instance: " + actualInstanceValue);
				        System.out.println("Expected Instance: " + expectedInstanceValue);
				    }

				    Assert.assertTrue(actualInstanceValue.contains(expectedInstanceValue),
				            "Expected Instance Value: " + expectedInstanceValue + " is not displayed on the web page. \nActual: " + actualInstanceValue + "\nExpected: " + expectedInstanceValue);
				}

				sleep(2000);	
				
			
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}		
				
// Test Case 11: Creating Cluster with disabled Add-on-Agents
				
				@Test(priority = 11)
				public void WithDisabledAddOnAgents() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println(" Test Case 11: Creating Cluster with disabled Add-on-Agents");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV-TWO");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(3000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

//					// Selecting Add on Agents
//					WebElement selectAntivirusFIMAgents = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAntivirusFIMAgents.click();
//					sleep(2000);
//
//					WebElement selectAmazonEbsCsiDriver = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonEbsCsiDriver.click();
//					sleep(2000);
//
//					WebElement selectAmazonVpcCni = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonVpcCni.click();
//					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1800));
					By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[3]/div[4]/p[text()='Success']");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					sleep(2000);
				
					
					// Validation:1 To check whether the Cluster Creation is successfull or Not

					WebElement createdEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[3]/div[1]/p"));
					String expectedEnvironment = "EKS-DEV-TWO";
					String actualEnvironment = createdEnvironment.getText();
					
					
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[3]/div[4]/p"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					
					


					Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
							"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

				sleep(2000);
				
				
//Validation:1, to check whether the elements are displayed on the web page or not i.e Environment and Deployment Agent and Others
				
				//Important Validation Type 2
				
				Map<String, String> xpathTextMap = new HashMap<>();
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']", "At-Dev");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Elastic Kubernetes Service (EKS)']", "Elastic Kubernetes Service (EKS)");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Monitoring: ']", "Monitoring:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[1]/p[.='Cloud Watch']", "Cloud Watch");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Logging: ']", "Logging:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[2]/p[.='Cloud Watch']", "Cloud Watch");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Cluster Auto Scaling: ']", "Cluster Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='AWS Auto Scaler']", "AWS Auto Scaler");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Pod Auto Scaling: ']", "Pod Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='HPA']", "HPA");

				for (Map.Entry<String, String> entry : xpathTextMap.entrySet()) {
				    String xpathExpression = entry.getKey();
				    String expectedText = entry.getValue();

				    WebElement element = driver.findElement(By.xpath(xpathExpression));
				    String actualText = element.getText();

				    if (actualText.contains(expectedText)) {
				        System.out.println("Expected Text: " + expectedText + ", is displayed on the web page.");
				        System.out.println("Actual: " + actualText);
				        System.out.println("Expected: " + expectedText);
				    }

				    Assert.assertTrue(actualText.contains(expectedText),
				            "Expected Text: " + expectedText + ", is not displayed on the web page. \nActual: " + actualText + "\nExpected: " + expectedText);
				}	  
			  
				
				
				sleep(2000);
				
//Validation:2, to check whether the Instances are being displayed or not on the Page
				
				//Click on Node Groups to Verify
				WebElement clickOnNodeGroupDropDown=driver.findElement(By
						.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[@role='button']//p[.='(On-Demand)']"));
				clickOnNodeGroupDropDown.click();
				
				sleep(3000);
				
				//Important Validation Type 2 ,to get text use .getText() and to get value from the Input Field use .getAttribute()
				
				Map<String, String> xpathTextMap2 = new HashMap<>();
				xpathTextMap2.put("/html//input[@id=':ru:']", "1");
				xpathTextMap2.put("/html//input[@id=':rv:']", "10");
				xpathTextMap2.put("/html//input[@id=':r10:']", "5");
				xpathTextMap2.put("/html//input[@id=':r11:']", "23");
		

				for (Map.Entry<String, String> entry : xpathTextMap2.entrySet()) {
				    String xpathExpression = entry.getKey();
				    String expectedInstanceValue = entry.getValue();

				    WebElement element = driver.findElement(By.xpath(xpathExpression));
				    String actualInstanceValue = element.getAttribute("value");

				    if (actualInstanceValue.contains(expectedInstanceValue)) {
				        System.out.println("Expected Instance: " + expectedInstanceValue + " is displayed on the web page.");
				        System.out.println("Actual Instance: " + actualInstanceValue);
				        System.out.println("Expected Instance: " + expectedInstanceValue);
				    }

				    Assert.assertTrue(actualInstanceValue.contains(expectedInstanceValue),
				            "Expected Instance Value: " + expectedInstanceValue + " is not displayed on the web page. \nActual: " + actualInstanceValue + "\nExpected: " + expectedInstanceValue);
				}

				sleep(2000);	
				
				
			//-----------------------------------------------------------------------------------------------------------------------------------------		
				driver.close();
					
				}
				
				
// Test Case 12: Creating Cluster with Invalid Cluster Name
				
				@Test(priority = 12)
				public void WithInvalidClusterName() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println("Test Case 12: Creating Cluster with Invalid Cluster Name");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("8762");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[1]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[1]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

//					// Selecting Add on Agents
//					WebElement selectAntivirusFIMAgents = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAntivirusFIMAgents.click();
//					sleep(2000);
//
//					WebElement selectAmazonEbsCsiDriver = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonEbsCsiDriver.click();
//					sleep(2000);
//
//					WebElement selectAmazonVpcCni = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonVpcCni.click();
//					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1800));
					By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[3]/div[4]/p[text()='Success']");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					sleep(2000);
				
					
					// Validation

					WebElement errorMessage = driver
							.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Invalid cluster name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
					"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
					+ expectedErrorMessage);
					
					sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}	
				
				
// Test Case 13: Creating Cluster with Agents as Prometheus and Loki
				
				@Test(priority = 13)
				public void WithPrometheusAndLoki() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println("Test Case 13: Creating Cluster with Agents as Prometheus and Loki");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(3000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(2000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV-THREE");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
					
			// ---------------------------------------------------------------------------------------------------------------------------
					// scroll till the End of the page
					WebElement element2 = driver
							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
					sleep(1000);
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView(false)", element2);
					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
					// Selecting Add on Agents

					// Selecting Monitoring Agent as Cloud Watch
					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[2]"));
					selectMonitoringAgenttoCloudWatch.click();
					sleep(2000);

					// Selecting Logging Agent as Cloudwatch
					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[2]"));
					selectLoggingAgenttoCloudWatch.click();
					sleep(2000);

//					// Selecting Add on Agents
//					WebElement selectAntivirusFIMAgents = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAntivirusFIMAgents.click();
//					sleep(2000);
//
//					WebElement selectAmazonEbsCsiDriver = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonEbsCsiDriver.click();
//					sleep(2000);
//
//					WebElement selectAmazonVpcCni = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonVpcCni.click();
//					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
					// Scroll Back to the Top
					WebElement scrolltoClusterName = driver
							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
					sleep(1000);
					
					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1800));
					By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[4]/div[4]/p[text()='Success']");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					sleep(2000);
				
					
					// Validation:1 To check whether the Cluster creation is success or not

					WebElement createdEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[4]/div[1]/p"));
					String expectedEnvironment = "EKS-DEV-THREE";
					String actualEnvironment = createdEnvironment.getText();
					
					
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[4]/div[4]/p"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					
					


					Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
							"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

				sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
//Validation:1, to check whether the elements are displayed on the web page or not i.e Environment and Deployment Agent and Others
				
				//Important Validation Type 2
				
				Map<String, String> xpathTextMap = new HashMap<>();
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']", "At-Dev");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Elastic Kubernetes Service (EKS)']", "Elastic Kubernetes Service (EKS)");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Monitoring: ']", "Monitoring:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Prometheus']", "Prometheus");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Logging: ']", "Logging:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Loki']", "Loki");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Cluster Auto Scaling: ']", "Cluster Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='AWS Auto Scaler']", "AWS Auto Scaler");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Pod Auto Scaling: ']", "Pod Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='HPA']", "HPA");

				for (Map.Entry<String, String> entry : xpathTextMap.entrySet()) {
				    String xpathExpression = entry.getKey();
				    String expectedText = entry.getValue();

				    WebElement element = driver.findElement(By.xpath(xpathExpression));
				    String actualText = element.getText();

				    if (actualText.contains(expectedText)) {
				        System.out.println("Expected Text: " + expectedText + ", is displayed on the web page.");
				        System.out.println("Actual: " + actualText);
				        System.out.println("Expected: " + expectedText);
				    }

				    Assert.assertTrue(actualText.contains(expectedText),
				            "Expected Text: " + expectedText + ", is not displayed on the web page. \nActual: " + actualText + "\nExpected: " + expectedText);
				}	  
			  
				
				
				sleep(2000);
				
//Validation:2, to check whether the Instances are being displayed or not on the Page
				
				//Click on Node Groups to Verify
				WebElement clickOnNodeGroupDropDown=driver.findElement(By
						.xpath("/html//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[4]/div[2]"));
				clickOnNodeGroupDropDown.click();
				
				sleep(3000);
				
				//Important Validation Type 2 ,to get text use .getText() and to get value from the Input Field use .getAttribute()
				
				Map<String, String> xpathTextMap2 = new HashMap<>();
				xpathTextMap2.put("/html//input[@id=':rj:']", "1");
				xpathTextMap2.put("/html//input[@id=':rk:']", "10");
				xpathTextMap2.put("/html//input[@id=':rl:']", "5");
				xpathTextMap2.put("/html//input[@id=':rm:']", "23");
		

				for (Map.Entry<String, String> entry : xpathTextMap2.entrySet()) {
				    String xpathExpression = entry.getKey();
				    String expectedInstanceValue = entry.getValue();

				    WebElement element = driver.findElement(By.xpath(xpathExpression));
				    String actualInstanceValue = element.getAttribute("value");

				    if (actualInstanceValue.contains(expectedInstanceValue)) {
				        System.out.println("Expected Instance: " + expectedInstanceValue + " is displayed on the web page.");
				        System.out.println("Actual Instance: " + actualInstanceValue);
				        System.out.println("Expected Instance: " + expectedInstanceValue);
				    }

				    Assert.assertTrue(actualInstanceValue.contains(expectedInstanceValue),
				            "Expected Instance Value: " + expectedInstanceValue + " is not displayed on the web page. \nActual: " + actualInstanceValue + "\nExpected: " + expectedInstanceValue);
				}

				sleep(2000);	
			
				driver.close();
					
				}
				
// Test Case 14: Creating Cluster with Spot Instance
				
				@Test(priority = 14)
				public void WithSpotInstance() {

					System.out.println("Starting Cluster Test");
					// Create driver
					System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
					WebDriver driver = new ChromeDriver();

					// sleep for 3 seconds
					sleep(3000);

					// maximize browser window
					driver.manage().window().maximize();

					// Login to Optic.ai Page
					String url = "https://dashboard-stg.optiq.ai/login";
					driver.get(url);
					System.out.println("Page is Opened");
					System.out.println("Test Case 14: Creating Cluster with Spot Instance");
					sleep(3000);

					// Login with valid credentials
					WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
					enterUsername.sendKeys("mkg243001@gmail.com");
					sleep(2000);
					// Enter Password
					WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
					enterPassword.sendKeys("manoj@123");

					sleep(2000);

					// Click on Login Button
					WebElement clickLoginButton = driver.findElement(By.xpath(
							"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
					clickLoginButton.click();

					sleep(4000);

					// Click on the Cluster Tab
					WebElement clickOnClusterPage = driver.findElement(By
							.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
					clickOnClusterPage.click();

					sleep(3000);

					// Click on the Create Cluster Button
					WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div/div[1]/button[@type='button']"));
					clickOnCreateClusterButton.click();

					sleep(4000);

					// Enter Name of the Cluster
					WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
					enterClustername.sendKeys("EKS-DEV-FOUR");
					sleep(1000);
					
					
					// Click on Environment Dropdown
					WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
					clickOnEnvironmentDropdown.click();
					sleep(1000);

					// Select Type of Environment
					WebElement selectEnvironmentType = driver
							.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
					selectEnvironmentType.click();
					sleep(1000);

					// Select Deployment Agent as EKS
					WebElement selectDeploymentAgentAsEKS = driver.findElement(
							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[2]"));
					selectDeploymentAgentAsEKS.click();
					sleep(3000);
					


					
				//----------------------------------------------------------------------------------------------------------------------------------	
					// Adding Node Groups
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance2 = driver.findElement(By.id(":ro:"));
					minimumInstance2.sendKeys("1");

					WebElement maxInstance2 = driver.findElement(By.id(":rp:"));
					maxInstance2.sendKeys("10");

					WebElement desiredInstance2 = driver.findElement(By.id(":rq:"));
					desiredInstance2.sendKeys("5");

					WebElement diskCapacity2 = driver.findElement(By.id(":rr:"));
					diskCapacity2.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType2 = driver.findElement(By.id(":rs:"));
					clickOnInstanceType2.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType2 = driver.findElement(By.xpath("//ul[@id=':rs:-listbox']//p[.='c5d.large']"));
					selectInstanceType2.click();
					sleep(2000);
			//----------------------------------------------------------------------------------------------------------------------------------
					
					//Add Spot Instance
					WebElement selectSpotInstance = driver.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/button[@type='button']"));
					selectSpotInstance.click();
					sleep(2000);
					
					
					// Enter Minimum, Maximum and Desired Instances
					WebElement minimumInstance = driver.findElement(By.id(":ru:"));
					minimumInstance.sendKeys("1");

					WebElement maxInstance = driver.findElement(By.id(":rv:"));
					maxInstance.sendKeys("10");

					WebElement desiredInstance = driver.findElement(By.id(":r10:"));
					desiredInstance.sendKeys("5");

					WebElement diskCapacity = driver.findElement(By.id(":r11:"));
					diskCapacity.sendKeys("23");

					// Click on Instance Type dropdown
					WebElement clickOnInstanceType = driver.findElement(By.id(":r12:"));
					clickOnInstanceType.click();
					sleep(1000);

					// Select the Instance Type

					WebElement selectInstanceType = driver.findElement(By.xpath("//ul[@id=':r12:-listbox']//p[.='c5d.large']"));
					selectInstanceType.click();
					sleep(2000);
					
					
			// -----------------------------------------------------------------------------------------------------------------------------------
//					// scroll till the End of the page
//					WebElement element2 = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
//					sleep(1000);
//					JavascriptExecutor je = (JavascriptExecutor) driver;
//					je.executeScript("arguments[0].scrollIntoView(false)", element2);
//					sleep(2000);

			//----------------------------------------------------------------------------------------------------------------------------
//					// Selecting Add on Agents
//
//					// Selecting Monitoring Agent as Cloud Watch
//					WebElement selectMonitoringAgenttoCloudWatch = driver.findElement(
//							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div/button[2]"));
//					selectMonitoringAgenttoCloudWatch.click();
//					sleep(2000);
//
//					// Selecting Logging Agent as Cloudwatch
//					WebElement selectLoggingAgenttoCloudWatch = driver.findElement(
//							By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div/button[2]"));
//					selectLoggingAgenttoCloudWatch.click();
//					sleep(2000);

//					// Selecting Add on Agents
//					WebElement selectAntivirusFIMAgents = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[1]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAntivirusFIMAgents.click();
//					sleep(2000);
//
//					WebElement selectAmazonEbsCsiDriver = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[2]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonEbsCsiDriver.click();
//					sleep(2000);
//
//					WebElement selectAmazonVpcCni = driver
//							.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormGroup-root css-1h7anqn']/label[3]/span[1]/input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//					selectAmazonVpcCni.click();
//					sleep(2000);
					// ----------------------------------------------------------------------------------------------------------------------------
//					// Scroll Back to the Top
//					WebElement scrolltoClusterName = driver
//							.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[1]/p[1]"));
//					sleep(1000);
//					
//					je.executeScript("arguments[0].scrollIntoView(false)", scrolltoClusterName);
					
					
					//Click on Create Button
					WebElement clickOnCreateButton = driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();
				//------------------------------------------------------------------------------------------------------------------------------------------	
					
					sleep(2000);
					
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1800));
					By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[5]/div[4]/p[text()='Success']");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					sleep(2000);
				
					
					// Validation

					WebElement createdEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[5]/div[1]/p"));
					String expectedEnvironment = "EKS-DEV-FOUR";
					String actualEnvironment = createdEnvironment.getText();
					
					
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[5]/div[4]/p"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					
					


					Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
							"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

				sleep(2000);
			//-----------------------------------------------------------------------------------------------------------------------------------------
					driver.close();
					
				}
				
				]
		
	
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
