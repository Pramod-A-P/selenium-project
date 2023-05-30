package com.herokuapp.theinternet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Antivirus {
	
	
	// Test:1 Installing Antirus Agent
	@Test(priority =1 )
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
		
		//Region Button
		WebElement clickOnRegion = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div/div[1]/div/div[@role='button']"));
		clickOnRegion.click();
		sleep(2000);
		
		//select Singapore(ap-southeast-1) Region from the dropdown
		WebElement selectRegionFromTheList= driver.findElement(By.xpath(
				"//div[@id='menu-']//ul[@role='listbox']/li[5]"));
		selectRegionFromTheList.click();
		sleep(2000);
		
//		//select Antivirus-Test Checkbox
//				WebElement selectAntivirusTestCheckBox= driver.findElement(By.xpath(
//						"/html//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[1]//input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
//				selectAntivirusTestCheckBox.click();
//				sleep(2000);
//				
//		
//		//select Antivirus-Test Install Button
//				WebElement selectInstallButton= driver.findElement(By.xpath(
//						"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div/div[1]/button[@type='button']"));
//				selectInstallButton.click();
//				sleep(2000);
				
				
////		Click Continue button to Install
//				WebElement clickContinueButtonToInstall= driver.findElement(By.xpath(
//						"//body/div[@role='presentation']/div[@role='presentation']/div[@role='dialog']/div[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/button[2]"));
//				clickContinueButtonToInstall.click();
//				sleep(2000);
//				
//				// Wait for the "Success" message to be displayed
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
//				By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[6]/p");
//				WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
//				sleep(2000);
				
	//====================================================================================================================================================			
//				//Installing Antivirus Agent
//				
				//Select Agents Dropdown
				WebElement selectAgentsDropDown= driver.findElement(By.xpath(
						"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[1]/li[@class='Compliance_menuItem__OcSsN']"));
				selectAgentsDropDown.click();
				sleep(2000);
				
		//Select Antivirus Agent
		WebElement clickAntivirusAgent= driver.findElement(By.xpath(
				"/html//div[@id='root']//div[@class='MuiBox-root css-qa7tqe']/nav/ul[@class='Compliance_menuItemsContainer__BM05L']/div[1]/ul[@class='Compliance_subOptions__ndfQ6']/div[2]"));
		clickAntivirusAgent.click();
		sleep(2000);
		
		//Select Antivirus Checkbox
		WebElement selectAntivirusCheckbox= driver.findElement(By.xpath(
				"/html//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[1]//input[@class='PrivateSwitchBase-input css-1m9pwf3']"));
		selectAntivirusCheckbox.click();
		sleep(2000);
		
		//Select Antivirus Install Button
		WebElement selectAntivirusInstallButton= driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[2]/div/div/div/div[1]/button[@type='button']"));
		selectAntivirusInstallButton.click();
		sleep(2000);
		
		//Click Continue to Install Antivirus Agent
		WebElement selectContinueButton= driver.findElement(By.xpath(
				"//body/div[@role='presentation']/div[@role='presentation']/div[@role='dialog']/div[@class='MuiDialogActions-root MuiDialogActions-spacing css-14b29qc']/button[2]"));
		selectContinueButton.click();
		sleep(2000);
		
		// Wait for the "Success" message to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[2]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[7]/p");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
		sleep(2000);
		
		
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
