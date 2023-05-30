package com.herokuapp.theinternet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuildEnvironmentSetup {


	
	
	//Test Case 1: Creating Environment with valid Name
		@Test(priority=1)
		public void EnvironmentCreatingDev() {
			
			System.out.println("Testing Create Environment");
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

			sleep(3000);

			// Login with valid credentials
			WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
			enterUsername.sendKeys("mkg243001@gmail.com");

			// Enter Password
			WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
			enterPassword.sendKeys("manoj@123");

			sleep(2000);

			// Click on Login Button
			WebElement clickLoginButton = driver.findElement(By.xpath(
					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
			clickLoginButton.click();

			sleep(2000);
			
			System.out.println("Creating Environment with valid Name");
			
			//Click on CI-CD Button
			WebElement clickOnCiCd= driver.findElement(By.xpath(
					"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
			clickOnCiCd.click();
			sleep(2000);

			// Click on the Environment Tab
			WebElement clickOnEnvironmentTab = driver.findElement(By
					.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
			clickOnEnvironmentTab.click();

			sleep(2000);
			
			
			// Click on the  Create Environment 
					WebElement clickOnCreateEnvironmentButton = driver.findElement(By
							.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[2]"));
					clickOnCreateEnvironmentButton.click();

					sleep(2000);

					
			//Enter Valid Environment Name
					WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
					enterEnvironmentName.sendKeys("At-Dev");
					
			//Select Type as Non Production
					WebElement selectTypeAsNonProd = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[1]"));
					selectTypeAsNonProd.click();

					sleep(2000);
					
					
			//Select Region 		
					WebElement selectRegion = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
					selectRegion.click();

					sleep(2000);
					
					//Select Region from the dropdown		
					WebElement selectRegionFromDropdown = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[8]"));
					selectRegionFromDropdown .click();

					sleep(2000);	

					//Clear the  CIDR Range text field  content 
					WebElement includeDirectory = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//input[@value='192.168.0.0/18']"));
					includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

					includeDirectory.sendKeys("192.168.0.0/18");
					
					sleep(2000);
				
			//Select No of Subnets Text Field
					WebElement selectSubnetTextfield = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
					selectSubnetTextfield.click();

					sleep(2000);
					
					//Select No of Subnets as 2  from the Text Field
					WebElement selectSubnetValue= driver.findElement(By
							.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
					selectSubnetValue.click();

					sleep(2000);
			
			//Select Net Mask textField
					WebElement selectNetmaskTextfield= driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[2]/div/div[@role='button']"));
					selectNetmaskTextfield.click();

					sleep(2000);
					
					//Select No of Subnets as 1  from the Text Field
					WebElement selectNetmaskValue= driver.findElement(By
							.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
					selectNetmaskValue.click();

					sleep(2000);
					
					
					
			//Disable  Retain VPC Logs
					WebElement clickOnVpcLogs= driver.findElement(By
							.xpath("//p[contains(text(),'Retain VPC logs')]//parent::div//span//span//input[@type='checkbox']"));
					clickOnVpcLogs.click();

					sleep(2000);
					
			//Disable NAT Gateway
					WebElement clickOnNATGateway= driver.findElement(By
							.xpath("//p[contains(text(),'Enable NAT Gateway')]//parent::div//span//span//input[@type='checkbox']"));
					clickOnNATGateway.click();	
					sleep(2000);
					
			//Select Create Button		
					WebElement clickOnCreateEnvironment= driver.findElement(By
							.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateEnvironment.click();  
					sleep(2000);
					
					
					
					//Select Continue Button		
					WebElement clickOnContinueButton= driver.findElement(By
							.xpath("//body/div[3]/div[@role='presentation']/div[@role='dialog']/div[2]/button[2]"));
					clickOnContinueButton.click();  
					
					sleep(2000);
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
					By successMessageLocator = By.xpath("//p[contains(text(),'At-Dev')]//parent::div[@tabindex='0']//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					
					sleep(2000);
					// Validation:1 for Cluster Creation,, Whether it is Successfully Created or Not

					WebElement createdEnvironment = driver
							.findElement(By.xpath("//p[contains(text(),'At-Dev')]//parent::div[@tabindex='0']"));
					String expectedEnvironment = "At-Dev";
					String actualEnvironment = createdEnvironment.getText();
					
					
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//p[contains(text(),'At-Dev')]//parent::div[@tabindex='0']//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					

					Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
							"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

				
					System.out.println("Environment is successfully created");

					
							sleep(2000);
							
							

							
							
					
					driver.close();	
		}
	

//==============================================================================================================================================		
		//Test Case 2: Creating Environment with valid Name for Staging
		@Test(priority=2)
		public void EnvironmentCreatingforStaging() {
			
			System.out.println("Testing Create Environment");
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

			sleep(3000);

			// Login with valid credentials
			WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
			enterUsername.sendKeys("mkg243001@gmail.com");

			// Enter Password
			WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
			enterPassword.sendKeys("manoj@123");

			sleep(2000);

			// Click on Login Button
			WebElement clickLoginButton = driver.findElement(By.xpath(
					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
			clickLoginButton.click();

			sleep(2000);
			
			System.out.println("Creating Environment with valid Name");

			// Click on the Environment Tab
			WebElement clickOnEnvironmentTab = driver.findElement(By
					.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
			clickOnEnvironmentTab.click();

			sleep(2000);
			
			
			// Click on the  Create Environment 
					WebElement clickOnCreateEnvironmentButton = driver.findElement(By
							.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[2]"));
					clickOnCreateEnvironmentButton.click();

					sleep(2000);

					
			//Enter Valid Environment Name
					WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
					enterEnvironmentName.sendKeys("At-Staging");
					
			//Select Type as Non Production
					WebElement selectTypeAsNonProd = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[1]"));
					selectTypeAsNonProd.click();

					sleep(2000);
					
					
			//Select Region 		
					WebElement selectRegion = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
					selectRegion.click();

					sleep(2000);
					
					//Select Region from the dropdown		
					WebElement selectRegionFromDropdown = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[10]"));
					selectRegionFromDropdown .click();

					sleep(2000);	

					//Clear the  CIDR Range text field  content 
					WebElement includeDirectory = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//input[@value='192.168.0.0/18']"));
					includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

					includeDirectory.sendKeys("192.168.0.0/18");
					
					sleep(2000);
				
			//Select No of Subnets Text Field
					WebElement selectSubnetTextfield = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
					selectSubnetTextfield.click();

					sleep(2000);
					
					//Select No of Subnets as 1  from the Text Field
					WebElement selectSubnetValue= driver.findElement(By
							.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
					selectSubnetValue.click();

					sleep(2000);
			
			//Select Net Mask textField
					WebElement selectNetmaskTextfield= driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[2]/div/div[@role='button']"));
					selectNetmaskTextfield.click();

					sleep(2000);
					
					//Select No of Subnets as 1  from the Text Field
					WebElement selectNetmaskValue= driver.findElement(By
							.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
					selectNetmaskValue.click();

					sleep(2000);
					
					
					
			//Disable  Retain VPC Logs
					WebElement clickOnVpcLogs= driver.findElement(By
							.xpath("//p[contains(text(),'Retain VPC logs')]//parent::div//span//span//input[@type='checkbox']"));
					clickOnVpcLogs.click();

					sleep(2000);
					
			//Disable NAT Gateway
					WebElement clickOnNATGateway= driver.findElement(By
							.xpath("//p[contains(text(),'Enable NAT Gateway')]//parent::div//span//span//input[@type='checkbox']"));
					clickOnNATGateway.click();	
					sleep(2000);
			//Select Create Button		
					WebElement clickOnCreateEnvironment= driver.findElement(By
							.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateEnvironment.click();	
					sleep(2000);
					
					
					//Select Continue Button		
					WebElement clickOnContinueButton= driver.findElement(By
							.xpath("//body/div[3]/div[@role='presentation']/div[@role='dialog']/div[2]/button[2]"));
					clickOnContinueButton.click();  
					sleep(2000);
					
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
					By successMessageLocator = By.xpath("//p[contains(text(),'At-Staging')]//parent::div[@tabindex='0']//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					sleep(2000);
					
					// Validation

					WebElement createdEnvironment = driver
							.findElement(By.xpath("//p[contains(text(),'At-Dev')]//parent::div[@tabindex='0']"));
					String expectedEnvironment = "At-Staging";
					String actualEnvironment = createdEnvironment.getText();
					
					
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//p[contains(text(),'At-Staging')]//parent::div[@tabindex='0']//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					
					


					Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
							"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

				
					System.out.println("Environment is successfully created");
			
			
							sleep(2000);
					
					driver.close();	
		}
	
//===================================================================================================================================	
		//Test Case 3: Creating Environment with valid Name for Prod
		@Test(priority=3)
		public void EnvironmentCreatingWithValidName() {
			
			System.out.println("Testing Create Environment");
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

			sleep(3000);

			// Login with valid credentials
			WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
			enterUsername.sendKeys("mkg243001@gmail.com");

			// Enter Password
			WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
			enterPassword.sendKeys("manoj@123");

			sleep(2000);

			// Click on Login Button
			WebElement clickLoginButton = driver.findElement(By.xpath(
					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
			clickLoginButton.click();

			sleep(2000);
			
			System.out.println("Creating Environment with valid Name");

			// Click on the Environment Tab
			WebElement clickOnEnvironmentTab = driver.findElement(By
					.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
			clickOnEnvironmentTab.click();

			sleep(2000);
			
			
			// Click on the  Create Environment 
					WebElement clickOnCreateEnvironmentButton = driver.findElement(By
							.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[2]"));
					clickOnCreateEnvironmentButton.click();

					sleep(2000);

					
			//Enter Valid Environment Name
					WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
					enterEnvironmentName.sendKeys("AT-Prod");
					
			//Select Type as Production
					WebElement selectTypeAsNonProd = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[2]"));
					selectTypeAsNonProd.click();

					sleep(2000);
					
					
			//Select Region 		
					WebElement selectRegion = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
					selectRegion.click();

					sleep(2000);
					
					//Select Region from the dropdown		
					WebElement selectRegionFromDropdown = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[10]"));
					selectRegionFromDropdown .click();

					sleep(2000);	

					//Clear the  CIDR Range text field  content 
					WebElement includeDirectory = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//input[@value='192.168.0.0/18']"));
					includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

					includeDirectory.sendKeys("192.168.0.0/18");
					
					sleep(2000);
				
			//Select No of Subnets Text Field
					WebElement selectSubnetTextfield = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
					selectSubnetTextfield.click();

					sleep(2000);
					
					//Select No of Subnets as 1  from the Text Field
					WebElement selectSubnetValue= driver.findElement(By
							.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
					selectSubnetValue.click();

					sleep(2000);
			
			//Select Net Mask textField
					WebElement selectNetmaskTextfield= driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[2]/div/div[@role='button']"));
					selectNetmaskTextfield.click();

					sleep(2000);
					
					//Select No of Subnets as 2  from the Text Field
					WebElement selectNetmaskValue= driver.findElement(By
							.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
					selectNetmaskValue.click();

					sleep(2000);
					
					
					
			//Disable  Retain VPC Logs
					WebElement clickOnVpcLogs= driver.findElement(By
							.xpath("//p[contains(text(),'Retain VPC logs')]//parent::div//span//span//input[@type='checkbox']"));
					clickOnVpcLogs.click();

					sleep(2000);
					
			//Disable NAT Gateway
					WebElement clickOnNATGateway= driver.findElement(By
							.xpath("//p[contains(text(),'Enable NAT Gateway')]//parent::div//span//span//input[@type='checkbox']"));
					clickOnNATGateway.click();	
					sleep(2000);
					
			//Select Create Button		
					WebElement clickOnCreateEnvironment= driver.findElement(By
							.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateEnvironment.click();	
					sleep(2000);
					
					//Select Continue Button		
					WebElement clickOnContinueButton= driver.findElement(By
							.xpath("//body/div[3]/div[@role='presentation']/div[@role='dialog']/div[2]/button[2]"));
					clickOnContinueButton.click();  
					sleep(2000);
					
					
					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
					By successMessageLocator = By.xpath("//p[contains(text(),'AT-Prod')]//parent::div[@tabindex='0']//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
					
					sleep(2000);
					// Validation

					WebElement createdEnvironment = driver
							.findElement(By.xpath("//p[contains(text(),'AT-Prod')]//parent::div[@tabindex='0']"));
					String expectedEnvironment = "AT-Prod";
					String actualEnvironment = createdEnvironment.getText();
					
					
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//p[contains(text(),'AT-Prod')]//parent::div[@tabindex='0']//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					
					


					Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
							"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

				
					System.out.println("Environment is successfully created");
	
							sleep(2000);
					
					driver.close();	
		}
		
		
		
		 //Creating Cluster Dev 
			@Test(priority=4 )
			public void ValidClusterNameForDev() {
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

				sleep(3000);

				// Login with valid credentials
							WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
							enterUsername.sendKeys("mkg243001@gmail.com");

							// Enter Password
							WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
							enterPassword.sendKeys("manoj@123");

							sleep(2000);

				// Click on Create Cluster Button
				WebElement clickLoginButton = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
				clickLoginButton.click();

				sleep(2000);
				
				//Click on CI-CD Button
				WebElement clickOnCiCd= driver.findElement(By.xpath(
						"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
				clickOnCiCd.click();
				sleep(2000);

				// Click on the Cluster Page
				WebElement clickOnClusterPage = driver.findElement(By
						.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
				clickOnClusterPage.click();

				sleep(2000);

				// Click on the Create Cluster Button
				WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//button[@type='button']"));
				clickOnCreateClusterButton.click();

				sleep(4000);

				// Enter Name of the Cluster
				WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
				enterClustername.sendKeys("ECS-DEV-ONE");
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

				// Select Deployment Agent as ECS
				WebElement selectDeploymentAgentAsEKS = driver.findElement(
						By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[1]"));
				selectDeploymentAgentAsEKS.click();
				sleep(1000);

				// Click on Create Button
				WebElement selectCreateECSButton = driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				selectCreateECSButton.click();
		sleep(2000);
		
		// Click on Continue Button
		WebElement selectContinue = driver.findElement(By.xpath(
				"//body/div[3]/div[@role='presentation']/div[@role='dialog']/div[2]/button[2]"));
		selectContinue.click();
sleep(2000);
		
		
		
		
		// Wait for the "Success" message to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		By successMessageLocator = By.xpath("//p[contains(text(),'ECS-DEV-ONE')]//parent::div//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
		sleep(2000);
		
		
		
		// Validation:1 To check whether the cluster is successfully created or not

		WebElement createdEnvironment = driver
				.findElement(By.xpath("//div[@data-colindex='0']//p[contains(text(),'ECS-DEV-ONE')]"));
		String expectedEnvironment = "ECS-DEV-ONE";
		String actualEnvironment = createdEnvironment.getText();
		
		
		WebElement statusOfCreatedEnvironment = driver
				.findElement(By.xpath("//p[contains(text(),'ECS-DEV-ONE')]//parent::div//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]"));
		String expectdedStatusOfCreatedEnvironment = "Success";
		String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
		
		
		


		Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
				"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

	sleep(5000);

			driver.close();

			}
		
			//Creating Cluster for Staging 
			@Test(priority =5 )
			public void ValidClusterNameForStaging() {
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

				sleep(3000);

				// Login with valid credentials
							WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
							enterUsername.sendKeys("mkg243001@gmail.com");

							// Enter Password
							WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
							enterPassword.sendKeys("manoj@123");

							sleep(2000);

				// Click on Create Cluster Button
				WebElement clickLoginButton = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
				clickLoginButton.click();

				sleep(2000);
				
				//Click on CI-CD Button
				WebElement clickOnCiCd= driver.findElement(By.xpath(
						"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
				clickOnCiCd.click();
				sleep(2000);

				// Click on the Cluster Page
				WebElement clickOnClusterPage = driver.findElement(By
						.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
				clickOnClusterPage.click();

				sleep(2000);

				// Click on the Create Cluster Button
				WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//button[@type='button']"));
				clickOnCreateClusterButton.click();

				sleep(4000);

				// Enter Name of the Cluster
				WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
				enterClustername.sendKeys("ECS-Staging");
				sleep(1000);

				// Click on Environment Dropdown
				WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
						"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
				clickOnEnvironmentDropdown.click();
				sleep(1000);

				// Select Type of Environment
				WebElement selectEnvironmentType = driver
						.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
				selectEnvironmentType.click();
				sleep(1000);

				// Select Deployment Agent as ECS
				WebElement selectDeploymentAgentAsEKS = driver.findElement(
						By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[1]"));
				selectDeploymentAgentAsEKS.click();
				sleep(1000);

				// Click on Create Button
				WebElement selectCreateECSButton = driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				selectCreateECSButton.click();
		sleep(2000);
		
		// Click on Continue Button
		WebElement selectContinue = driver.findElement(By.xpath(
				"//body/div[3]/div[@role='presentation']/div[@role='dialog']/div[2]/button[2]"));
		selectContinue.click();
sleep(2000);
		
		
		
		
		// Wait for the "Success" message to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		By successMessageLocator = By.xpath("//p[contains(text(),'ECS-Staging')]//parent::div//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
		sleep(2000);
		
		
		
		// Validation:1 To check whether the cluster is successfully created or not

		WebElement createdEnvironment = driver
				.findElement(By.xpath("//div[@data-colindex='0']//p[contains(text(),'ECS-Staging')]"));
		String expectedEnvironment = "ECS-Staging";
		String actualEnvironment = createdEnvironment.getText();
		
		
		WebElement statusOfCreatedEnvironment = driver
				.findElement(By.xpath("//p[contains(text(),'ECS-Staging')]//parent::div//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]"));
		String expectdedStatusOfCreatedEnvironment = "Success";
		String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
		
		
		


		Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
				"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

	sleep(5000);



			driver.close();

			}
			
			
			//Creating Cluster for Prod
			@Test(priority =6 )
			public void ValidClusterNameForProd() {
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

				sleep(3000);

				// Login with valid credentials
							WebElement enterUsername = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
							enterUsername.sendKeys("mkg243001@gmail.com");

							// Enter Password
							WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
							enterPassword.sendKeys("manoj@123");

							sleep(2000);

				// Click on Create Cluster Button
				WebElement clickLoginButton = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
				clickLoginButton.click();

				sleep(2000);
				
				//Click on CI-CD Button
				WebElement clickOnCiCd= driver.findElement(By.xpath(
						"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
				clickOnCiCd.click();
				sleep(2000);

				// Click on the Cluster Page
				WebElement clickOnClusterPage = driver.findElement(By
						.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
				clickOnClusterPage.click();

				sleep(2000);

				// Click on the Create Cluster Button
				WebElement clickOnCreateClusterButton = driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//button[@type='button']"));
				clickOnCreateClusterButton.click();

				sleep(4000);

				// Enter Name of the Cluster
				WebElement enterClustername = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
				enterClustername.sendKeys("ECS-Prod");
				sleep(1000);

				// Click on Environment Dropdown
				WebElement clickOnEnvironmentDropdown = driver.findElement(By.xpath(
						"/html/body/div[@role='presentation']/div[3]//div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
				clickOnEnvironmentDropdown.click();
				sleep(1000);

				// Select Type of Environment
				WebElement selectEnvironmentType = driver
						.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[3]"));
				selectEnvironmentType.click();
				sleep(1000);

				// Select Deployment Agent as ECS
				WebElement selectDeploymentAgentAsEKS = driver.findElement(
						By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div/button[1]"));
				selectDeploymentAgentAsEKS.click();
				sleep(1000);

				// Click on Create Button
				WebElement selectCreateECSButton = driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				selectCreateECSButton.click();
		sleep(2000);
		
		// Click on Continue Button
		WebElement selectContinue = driver.findElement(By.xpath(
				"//body/div[3]/div[@role='presentation']/div[@role='dialog']/div[2]/button[2]"));
		selectContinue.click();
sleep(2000);
		
		
		
		
		// Wait for the "Success" message to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		By successMessageLocator = By.xpath("//p[contains(text(),'ECS-Prod')]//parent::div//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
		sleep(2000);
		
		
		
		// Validation:1 To check whether the cluster is successfully created or not

		WebElement createdEnvironment = driver
				.findElement(By.xpath("//div[@data-colindex='0']//p[contains(text(),'ECS-Prod')]"));
		String expectedEnvironment = "ECS-Prod";
		String actualEnvironment = createdEnvironment.getText();
		
		
		WebElement statusOfCreatedEnvironment = driver
				.findElement(By.xpath("//p[contains(text(),'ECS-Prod')]//parent::div//parent::div//div[@data-colindex='3']//p[contains(text(),'Success')]"));
		String expectdedStatusOfCreatedEnvironment = "Success";
		String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
		
		
		


		Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
				"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

	sleep(5000);



			driver.close();

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
