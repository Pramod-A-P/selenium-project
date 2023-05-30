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

public class PenetrationTest {

	/// Test 1 With Empty Test Name Field
	@Test(priority =1 )
	public void PenTestWithEmptyNameTextField() {
		System.out.println("Starting Penetration Test");
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

					sleep(3000);


		// Click on Complaince Button
		WebElement clickOnComplainceButton = driver.findElement(By.xpath(
				"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
		clickOnComplainceButton.click();

		sleep(2000);
	
	//Click of VAPT Tab
		WebElement clickOnVaptTab = driver.findElement(By.xpath(
				"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
		clickOnVaptTab.click();
		sleep(2000);
		//Click on create Test 
				WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
				clickOnCreateTestButton.click();
				sleep(3000);	
		//Entering the Test Name
				WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
				enterTestName.sendKeys("");
				sleep(3000);
		//Select Platform
				WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
				selectPlatformAsWebApp.click();
				sleep(2000);
		//Select Scan Type as
				WebElement selectScanType= driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
				selectScanType.click();
				sleep(2000);
		//Enter Url
				WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
				enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
				sleep(2000);
		//Select Whether Credentials are required or not
				WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
						"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
				selectWhetherCredentialsAreRequiredOrNot.click();
				sleep(2000);
				//Enter the User Name
				WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
				enterUserName.sendKeys("mkg243001@gmail.com");
				sleep(2000);
				//Enter password
				WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
				enterPassword2.sendKeys("manoj@123");
				sleep(2000);
				//Enter Login Url
				WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
				enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
				sleep(2000);
				
				//Select Trigger Test to Auto or Manual
				WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
				selectTriggerToAutoOrManual.click();
				sleep(2000);
				
	
				//Select Create Button
				WebElement selectCreateButton= driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				selectCreateButton.click();
				sleep(2000);
				
				// Validation

				WebElement errorMessage = driver
						.findElement(By.className("MuiFormHelperText-root"));
				String expectedErrorMessage = "Invalid test name! Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
				String actualErrorMessage = errorMessage.getText();

				Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
				+ expectedErrorMessage);
				sleep(2000);
				// Close browser
				driver.close();
	
	}

	// Test 2 With Empty Url Text field
		@Test(priority =2 )
		public void WithEmptyUrlTextField() {
			System.out.println("Starting Penetration Test");
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

			sleep(3000);


// Click on Complaince Button
WebElement clickOnComplainceButton = driver.findElement(By.xpath(
		"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
clickOnComplainceButton.click();

sleep(2000);

//Click of VAPT Tab
WebElement clickOnVaptTab = driver.findElement(By.xpath(
		"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
clickOnVaptTab.click();
sleep(2000);
//Click on create Test 
		WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
		clickOnCreateTestButton.click();
		sleep(3000);	
//Entering the Test Name
		WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
		enterTestName.sendKeys("Pent-Test-Two");
		sleep(3000);
//Select Platform
		WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
		selectPlatformAsWebApp.click();
		sleep(2000);
//Select Scan Type as
		WebElement selectScanType= driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
		selectScanType.click();
		sleep(2000);
//Enter Url
		WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
		enterUrl.sendKeys("");
		sleep(2000);
//Select Whether Credentials are required or not
		WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
		selectWhetherCredentialsAreRequiredOrNot.click();
		sleep(2000);
		//Enter the User Name
		WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
		enterUserName.sendKeys("mkg243001@gmail.com");
		sleep(2000);
		//Enter password
		WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
		enterPassword2.sendKeys("manoj@123");
		sleep(2000);
		//Enter Login Url
		WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
		enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
		sleep(2000);
		
		//Select Trigger Test to Auto or Manual
		WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
		selectTriggerToAutoOrManual.click();
		sleep(2000);
		

		//Select Create Button
		WebElement selectCreateButton= driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		selectCreateButton.click();
		sleep(2000);
		
		// Validation

		WebElement errorMessage = driver
				.findElement(By.className("MuiFormHelperText-root"));
		String expectedErrorMessage = "URL can't be empty or contain white space";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
		"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
		+ expectedErrorMessage);
		sleep(2000);
		// Close browser
		driver.close();
		
		}	
		
		
		// Test 3 With Empty User Name  Text field
				@Test(priority =3 )
				public void WithEmptyUserNameTextField() {
					System.out.println("Starting Penetration Test");
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

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("Pent-Test-Two");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("manoj@123");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
							sleep(2000);
							
							//Select Trigger Test to Auto or Manual
							WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
							selectTriggerToAutoOrManual.click();
							sleep(2000);
							

							//Select Create Button
							WebElement selectCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							// Validation

							WebElement errorMessage = driver
									.findElement(By.className("MuiFormHelperText-root"));
							String expectedErrorMessage = "Username can't be empty";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);
							sleep(2000);
							// Close browser
							driver.close();
							}	

				
				// Test 4 With Empty Password Text field
				@Test(priority =4 )
				public void WithEmptyPasswordTextField() {
					System.out.println("Starting Penetration Test");
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

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("Pent-Test-Two");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("mkg243001@gmail.com");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
							sleep(2000);
							
							//Select Trigger Test to Auto or Manual
							WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
							selectTriggerToAutoOrManual.click();
							sleep(2000);
							

							//Select Create Button
							WebElement selectCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							// Validation

							WebElement errorMessage = driver
									.findElement(By.className("MuiFormHelperText-root"));
							String expectedErrorMessage = "Password can't be empty";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);
							sleep(2000);
							// Close browser
							driver.close();
							}
				
				
				// Test 5 With Empty Login Url Text field
				@Test(priority =5 )
				public void WithLoginUrl() {
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
								
								
								// Click on Login Button
								WebElement clickLoginButton = driver.findElement(By.xpath(
										"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
								clickLoginButton.click();

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("Pent-Test-Two");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("mkg243001@gmail.com");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("manoj@123");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("");
							sleep(2000);
							
							//Select Trigger Test to Auto or Manual
							WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
							selectTriggerToAutoOrManual.click();
							sleep(2000);
							

							//Select Create Button
							WebElement selectCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							// Validation

							WebElement errorMessage = driver
									.findElement(By.className("MuiFormHelperText-root"));
							String expectedErrorMessage = "URL can't be empty or contain white space";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);
							sleep(2000);
							// Close browser
							driver.close();
							}
				
				// Test 6 With Invalid Penetration Test Name
				@Test(priority =6 )
				public void InvalidPenetrationTestName() {
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
								
								
								// Click on Login Button
								WebElement clickLoginButton = driver.findElement(By.xpath(
										"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
								clickLoginButton.click();

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("98567");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("mkg243001@gmail.com");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("manoj@123");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
							sleep(2000);
							
							//Select Trigger Test to Auto or Manual
							WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
							selectTriggerToAutoOrManual.click();
							sleep(2000);
							

							//Select Create Button
							WebElement selectCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							// Validation

							WebElement errorMessage = driver
									.findElement(By.className("MuiFormHelperText-root"));
							String expectedErrorMessage = "Invalid test name! Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);
							sleep(2000);
							// Close browser
							driver.close();
							}
				
				
				// Test 7 With Valid Penetration Test Name for Web App Platform(Manual Trigger Way)
				@Test(priority =7 )
				public void ValidPenetrationTestName1() {
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
								
								
								// Click on Login Button
								WebElement clickLoginButton = driver.findElement(By.xpath(
										"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
								clickLoginButton.click();

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("Penetration-Test-one");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("mkg243001@gmail.com");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("manoj@123");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
							sleep(2000);
							
							//Select Trigger Test to Auto or Manual
							WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
							selectTriggerToAutoOrManual.click();
							sleep(2000);
							

							//Select Create Button
							WebElement selectCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							
							//Select Start Scan
							WebElement selectStartScan= driver.findElement(By.xpath(
									"//div[contains(text(),'Penetration-Test-one')]//parent::div//parent::div//div[@data-colindex='4']//div//span[@aria-label='Run Test']//button"));
							selectStartScan.click();
							sleep(2000);
							
							
							
							// Validation
							// Wait for the "Success" message to be displayed
							WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(700));
							By successMessageLocator = By.xpath("//div[contains(text(),'Penetration-Test-one')]//parent::div//parent::div//p[contains(text(),'Success')]");
							WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
							
							sleep(2000);
							
							//Click On View Report
							WebElement selectViewReportIcon= driver.findElement(By.xpath(
									"//div[contains(text(),'Penetration-Test-one')]//parent::div//parent::div//div[@data-colindex='4']//div//span[@aria-label='View Report']//button"));
							selectViewReportIcon.click();
							sleep(2000);
							
							//Wait till Download Button gets displayed
							WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(500));
							By waitTillDownloadButtonIsVisible = By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div/div[1]/button[@type='button']");
							WebElement successMessage2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(waitTillDownloadButtonIsVisible));
							
							sleep(3000);
							
							//Click On Download Pdf
							WebElement selectDownloadPdf= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[1]/button[@type='button']"));
							selectDownloadPdf.click();
							sleep(4000);
							
							
							// Close browser
							driver.close();
							}
				
			
				
				// Test 8 With Valid Penetration Test Name for Web App Platform(Auto Trigger Way)
				@Test(priority =8 )
				public void ValidPenetrationTestNameAutoTriggerWay2() {
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
								
								
								// Click on Login Button
								WebElement clickLoginButton = driver.findElement(By.xpath(
										"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
								clickLoginButton.click();

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("Penetration-Auto");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("mkg243001@gmail.com");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("manoj@123");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
							sleep(5000);
							
							//Select Trigger Test to Auto or Manual
							WebElement clickTriggerToAuto = driver.findElement(By.xpath(
									"//span[text()='Auto']"));
							clickTriggerToAuto .click();

							sleep(3000);


							
							//Enter the Time of Trigger way
							WebElement includeDirectory = driver.findElement(By.xpath("//input[@type='tel']"));
							includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

							includeDirectory.sendKeys("08:27 PM");
							sleep(3000);
							
							//Select Create button
							WebElement clickCreateButton = driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							clickCreateButton.click();
							sleep(3000);
							
							 //Wait till the Scan triggers and shows the test is success
							WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(900));
							By successMessageLocator = By.xpath("//div[contains(text(),'Penetration-Auto')]//parent::div//parent::div//p[contains(text(),'Success')]");
							WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
							sleep(3000);

							
							//Click On View Report
							WebElement selectViewReportIcon= driver.findElement(By.xpath(
									"//div[contains(text(),'Penetration-Auto')]//parent::div//parent::div//div[@data-colindex='4']//div//span[@aria-label='View Report']//button"));
							selectViewReportIcon.click();
							sleep(2000);
							
							
							//Wait till Download Button gets displayed
							WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(500));
							By waitTillDownloadButtonIsVisible = By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div/div[1]/button[@type='button']");
							WebElement successMessage2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(waitTillDownloadButtonIsVisible));
							
							sleep(3000);
							
							//Click On Download Pdf
							WebElement selectDownloadPdf= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[1]/button[@type='button']"));
							selectDownloadPdf.click();
							sleep(5000);
							
							
							// Close browser
							driver.close();
							}
				
				
				
				// Test 9 With Valid Penetration Test Name for API Platform(Manual Trigger Way)
				@Test(priority =9 )
				public void ValidPenetrationTestNameForAPIPlatform3() {
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
								
								
								// Click on Login Button
								WebElement clickLoginButton = driver.findElement(By.xpath(
										"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
								clickLoginButton.click();

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("Penetration-three");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='API']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://harmony-stg.optiq.ai/api/v1/environments");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("mkg243001@gmail.com");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("manoj@123");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
							sleep(2000);
							
							//Select Trigger Test to Auto or Manual
							WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
							selectTriggerToAutoOrManual.click();
							sleep(2000);
							

							//Select Create Button
							WebElement selectCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							
							//Select Start Scan
							WebElement selectStartScan= driver.findElement(By.xpath(
									"//div[contains(text(),'Penetration-three')]//parent::div//parent::div//div[@data-colindex='4']//div//span[@aria-label='Run Test']//button"));
							selectStartScan.click();
							sleep(2000);
							
							
							
							// Validation
							// Wait for the "Success" message to be displayed
							WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(700));
							By successMessageLocator = By.xpath("//div[contains(text(),'Penetration-three')]//parent::div//parent::div//p[contains(text(),'Success')]");
							WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
							
							sleep(2000);
							
							//Click On View Report
							WebElement selectViewReportIcon= driver.findElement(By.xpath(
									"//div[contains(text(),'Penetration-three')]//parent::div//parent::div//div[@data-colindex='4']//div//span[@aria-label='View Report']//button"));
							selectViewReportIcon.click();
							sleep(2000);
							
							//Wait till Download Button gets displayed
							WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(500));
							By waitTillDownloadButtonIsVisible = By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div/div[1]/button[@type='button']");
							WebElement successMessage2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(waitTillDownloadButtonIsVisible));
							
							sleep(3000);
							
							//Click On Download Pdf
							WebElement selectDownloadPdf= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[1]/button[@type='button']"));
							selectDownloadPdf.click();
							sleep(5000);
							
							
							// Close browser
							driver.close();
							}
				
				
				
				// Test 10 With Existing Penetration Test Name
				@Test(priority =10)
				public void ExistingPenTestName() {
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
								
								
								// Click on Login Button
								WebElement clickLoginButton = driver.findElement(By.xpath(
										"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
								clickLoginButton.click();

								sleep(3000);


					// Click on Complaince Button
					WebElement clickOnComplainceButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div/div[1]/div/ul/li[2]/span/div[@role='button']"));
					clickOnComplainceButton.click();

					sleep(2000);

					//Click of VAPT Tab
					WebElement clickOnVaptTab = driver.findElement(By.xpath(
							"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[2]/li[@class='Compliance_menuItem__OcSsN']"));
					clickOnVaptTab.click();
					sleep(2000);
					//Click on create Test 
							WebElement clickOnCreateTestButton= driver.findElement(By.xpath(
									"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//button[@type='button']"));
							clickOnCreateTestButton.click();
							sleep(3000);	
					//Entering the Test Name
							WebElement enterTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterTestName.sendKeys("Penetration-Test-one");
							sleep(3000);
					//Select Platform
							WebElement selectPlatformAsWebApp= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[2]/div[@role='radiogroup']//span[.='Web App']"));
							selectPlatformAsWebApp.click();
							sleep(2000);
					//Select Scan Type as
							WebElement selectScanType= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[3]/div[@role='radiogroup']//span[.='Base Scan']"));
							selectScanType.click();
							sleep(2000);
					//Enter Url
							WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[4]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");
							sleep(2000);
					//Select Whether Credentials are required or not
							WebElement selectWhetherCredentialsAreRequiredOrNot= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div[2]/div/div[5]/div/button[1]"));
							selectWhetherCredentialsAreRequiredOrNot.click();
							sleep(2000);
							//Enter the User Name
							WebElement enterUserName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterUserName.sendKeys("mkg243001@gmail.com");
							sleep(2000);
							//Enter password
							WebElement enterPassword2 = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[7]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterPassword2.sendKeys("manoj@123");
							sleep(2000);
							//Enter Login Url
							WebElement enterLoginUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div/div[8]/div[@class='MuiFormControl-root MuiTextField-root css-1g3xw3o']/div/input"));
							enterLoginUrl.sendKeys("https://dashboard-stg.optiq.ai/login");
							sleep(2000);
							
							//Select Trigger Test to Auto or Manual
							WebElement selectTriggerToAutoOrManual= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]/div[2]/div/div[9]/div[@role='radiogroup']//span[.='Manual']"));
							selectTriggerToAutoOrManual.click();
							sleep(2000);
							

							//Select Create Button
							WebElement selectCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectCreateButton.click();
							sleep(2000);
							
							// Validation

							WebElement errorMessage = driver
									.findElement(By.className("MuiAlert-message"));
							String expectedErrorMessage = "Name already exists";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);
							sleep(2000);
							// Close browser
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

