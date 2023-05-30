package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateService {

	//Test Case 1 : Creating Service with Invalid Name
	
	@Test(priority=1)
	public void CreateApp() {
	
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
		sleep(2000);
		// Enter Password
		WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
		enterPassword.sendKeys("manoj@123");

		sleep(2000);


		// Click on Login Button
		WebElement clickLoginButton = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		clickLoginButton.click();

		sleep(2000);
		
		System.out.println("Creating Service with Invalid Name");
		
		//Click on Create App Button
		WebElement clickOnCreateAppButton = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//button[@type='button']"));
		clickOnCreateAppButton .click();
		sleep(2000);
		// Enter App Name
				WebElement InvalidAppName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div/div[1]/div/div/input"));
				InvalidAppName.sendKeys("099809");
				sleep(2000);
		//Select Repository Name
				WebElement clickOnRepositoryDropDown= driver.findElement(By.xpath(
						"/html/body/div[@role='presentation']/div[3]/div/div[2]/div[1]//input[@role='combobox']"));
				clickOnRepositoryDropDown.click();	
				sleep(2000);
				
				//Select Thor from Repository		
				WebElement clickOnRepositoryDropDown2= driver.findElement(By.xpath(
						"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[11]"));
				clickOnRepositoryDropDown2.click();	
				sleep(2000);
				
		//Click on create button
				WebElement clickOnCreateButton= driver.findElement(By.xpath(
						"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
				clickOnCreateButton.click();	
				sleep(2000);	
				
		//Validation
				WebElement errorMessage = driver.findElement(By.className("MuiFormHelperText-root"));
				String expectedErrorMessage = "Invalid app name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
				String actualErrorMessage = errorMessage.getText();

				Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
						"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
								+ expectedErrorMessage);
				
				
				driver.close();
	}
	
	
	//Test Case 2 : Testing For Empty App Name Text Field
	
		@Test(priority=2)
		public void EmptyAppName() {
		
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
			sleep(2000);
			// Enter Password
			WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
			enterPassword.sendKeys("manoj@123");

			sleep(2000);


			// Click on Login Button
			WebElement clickLoginButton = driver.findElement(By.xpath(
					"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
			clickLoginButton.click();

			sleep(2000);
			System.out.println("Testing For Empty App Name Text Field");
			
			//Click on Create App Button
			WebElement clickOnCreateAppButton = driver.findElement(By.xpath(
					"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//button[@type='button']"));
			clickOnCreateAppButton .click();
			sleep(2000);
			// Enter App Name
					WebElement InvalidAppName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div/div[1]/div/div/input"));
					InvalidAppName.sendKeys("");
					sleep(2000);
			//Select Repository Name
					WebElement clickOnRepositoryDropDown= driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]/div/div[2]/div[1]//input[@role='combobox']"));
					clickOnRepositoryDropDown.click();	
					sleep(2000);
					
					//Select Thor from Repository		
					WebElement clickOnRepositoryDropDown2= driver.findElement(By.xpath(
							"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[11]"));
					clickOnRepositoryDropDown2.click();	
					sleep(2000);
					
			//Click on create button
					WebElement clickOnCreateButton= driver.findElement(By.xpath(
							"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
					clickOnCreateButton.click();	
					sleep(2000);	
					
			//Validation
					WebElement errorMessage = driver.findElement(By.className("MuiFormHelperText-root"));
					String expectedErrorMessage = "Invalid app name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
					String actualErrorMessage = errorMessage.getText();

					Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
									+ expectedErrorMessage);
					
					
					driver.close();
		}
		
		
		//Test Case 3: Testing For Empty Repo Text Field
		
			@Test(priority=3)
			public void EmptyRepositoryTextField() {
			
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
				sleep(2000);
				// Enter Password
				WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
				enterPassword.sendKeys("manoj@123");

				sleep(2000);


				// Click on Login Button
				WebElement clickLoginButton = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
				clickLoginButton.click();
				System.out.println("Testing For Empty Repo Text Field");
				sleep(2000);
				
				//Click on Create App Button
				WebElement clickOnCreateAppButton = driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//button[@type='button']"));
				clickOnCreateAppButton .click();
				sleep(2000);
				// Enter App Name
						WebElement InvalidAppName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div/div[1]/div/div/input"));
						InvalidAppName.sendKeys("Test-one");
						sleep(2000);

						
				//Click on create button
						WebElement clickOnCreateButton= driver.findElement(By.xpath(
								"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
						clickOnCreateButton.click();	
						sleep(2000);	
						
				//Validation
						WebElement errorMessage = driver.findElement(By.className("MuiFormHelperText-root"));
						String expectedErrorMessage = "Please select a repository.";
						String actualErrorMessage = errorMessage.getText();

						Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
								"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
										+ expectedErrorMessage);
						
						
						driver.close();
			}
			
			
			//Test Case 4: Testing For Valid  Service Name
			
			@Test(priority=4)
			public void ValidServiceName() {
			
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
				sleep(2000);
				// Enter Password
				WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
				enterPassword.sendKeys("manoj@123");

				sleep(2000);


				// Click on Login Button
				WebElement clickLoginButton = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
				clickLoginButton.click();
				System.out.println("Testing For Valid  Service Name");
				sleep(6000);
				
		
			
		//----------------------------------------------------------------------------------------------------------------------------------------------
			//Click on CI-CD Button
				WebElement clickOnCiCd= driver.findElement(By.xpath(
						"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
				clickOnCiCd.click();
				sleep(2000);
				
				
				
				//Click on Create Apps Tab
			WebElement clickOnCreateAppsTab = driver.findElement(By.xpath(
					"/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[1]"));
			clickOnCreateAppsTab .click();
			sleep(2000);
				
				//Click on Create App Button
				WebElement clickOnCreateAppButton = driver.findElement(By.xpath(
						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//button[@type='button']"));
				clickOnCreateAppButton .click();
				sleep(2000);
				// Enter App Name
						WebElement InvalidAppName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div/div[1]/div/div/input"));
						InvalidAppName.sendKeys("automation-testing-one");
						sleep(2000);
				//Select Repository Name
						WebElement clickOnRepositoryDropDown= driver.findElement(By.xpath(
								"/html/body/div[@role='presentation']/div[3]/div/div[2]/div[1]//input[@role='combobox']"));
						clickOnRepositoryDropDown.click();	
						sleep(2000);
						
					
				//Select Harmony from Repository		
						WebElement clickOnRepositoryDropDown2= driver.findElement(By.xpath(
								"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[9]"));
						clickOnRepositoryDropDown2.click();	
						sleep(2000);
						

						
				//Click on create button
						WebElement clickOnCreateButton= driver.findElement(By.xpath(
								"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
						clickOnCreateButton.click();	
						sleep(2000);	
						
				//Validation
						WebElement serviceName = driver.findElement(By.xpath("//p[contains(text(),'automation-testing-one')]"));
						String expectedServiceName = "automation-testing-one";
						String ActualServiceName = serviceName.getText();

						Assert.assertTrue(ActualServiceName.contains(expectedServiceName),
								"Service is not created. \nActual: " + ActualServiceName + "\nExpected: "
										+expectedServiceName);
						System.out.println("App is Successfully Created");
						sleep(2000);
						driver.close();
			}
			
			
//Test Case 5: Testing For Existing  Service Name
			
			@Test(priority=5)
			public void ExistingServiceName() {
			
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
				sleep(2000);
				// Enter Password
				WebElement enterPassword = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
				enterPassword.sendKeys("manoj@123");

				sleep(2000);


				// Click on Login Button
				WebElement clickLoginButton = driver.findElement(By.xpath(
						"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
				clickLoginButton.click();
				System.out.println("Testing For Existing  Service Name");
				sleep(3000);
				
				//Click on Create Apps Tab
				WebElement clickOnCreateAppsTab = driver.findElement(By.xpath(
						"/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[1]"));
				clickOnCreateAppsTab .click();
				sleep(2000);
					
					//Click on Create App Button
					WebElement clickOnCreateAppButton = driver.findElement(By.xpath(
							"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//button[@type='button']"));
					clickOnCreateAppButton .click();
					sleep(2000);
					// Enter App Name
							WebElement InvalidAppName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div/div[1]/div/div/input"));
							InvalidAppName.sendKeys("automation-testing-one");
							sleep(2000);
					//Select Repository Name
							WebElement clickOnRepositoryDropDown= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]/div/div[2]/div[1]//input[@role='combobox']"));
							clickOnRepositoryDropDown.click();	
							sleep(2000);
							
						
					//Select Thor from Repository		
							WebElement clickOnRepositoryDropDown2= driver.findElement(By.xpath(
									"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[9]"));
							clickOnRepositoryDropDown2.click();	
							sleep(2000);
							

							
					//Click on create button
							WebElement clickOnCreateButton= driver.findElement(By.xpath(
									"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							clickOnCreateButton.click();	
							sleep(2000);	
						
				//Validation
						WebElement errorMessage = driver.findElement(By.className("MuiAlert-message"));
						String expectedErrorMessage = "Name already exists";
						String actualErrorMessage = errorMessage.getText();

						Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
								"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
										+ expectedErrorMessage);
						System.out.println("Test Pass successfully throws alert");
						
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
