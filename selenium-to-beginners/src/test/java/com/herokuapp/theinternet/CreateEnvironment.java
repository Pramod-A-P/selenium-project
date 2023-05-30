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
public class CreateEnvironment {

	
	//Test Case 1: Creating Environment with valid Name
	@Test(priority=1)
	public void CreatingEnvironmentWithValidName() {
		
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
						.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
						.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
				clickOnVpcLogs.click();

				sleep(2000);
				
		//Disable NAT Gateway
				WebElement clickOnNATGateway= driver.findElement(By
						.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[8]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
				clickOnNATGateway.click();	
				
		//Select Create Button		
				WebElement clickOnCreateEnvironment= driver.findElement(By
						.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				clickOnCreateEnvironment.click();	
				
				
				// Wait for the "Success" message to be displayed
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
				By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p[text()='Success']");
				WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
				
				
				// Validation

				WebElement createdEnvironment = driver
						.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[1]/p"));
				String expectedEnvironment = "At-Dev";
				String actualEnvironment = createdEnvironment.getText();
				
				
				WebElement statusOfCreatedEnvironment = driver
						.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p"));
				String expectdedStatusOfCreatedEnvironment = "Success";
				String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
				
				
				


				Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
						"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

			
				System.out.println("Environment is successfully created");
				driver.close();	
	}
	
	//Test Case 2 Testing, Creating  Environment with  Existing Name
	@Test(priority=2)
	public void TestForExistingEnvironmentForNonProd() {
		
		System.out.println("Test for Creating Environment for Non-Prod with Existing Name");
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
				WebElement selectTypeAsProd = driver.findElement(By
						.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[1]"));
				selectTypeAsProd.click();

				sleep(2000);
				
				
		//Select Region 		
				WebElement selectRegion = driver.findElement(By
						.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
				selectRegion.click();

				sleep(2000);
				
				//Select Region from the dropdown		
				WebElement selectRegionFromDropdown = driver.findElement(By
						.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[5]"));
				selectRegionFromDropdown .click();

				sleep(2000);

				//Select No of Subnets Text Field
				WebElement selectSubnetTextfield = driver.findElement(By
						.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
				selectSubnetTextfield.click();

				sleep(2000);
				
				//Select No of Subnets as 1  from the DropDown
				WebElement selectSubnetValue= driver.findElement(By
						.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
		
				//Select Create Button
				WebElement selectCreateButton = driver.findElement(By
						.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				selectCreateButton.click();
				
			   sleep(2000);
				// Validation

				WebElement errorMessage = driver
						.findElement(By.className("MuiAlert-message"));
				String expectedErrorMessage = "Same name environment is already exist";
				String actualErrorMessage = errorMessage.getText();

				Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
				+ expectedErrorMessage);
				
				driver.close();

	}
	
	
	
	
	
	
	
	
	//Test Case 3 Keeping Environment text Field Empty
	@Test(priority=3)
	public void EnvironmentTextFieldEmpty() {
		
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
				enterEnvironmentName.sendKeys("");
				
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
						.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[2]"));
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
						.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
						.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
				clickOnVpcLogs.click();

				sleep(2000);
				
		//NAT Gateway
				WebElement clickOnNATGateway= driver.findElement(By
						.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[8]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
				clickOnNATGateway.click();	
				sleep(2000);
		//Select Create Button		
				WebElement clickOnCreateEnvironment= driver.findElement(By
						.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				clickOnCreateEnvironment.click();
				
				sleep(2000);
				
				// Validation

				WebElement errorMessage = driver
						.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/p"));
				String expectedErrorMessage = "Invalid environment name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
				String actualErrorMessage = errorMessage.getText();

				Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
				+ expectedErrorMessage);	
				sleep(2000);
				driver.close();
	}
	
	
	//Test Case 4 Keeping Region Field Empty
		@Test(priority=4)
		public void RegionTextFieldEmpty() {
			
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
					enterEnvironmentName.sendKeys("Staging");
					
			//Select Type as Non Production
					WebElement selectTypeAsNonProd = driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[1]"));
					selectTypeAsNonProd.click();

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
							.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
					clickOnVpcLogs.click();

					sleep(2000);
					
			//NAT Gateway
					WebElement clickOnNATGateway= driver.findElement(By
							.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[8]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
					clickOnNATGateway.click();	
					
			//Select Create Button		
					WebElement clickOnCreateEnvironment= driver.findElement(By
							.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateEnvironment.click();
					
					
					
					// Validation

					WebElement errorMessage = driver
							.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Please select a region.";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
					"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
					+ expectedErrorMessage);	
					
					driver.close();
		}
		
		
		//Test Case 5 Keeping CIDR Text Field Empty
				@Test(priority=5)
				public void CidrTextFieldEmpty() {
					
					System.out.println("Test for Creating Environment");
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
							enterEnvironmentName.sendKeys("Staging");
							
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
									.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[2]"));
							selectRegionFromDropdown .click();
		
							sleep(2000);
							

					//Clear the content from the Text Field
							WebElement includeDirectory = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//input[@value='192.168.0.0/18']"));
							includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

					
							
							
						
					//Select No of Subnets Text Field
							WebElement selectSubnetTextfield = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
							selectSubnetTextfield.click();

							sleep(2000);
							
							//Select No of Subnets as 1  from the Text Field
							WebElement selectSubnetValue= driver.findElement(By
									.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
							clickOnVpcLogs.click();

							sleep(2000);
							
					//NAT Gateway
							WebElement clickOnNATGateway= driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[8]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
							clickOnNATGateway.click();	
							
					//Select Create Button		
							WebElement clickOnCreateEnvironment= driver.findElement(By
									.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							clickOnCreateEnvironment.click();
							
							
							
							// Validation

							WebElement errorMessage = driver
									.findElement(By.className("MuiFormHelperText-root"));
							String expectedErrorMessage = "Please enter a valid CIDR Range.";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);	
							
							driver.close();
				}
	
				
				//Test Case 6 Testing, creating Environment  for Prod Environment
				@Test(priority=6)
				public void EnvironmentForProd() {
					
					System.out.println("Test for Creating Environment for Non-Prod");
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
							enterEnvironmentName.sendKeys("AT-ENV-Prod");
							
					//Select Type as  Production
							WebElement selectTypeAsProd = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[2]"));
							selectTypeAsProd.click();

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
	
							//Select No of Subnets Text Field
							WebElement selectSubnetTextfield = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
							selectSubnetTextfield.click();

							sleep(2000);
							
							//Select No of Subnets as 1  from the DropDown
							WebElement selectSubnetValue= driver.findElement(By
									.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
					
							//Select Create Button
							WebElement selectCreateButton = driver.findElement(By
									.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							// Wait for the "Success" message to be displayed
							WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
							By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[4]/p[text()='Success']");
							WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
							
							
							// Validation

							WebElement createdEnvironment = driver
									.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[1]/p"));
							String expectedEnvironment = "AT-ENV-Prod";
							String actualEnvironment = createdEnvironment.getText();
							
							
							WebElement statusOfCreatedEnvironment = driver
									.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[4]/p"));
							String expectdedStatusOfCreatedEnvironment = "Success";
							String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
							
							
							


							Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
									"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

						
							System.out.println("Environment is successfully created");
							driver.close();	
					
				}
				

				
			//Test Case-7 Creating Environment  for Prod Type with Existing Name
				
				@Test(priority=7)
				public void EnvironmentWithExistingNameForProd() {
					
					System.out.println("Test for Creating Environment for Prod");
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
							enterEnvironmentName.sendKeys("AT-ENV-Prod");
							
					//Select Type as Production
							WebElement selectTypeAsProd = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[2]"));
							selectTypeAsProd.click();

							sleep(2000);
							
							
					//Select Region 		
							WebElement selectRegion = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
							selectRegion.click();
		
							sleep(2000);
							
							//Select Region from the dropdown		
							WebElement selectRegionFromDropdown = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[2]"));
							selectRegionFromDropdown .click();
		
							sleep(2000);
	
							//Select No of Subnets Text Field
							WebElement selectSubnetTextfield = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
							selectSubnetTextfield.click();

							sleep(2000);
							
							//Select No of Subnets as 1  from the DropDown
							WebElement selectSubnetValue= driver.findElement(By
									.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
					
							//Select Create Button
							WebElement selectCreateButton = driver.findElement(By
									.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							
							sleep(2000);
							
							// Validation

							WebElement errorMessage = driver
									.findElement(By.className("MuiAlert-message"));
							String expectedErrorMessage = "Same name environment is already exist";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);

							driver.close();
	
}
				//Test Case-8 :Creating Environment with Disabled VPC Logs		
				@Test(priority=8)
		public void EnvironmentWithDisabledVpcLogs() {
			
					System.out.println("Test for Creating Environment for Prod");
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
							enterEnvironmentName.sendKeys("AT-ENV-Stg");
							
					//Select Type as Production
							WebElement selectTypeAsNonProd = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[1]"));
							selectTypeAsNonProd .click();

							sleep(2000);
							
							
					//Select Region 		
							WebElement selectRegion = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
							selectRegion.click();
		
							sleep(2000);
							
							//Select Region from the dropdown		
							WebElement selectRegionFromDropdown = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[2]"));
							selectRegionFromDropdown .click();
		
							sleep(2000);
	
							//Select No of Subnets Text Field
							WebElement selectSubnetTextfield = driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
							selectSubnetTextfield.click();

							sleep(2000);
							
							//Select No of Subnets as 1  from the DropDown
							WebElement selectSubnetValue= driver.findElement(By
									.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
							
							
							//Disabling VPC logs
							WebElement clickOnVpcLogs= driver.findElement(By
									.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
							clickOnVpcLogs.click();
							
					
							//Select Create Button
							WebElement selectCreateButton = driver.findElement(By
									.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							
							sleep(2000);
							
						
							
							// Validation
							
							WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(400));
							By successMessageLocator2 = By.xpath(
									"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p[text()='Success']");
							WebElement successMessage2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator2));
							
							WebElement createdEnvironment = driver
									.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[3]/div[1]/p"));
							String expectedEnvironment = "AT-ENV-Stg";
							String actualEnvironment = createdEnvironment.getText();
							
							
							WebElement statusOfCreatedEnvironment = driver
									.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[3]/div[4]/p"));
							String expectdedStatusOfCreatedEnvironment = "Success";
							String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
							
							
							


							Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
									"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

						
							System.out.println("Environment is successfully created");		
					
							driver.close();
			
		}
				
				//Test Case-9 :Creating Environment with Disabled NAT Gate Way 			
				@Test(priority=9)
				public void EnvironmentWithDisabledNatGateway() {
					
							System.out.println("Test for Creating Environment for Prod");
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
									enterEnvironmentName.sendKeys("AT-ENV-Stg");
									
							//Select Type as Production
									WebElement selectTypeAsNonProd = driver.findElement(By
											.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[2]/div/button[1]"));
									selectTypeAsNonProd .click();

									sleep(2000);
									
									
							//Select Region 		
									WebElement selectRegion = driver.findElement(By
											.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
									selectRegion.click();
				
									sleep(2000);
									
									//Select Region from the dropdown		
									WebElement selectRegionFromDropdown = driver.findElement(By
											.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[2]"));
									selectRegionFromDropdown .click();
				
									sleep(2000);
			
									//Select No of Subnets Text Field
									WebElement selectSubnetTextfield = driver.findElement(By
											.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[5]/div[1]/div/div[@role='button']"));
									selectSubnetTextfield.click();

									sleep(2000);
									
									//Select No of Subnets as 1  from the DropDown
									WebElement selectSubnetValue= driver.findElement(By
											.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]"));
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
									
									
									//Disabling NAT GATEWAY 
									WebElement disablingNatGateway= driver.findElement(By
											.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[8]/span[@class='MuiSwitch-root MuiSwitch-sizeSmall css-8gaaqr']/span[1]/input[@type='checkbox']"));
									disablingNatGateway.click();
									
							
									//Select Create Button
									WebElement selectCreateButton = driver.findElement(By
											.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
									selectCreateButton.click();
									
									sleep(2000);
									
								
									
									// Validation

									WebElement createdEnvironment = driver
											.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[1]/p"));
									String expectedEnvironment = "AT-ENV-Stg";
									String actualEnvironment = createdEnvironment.getText();
									
									
									WebElement statusOfCreatedEnvironment = driver
											.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p"));
									String expectdedStatusOfCreatedEnvironment = "Success";
									String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
									
									
									


									Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
											"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

								
									System.out.println("Environment is successfully created");		
							
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
