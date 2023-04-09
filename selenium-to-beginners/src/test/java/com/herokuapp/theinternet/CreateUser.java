package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateUser {

	@Test
	public void creatingUser() {

		System.out.println("Logging in With  Username and Password Test");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

		// Open Test Page
		String url = "https://dashboard.optiq.ai/login";
		driver.get(url);
		System.out.println("Page is Opened");

		// sleep for 1 seconds
		sleep(1000);

		// enter username
		WebElement username = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
		username.sendKeys("pramod@optiq.ai");

		sleep(1000);

		// enter password
		WebElement password = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
		password.sendKeys("pramod@123");

		sleep(1000);

		// click login button

		WebElement logInButton = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		logInButton.click();

		sleep(1000);

//---------------------------------------------------------------------------------------Create Users Page--------------------------------------------------------------------		

		//Navigate to Users Page
		  String url1 = "https://dashboard.optiq.ai/users"; driver.get(url1);
		  System.out.println("Page routed to users");
		  
		  sleep(2000);
		  
		
		
		  // click on Create User Button for 1st Iteration
		  
		  WebElement createUserButton = driver .findElement(By.xpath(
		  "/html//div[@id='root']/div/div/div[1]/div/button[@type='button']"));
		  createUserButton.click();
		  
		  sleep(1000);
		
		
		  
		  // Create username
		  WebElement createUser = driver.findElement(By.xpath(
		  "/html/body/div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']/div/div[2]/div[2]/div/div/input"
		  )); createUser.sendKeys("pramod shetty");
		  
		  
		  
		
		  // Enter Email Address
		  WebElement emailId = driver.findElement(By.xpath(
		  "/html/body/div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']/div/div[3]/div[2]/div/div/input"
		  )); emailId.sendKeys("pramodrasta@gmail.com");
		  
		
		
		  // Select Dropdown
		  WebElement selectDropdownButton =
		  driver.findElement(By.xpath(
		  "/html/body/div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']//div[@role='button']"
		  )); selectDropdownButton.click();
		  
		  
		  
		  // Select Dropdown Content--Admin
		  WebElement selectDropdownvalue1 =
		  driver.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[1]")); 
		  selectDropdownvalue1.click();
		
		
		  
		  // click Create button 
		  WebElement createButton = driver.findElement(By.xpath(
		  "/html//div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']//button[@type='button']"));
		  createButton.click();
		  
		  sleep(2000);
		
		
		  
		  // click on Create User Button for 2nd Iteration 
		  WebElement createUserButton2 = driver .findElement(By.xpath(
		  "/html//div[@id='root']/div/div/div[1]/div/button[@type='button']"));
		  createUserButton2.click();
	  
		  sleep(1000);
		 
		
		
		  // Create username
		  WebElement createUser2 = driver.findElement(By.xpath(
		  "/html/body/div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']/div/div[2]/div[2]/div/div/input"));
		  createUser2.sendKeys("Kathir");
		
		
		  
		  // Enter Email Address
		  WebElement emailId2 = driver.findElement(By.xpath(
		  "/html/body/div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']/div/div[3]/div[2]/div/div/input"));
		  emailId2.sendKeys("kathir@gmail.com");
		
		  
		  // Select Dropdown
		  WebElement selectDropdownButton2 =
		  driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']//div[@role='button']"));
		  selectDropdownButton2.click();
		  
		  // Select Dropdown Content--Developer
		  WebElement selectDropdownvalue2 =driver.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
		  selectDropdownvalue2.click();
		
		  
		  // click Create button
		  WebElement createButton2 = driver.findElement(By.xpath(
		  "/html//div[@role='presentation']/div[@class='Modal_box__q2+NN MuiBox-root css-126n10b']//button[@type='button']"));
		  createButton2.click(); 
		  sleep(2000);

		// -----------------------------------------------------------------Penetration
		// Testing----------------------------------------------------------------------------------

		// Navigate to Complaince Page
		String url2 = "https://dashboard.optiq.ai/compliance/penetration-testing";
		driver.navigate().to(url2);
		System.out.println("Page routed to Penetration- Testing");
		sleep(2000);

		
		// Click on Penetration Testing Button
		WebElement newTestButton = driver.findElement(By.xpath("/html//div[@id='root']/div/div/div[2]/div/header/button[@type='button']"));
		newTestButton.click();
		

		// Creating Penetration Test
		WebElement enterPenTestName = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[@class='MuiCardContent-root css-1rojl3g']/div/div[1]/div[2]/div/div/input"));
		enterPenTestName.sendKeys("pram-testing-eigh");

		// Selecting Scan Type Full Scan
		WebElement selectScanType = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[@class='MuiCardContent-root css-1rojl3g']/div/div[2]/div[2]/div[@role='radiogroup']//span[.='Full Scan']"));
		selectScanType.click();

		// Selecting App Type
		WebElement appType = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[@class='MuiCardContent-root css-1rojl3g']/div/div[3]/div[2]/div[@role='radiogroup']//span[.='API']"));
		appType.click();
		

		// Enter URL
		WebElement enterUrl = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[@class='MuiCardContent-root css-1rojl3g']/div/div[4]/div[2]/div/div/input"));
		enterUrl.sendKeys("https://dashboard-stg.optiq.ai/");

		// Select trigger Test
		WebElement triggerTest = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[@class='MuiCardContent-root css-1rojl3g']/div/div[6]/div[2]/div[@role='radiogroup']//span[.='Manual']"));
		triggerTest.click();

		sleep(1000);

		// Select Create Button
		WebElement penTestCreateButton = driver.findElement(By.xpath(
				"//div[@role='presentation']/div[3]/div[@class='MuiCardActions-root MuiCardActions-spacing css-1ut4sty']/button[2]"));
		penTestCreateButton.click();

		// --------------------------------------------------------Antivirus
		// page--------------------------------------------------------------------------------------------------

		// Navigating to Antivirus Page
		String url3 = "https://dashboard.optiq.ai/compliance/antivirus";
		driver.navigate().to(url3);
		System.out.println("Page routed to Penetration- Testing");
		sleep(2000);

		// Setting Antivirus Scan to Manual

		// Clicking Antivirus Configure Button
		WebElement configureButton = driver.findElement(By.xpath(
				"/html//div[@id='root']//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[1]/div[9]/div/button[1]"));
		configureButton.click();

		sleep(2000);

		// Selecting Trigger Way to Manual
		WebElement triggerWayToManual = driver.findElement(
				By.xpath("/html//div[@role='presentation']/div[3]//div[@role='radiogroup']//span[.='Manual']"));
		triggerWayToManual.click();
		
		

		WebElement includeDirectory = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/main/div[2]/div[2]/div/div/input"));
		includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

		includeDirectory.sendKeys("usr/bin");

		
		

//		// Click on Alerts & Notification
//		WebElement clickOnAlertandNotification = driver
//				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//input[@type='checkbox']"));
//		clickOnAlertandNotification.click();

		// Click on Save Button
		WebElement clickOnSaveButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		clickOnSaveButton.click();

		// Click on Run Button
		WebElement clickOnRunButton = driver.findElement(By.xpath(
				"/html//div[@id='root']//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[1]/div[9]/div/button[2]"));
		clickOnRunButton.click();

		sleep(8000);

//---------------------------------------------------------Log Out Page---------------------------------------------------------------------------------------

		// Clicking Logout Details Button
		WebElement logoutButton1 = driver.findElement(By.xpath("/html//div[@id='root']/div//span[.='P']"));
		logoutButton1.click();

		sleep(2000);

		// Clicking Logout Button
		WebElement logoutButton2 = driver.findElement(By.xpath(
				"/html//div[@id='root']/div/div/div[2]/div//div[@class='MuiCardContent-root css-1qw96cp']/div/div[3]/div[3]/div[1]/button[@type='button']"));
		logoutButton2.click();

		sleep(6000);
		// Close browser
		driver.quit();
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
