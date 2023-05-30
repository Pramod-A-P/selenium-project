package com.herokuapp.theinternet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Build {
	// Test Case 1: Test for Empty Main Branch TextField
	
		@Test(priority = 1)
		public void TestForEmptyMainBranchTextField() {

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
			System.out.println("Test Case 1:Test for Empty Main Branch TextField");
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
			
			//Click on CI-CD Button
			WebElement clickOnCiCd= driver.findElement(By.xpath(
					"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
			clickOnCiCd.click();
			sleep(2000);
			
			// Click on the Service 
						WebElement clickOnService = driver.findElement(By.xpath("//p[contains(text(),'automation-testing-one')]"));
						clickOnService.click();
			
						sleep(2000);	
						// Click on the Build component 
						WebElement clickOnBuildComponent = driver.findElement(By.xpath(
								"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div[1]/span[1]/div[1]"));
						clickOnBuildComponent.click();
						
						sleep(2000);
						
						// Click on the Edit Configuration
						WebElement clickOnEditConfiguration = driver.findElement(By.xpath(
								"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//ul/li[3]/div[@role='button']//p[.='Edit Configuration']"));
						clickOnEditConfiguration.click();
						
						sleep(2000);
						// Click on Save Button
						WebElement clickOnSaveButton = driver.findElement(By.xpath(
								"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
						clickOnSaveButton.click();
						
						sleep(2000);
						// Validation

						WebElement errorMessage = driver
								.findElement(By.className("MuiFormHelperText-root"));
						String expectedErrorMessage = "Please select a branch";
						String actualErrorMessage = errorMessage.getText();

						Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
						"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
						+ expectedErrorMessage);
					
						

						// Close browser
						driver.close();

}
		
		
		
			// Test Case 2: Test for Build Without Credential scan and Docker Image scan
			
				@Test(priority = 2)
				public void BuildWithoutCredentialScanAndDockerImageScan() {

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
					System.out.println(" Test Case 2: Test for Build Without Credential scan and Docker Image scan");
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
					
					//Click on CI-CD Button
					WebElement clickOnCiCd= driver.findElement(By.xpath(
							"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
					clickOnCiCd.click();
					sleep(2000);
					
					// Click on the Service 
								WebElement clickOnService = driver.findElement(By.xpath("//p[contains(text(),'automation-testing-one')]"));
								clickOnService.click();
					
								sleep(4000);	
								// Click on the Build component 
								WebElement clickOnBuildComponent = driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div[1]/span[1]/div[1]"));
								clickOnBuildComponent.click();
								
								sleep(4000);
								
								// Click on the Edit Configuration
								WebElement clickOnEditConfiguration = driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//ul/li[3]/div[@role='button']//p[.='Edit Configuration']"));
								clickOnEditConfiguration.click();
								
								sleep(2000);
								
								
								//Select Main Branch Text Field
								WebElement clickOnMainBranch = driver.findElement(By.xpath(
										"//input[@aria-invalid='false' and @placeholder='Select Branch']"));
								clickOnMainBranch.click();
								sleep(7000);
								
							
								//Select Main Branch Text Field
								WebElement SelectBranchWhichIsOutOfIndex = driver.findElement(By.xpath(
										"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[5]"));
								SelectBranchWhichIsOutOfIndex.click();
								sleep(2000);
								
								
								// Click on Save Button
								WebElement clickOnSaveButton = driver.findElement(By.xpath(
										"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
								clickOnSaveButton.click();
								
								sleep(2000);
								
								
								//Click Build Component
								WebElement clickOnBuildComponent2 = driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div[1]/span[1]/div[1]"));
								clickOnBuildComponent2.click();
								
								
								
								//Click on Run Build
								WebElement clickOnRunBuild= driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//ul/li[2]/div[@role='button']//p[.='Run Build']"));
								clickOnRunBuild.click();
								
								sleep(2000);
								
								// Wait for the "Success" message to be displayed
								WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(900));
								By successMessageLocator = By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/p[text()='Success']");
								WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
								sleep(2000);
								
								
							
								// Close browser
								driver.close();

		}
				
				
				// Test Case 3: Configuring build with enabled Credential Scan 
				
				@Test(priority = 3)
				public void EditConfigWithEnabledCredentialAndDockerImageScan() {

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
					System.out.println("Test Case 3: Configuring build with enabled Credential Scan and Docker Image Scan");
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
					
					//Click on CI-CD Button
					WebElement clickOnCiCd= driver.findElement(By.xpath(
							"/html//div[@id='root']//ul/li[1]/span/div[@role='button']"));
					clickOnCiCd.click();
					sleep(2000);
					
					// Click on the Service 
								WebElement clickOnService = driver.findElement(By.xpath("//p[contains(text(),'automation-testing-one')]"));
								clickOnService.click();
					
								sleep(2000);	
								// Click on the Build component 
								WebElement clickOnBuildComponent = driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div[1]/span[1]/div[1]"));
								clickOnBuildComponent.click();
								
								sleep(2000);
								
								// Click on the Edit Configuration
								WebElement clickOnEditConfiguration = driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//ul/li[3]/div[@role='button']//p[.='Edit Configuration']"));
								clickOnEditConfiguration.click();
								
								sleep(2000);
								
								
								//Security Checks
								
								//Selecting Credential Scan
								WebElement SelectCredentialScan = driver.findElement(By.xpath(
										"/html//div[@role='presentation']/div[3]//span[.='Credential Scan']"));
								SelectCredentialScan.click();
								sleep(2000);
								//Selecting Docker Image Scan
								WebElement SelectDockerImageScan = driver.findElement(By.xpath(
										"/html//div[@role='presentation']/div[3]//span[.='Docker Image Scan']"));
								SelectDockerImageScan .click();
								sleep(2000);
								
								//Selecting Trigger to Automatic
								WebElement SelectTriggerToAutomatic = driver.findElement(By.xpath(
										"/html/body/div[@role='presentation']/div[3]/div[2]/div[2]/div[4]/div[1]/div/button[1]"));
								SelectTriggerToAutomatic.click();
								sleep(2000);
								
								//Select Main Branch Text Field
								WebElement clickOnMainBranch = driver.findElement(By.xpath(
										"//input[@aria-invalid='false' and @placeholder='Select Branch']"));
								clickOnMainBranch.click();
								sleep(7000);
								
							
								//Select Main Branch Text Field
								WebElement SelectBranchWhichIsOutOfIndex = driver.findElement(By.xpath(
										"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[5]"));
								SelectBranchWhichIsOutOfIndex.click();
								sleep(2000);
								
								
								//Selecting Docker Image Storage
								WebElement SelectDockerImageStorage = driver.findElement(By.xpath(
										"/html/body/div[@role='presentation']/div[3]//div[@role='radiogroup']//span[.='AWS ECR']"));
								SelectDockerImageStorage.click();
								sleep(2000);
								
								//Docker Build variables
								
								//Selecting Key Variables
								WebElement enterKey= driver.findElement(By.xpath("//input[@type='text' and @placeholder='Key']"));
								enterKey.sendKeys("ENV");
								
								//Selecting Value Variables
								WebElement enterValue= driver.findElement(By.xpath("//input[@type='text' and @placeholder='Value']"));
								enterValue.sendKeys("Stg");
								
								
								// Click on Save Button
								WebElement clickOnSaveButton = driver.findElement(By.xpath(
										"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
								clickOnSaveButton.click();
								
								sleep(2000);
								
					
								//Click Build Component
								WebElement clickOnBuildComponent2 = driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div[1]/span[1]/div[1]"));
								clickOnBuildComponent2.click();
								
								sleep(2000);
								
								//Click on Run Build
								WebElement clickOnRunBuild= driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//ul/li[2]/div[@role='button']//p[.='Run Build']"));
								clickOnRunBuild.click();
								
								sleep(2000);
								
								// Wait for the "Success" message to be displayed
								WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(900));
								By successMessageLocator = By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/p[text()='Success']");
								WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
								sleep(3000);
								
								
								//Validation Checks
								
						//1.Whether the credential Scan Analysis  are visible or not
								
								
								//Click on Credential Scan Analysis
								WebElement clickOnCredentialScanAnalysis= driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/button[2]"));
								clickOnCredentialScanAnalysis.click();
								sleep(3000);
								
								System.out.println("Credential Scan Analysis Tab is Enabled");
								
								
								//Check for the Tab Creation
								WebElement expectedText = driver
										.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/button[2]"));
								String expectedTextContent = "Credential Scan Analysis";
								String actualTextContent = expectedText.getText();

								Assert.assertTrue(actualTextContent.contains(expectedTextContent),
								"Credential Scan Analysis tab is not created. \nActual: " +actualTextContent+ "\nExpected: "
								+expectedTextContent);
							
								sleep(2000);
								
								
								
								//2.Whether the  Image Scan Analysis are visible or not
								WebElement clickOnImageScanAnalysis= driver.findElement(By.xpath(
										"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/button[3]"));
								clickOnImageScanAnalysis.click();
								sleep(3000);
								
								System.out.println("Image Scan Analysis Tab is Enabled");
								
								//Check for the Tab Creation
								WebElement expectedText2 = driver
										.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/button[3]"));
								String expectedTextContent2 = "Credential Scan Analysis";
								String actualTextContent2 = expectedText2.getText();

								Assert.assertTrue(actualTextContent2.contains(expectedTextContent2),
								"Credential Scan Analysis tab is not created. \nActual: " +actualTextContent2+ "\nExpected: "
								+expectedTextContent2);
							
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
		
		
		
		