package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AtDevDeploy {

	
	// Test Case 1: Test for Empty Cluster Text Field
	
			@Test(priority = 1)
			public void TestForEmptyClusterTextField() {

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
	
				//Click on At-Dev Environment
							WebElement clickOnAtDev=driver.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//p[.='At-Dev']"));
							clickOnAtDev.click();
				
							sleep(2000);
							
				//Select Edit Configuration
							WebElement clickOnEditConfiguration=driver.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//ul/li[5]/div[@role='button']//p[.='Edit Configuration']"));
							clickOnEditConfiguration.click();
							sleep(2000);
	
//				//Selecting Cluster from the Dropdown
//							WebElement clickOnClusterDropDown=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
//							clickOnClusterDropDown.click();
//							sleep(4000);
//							
//				//Select Ecs-Dev from the dropdown
//							WebElement selectClusterFromDropDown=driver.findElement(By.xpath("//ul[@id=':re:-listbox']/li[@role='option']"));
//							selectClusterFromDropDown.click();
//							sleep(2000);
							
				//Select Sub Domain
							WebElement selectSubDomainTextBox=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[4]/div[2]/div[@class='MuiFormControl-root css-13sljp9']/div[@class='MuiFormControl-root MuiTextField-root css-33chvc']/div/input"));
							selectSubDomainTextBox.sendKeys("kathir");
							sleep(2000);
							
				
							//Select Container Port
							WebElement containerPort=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
							containerPort.sendKeys("80");
							sleep(2000);
							
							//Enter Environment Variables-Key
							WebElement EnvironmentKey=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-33chvc']/div/input"));
							EnvironmentKey.sendKeys("ENV");
							sleep(2000);
							
							//Enter Environment Variables-Value
							WebElement EnvironmentValue=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div[2]/div[@class='MuiFormControl-root MuiTextField-root css-33chvc']/div/input"));
							EnvironmentValue.sendKeys("Stg");
							sleep(2000);
							
							//Select add Environment Variables
							WebElement clickOnAdd=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div[3]/button[@type='button']"));
							clickOnAdd.click();
				
							sleep(2000);
							
							
							//Select  Save Button
							WebElement selectClusterFromDropDown=driver.findElement(By.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
							selectClusterFromDropDown.click();
							sleep(2000);
							
							
							//Validation
							WebElement errorMessage = driver
									.findElement(By.className("MuiFormHelperText-root"));
							String expectedErrorMessage = "Please select a Cluster";
							String actualErrorMessage = errorMessage.getText();

							Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
							"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
							+ expectedErrorMessage);
							
							
			}
			
			// Test Case 2: Test for Empty Sub Domain Text Field
			
					@Test(priority = 2)
					public void TestForEmptySubDomainTextField() {

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
			
						//Click on At-Dev Environment
									WebElement clickOnAtDev=driver.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//p[.='At-Dev']"));
									clickOnAtDev.click();
						
									sleep(2000);
									
						//Select Edit Configuration
									WebElement clickOnEditConfiguration=driver.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//ul/li[5]/div[@role='button']//p[.='Edit Configuration']"));
									clickOnEditConfiguration.click();
									sleep(2000);
			
						//Selecting Cluster from the Dropdown
									WebElement clickOnClusterDropDown=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[3]/div[1]//input[@role='combobox']"));
									clickOnClusterDropDown.click();
									sleep(4000);
									
						//Select Ecs-Dev from the dropdown
									WebElement selectClusterFromDropDown=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[1]"));
									selectClusterFromDropDown.click();
									sleep(2000);
									
						//Select Sub Domain
									WebElement selectSubDomainTextBox=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[4]/div[2]/div[@class='MuiFormControl-root css-13sljp9']/div[@class='MuiFormControl-root MuiTextField-root css-33chvc']/div/input"));
									selectSubDomainTextBox.sendKeys("");
									sleep(2000);
									
						
									//Select Container Port
									WebElement containerPort=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[6]/div[@class='MuiFormControl-root MuiTextField-root css-wfpbpz']/div/input"));
									containerPort.sendKeys("80");
									sleep(2000);
									
									//Enter Environment Variables-Key
									WebElement EnvironmentKey=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div[1]/div[@class='MuiFormControl-root MuiTextField-root css-33chvc']/div/input"));
									EnvironmentKey.sendKeys("ENV");
									sleep(2000);
									
									//Enter Environment Variables-Value
									WebElement EnvironmentValue=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div[2]/div[@class='MuiFormControl-root MuiTextField-root css-33chvc']/div/input"));
									EnvironmentValue.sendKeys("Stg");
									sleep(2000);
									
									//Select add Environment Variables
									WebElement clickOnAdd=driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[1]/div[7]/div[3]/button[@type='button']"));
									clickOnAdd.click();
						
									sleep(2000);
									
									
									//Select  Save Button
									WebElement selectSaveButton=driver.findElement(By.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
									selectSaveButton.click();
									sleep(2000);
									
									
									//Validation
									WebElement errorMessage = driver
											.findElement(By.className("MuiFormHelperText-root"));
									String expectedErrorMessage = "Invalid sub-domain. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
									String actualErrorMessage = errorMessage.getText();

									Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
									"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
									+ expectedErrorMessage);
									
									
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
