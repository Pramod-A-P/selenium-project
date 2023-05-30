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

//Test case:1 Importing Environment for Non Prod Type
public class ImportEnvironment {
	@Test(priority=1)
	public void Import() {

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
		System.out.println("Test case:1 Importing Environment for Non Prod Type");
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
		System.out.println("Importing Environment for Non Prod Type");

		// Click on the Environment Tab
		WebElement clickOnEnvironmentTab = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
		clickOnEnvironmentTab.click();

		sleep(2000);

		// Select Import Environment
		WebElement clickOnImportEnvironmentTab = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[1]"));
		clickOnImportEnvironmentTab.click();

		sleep(2000);
		// Enter Valid Environment Name
		WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
		enterEnvironmentName.sendKeys("Imported-ENV-DEV");
		sleep(2000);
		// Select Type as Non Production
		WebElement selectingTypeASNonProd = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[2]/div/button[1]"));
		selectingTypeASNonProd.click();
		sleep(2000);
		// selecting Region Dropdown
		WebElement selectingRegion = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[3]/div/div/div"));
		selectingRegion.click();
		sleep(2000);

		// selecting Region from the dropdown
		WebElement selectingRegionFromDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[15]"));
		selectingRegionFromDropdown.click();
		sleep(2000);

		// Selecting VPC Import Dropdown
		WebElement selectingVpcDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[2]/div[4]/div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
		selectingVpcDropdown.click();
		sleep(2000);

		// Wait for the item in the dropdown to be displayed 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		By successMessageLocator = By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));

		// Selecting VPC from Dropdown
		WebElement selectingVpcFromDropdown = driver
				.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
		selectingVpcFromDropdown.click();
		sleep(2000);

		// Click on Import Button
		WebElement selectImportButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		selectImportButton.click();
		sleep(2000);

		// Validation

		// Wait for the "Success" message to be displayed
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(300));
		By successMessageLocator2 = By.xpath(
				"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p");
		WebElement successMessage2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator2));

		WebElement createdEnvironment = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[1]/p"));
		String expectedEnvironment = "Imported-ENV-DEV";
		String actualEnvironment = createdEnvironment.getText();

		WebElement statusOfCreatedEnvironment = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p"));
		String expectdedStatusOfCreatedEnvironment = "Success";
		String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();

		Assert.assertTrue(
				actualEnvironment.contains(expectedEnvironment)
						&& actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
				"Environment and status were not created successfully. \nActual environment: " + actualEnvironment
						+ "\nExpected environment: " + expectedEnvironment + "\nActual status: "
						+ actualStatusOfCreatedEnvironment + "\nExpected status: "
						+ expectdedStatusOfCreatedEnvironment);

		System.out.println("Environment is successfully created");

	}

	// Test case :2 Importing Environment which is already present
	@Test(priority=2)
	public void ImportingEnvironmentWithExistingName() {

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
		System.out.println("Test case :2 Importing Environment which is already present");
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
		
		System.out.println("Importing Environment which is already present");

		// Click on the Environment Tab
		WebElement clickOnEnvironmentTab = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
		clickOnEnvironmentTab.click();

		sleep(2000);

		// Select Import Environment
		WebElement clickOnImportEnvironmentTab = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[1]"));
		clickOnImportEnvironmentTab.click();

		sleep(2000);
		// Enter Valid Environment Name
		WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
		enterEnvironmentName.sendKeys("Imported-ENV-DEV");
		sleep(2000);
		// Select Type as Non Production
		WebElement selectingTypeASNonProd = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[2]/div/button[1]"));
		selectingTypeASNonProd.click();
		sleep(2000);
		// Click on the Region Dropdown
		WebElement selectingRegion = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[3]/div/div/div"));
		selectingRegion.click();
		sleep(2000);

		// selecting Region from the dropdown
		WebElement selectingRegionFromDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[15]"));
		selectingRegionFromDropdown.click();
		sleep(2000);

		// Selecting VPC Import Dropdown
		WebElement selectingVpcDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[2]/div[4]/div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
		selectingVpcDropdown.click();
		sleep(2000);

		// Wait for the VPC list to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		By successMessageLocator = By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[@role='option']");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));

		// Selecting VPC from Dropdown
		WebElement selectingVpcFromDropdown = driver
				.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[@role='option']"));
		selectingVpcFromDropdown.click();
		sleep(2000);

		// Click on Import Button
		WebElement selectImportButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		selectImportButton.click();
		sleep(2000);

		// Validation

		WebElement errorMessage = driver.findElement(By.className("MuiAlert-message"));
		String expectedErrorMessage = "Same name environment is already exist";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
						+ expectedErrorMessage);

	}

	// Test Case 3: Keeping Environment Text Field Empty

	@Test(priority=3)
	public void EnvironmentNameEmpty() {

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
		System.out.println("Test Case 3: Keeping Environment Text Field Empty");
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
		
		System.out.println("Keeping Environment Text Field Empty");

		// Click on the Environment Tab
		WebElement clickOnEnvironmentTab = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
		clickOnEnvironmentTab.click();

		sleep(2000);

		// Select Import Environment
		WebElement clickOnImportEnvironmentTab = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[1]"));
		clickOnImportEnvironmentTab.click();

		sleep(2000);
		// Enter Valid Environment Name
		WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
		enterEnvironmentName.sendKeys("");
		sleep(2000);
		// Select Type as Non Production
		WebElement selectingTypeASNonProd = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[2]/div/button[1]"));
		selectingTypeASNonProd.click();
		sleep(2000);
		// Click on the Region Dropdown
		WebElement selectingRegion = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[3]/div/div/div"));
		selectingRegion.click();
		sleep(2000);

		// selecting Region from the dropdown
		WebElement selectingRegionFromDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[15]"));
		selectingRegionFromDropdown.click();
		sleep(2000);

		// Selecting VPC Import Dropdown
		WebElement selectingVpcDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[2]/div[4]/div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
		selectingVpcDropdown.click();
		sleep(2000);

		// Wait for the VPC list to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		By successMessageLocator = By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[@role='option']");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));

		// Selecting VPC from Dropdown
		WebElement selectingVpcFromDropdown = driver
				.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[@role='option']"));
		selectingVpcFromDropdown.click();
		sleep(2000);

		// Click on Import Button
		WebElement selectImportButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		selectImportButton.click();
		sleep(2000);

		// Validation

		WebElement errorMessage = driver.findElement(By.className("MuiFormHelperText-root"));
		String expectedErrorMessage = "Invalid environment name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
						+ expectedErrorMessage);
		
		driver.close();

	}

	// Test Case 4: Keeping Region Text Field empty
	@Test(priority=4)
	public void RegionTextFieldEmpty() {

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
		System.out.println("Test Case 4: Keeping Region Text Field empty");
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
		System.out.println("Keeping Region Text Field empty");

		// Click on the Environment Tab
		WebElement clickOnEnvironmentTab = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
		clickOnEnvironmentTab.click();

		sleep(2000);

		// Select Import Environment
		WebElement clickOnImportEnvironmentTab = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[1]"));
		clickOnImportEnvironmentTab.click();

		sleep(2000);
		// Enter Valid Environment Name
		WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
		enterEnvironmentName.sendKeys("Staging");
		sleep(2000);
		// Select Type as Non Production
		WebElement selectingTypeASNonProd = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[2]/div/button[1]"));
		selectingTypeASNonProd.click();
		sleep(2000);

		// Click on Import Button
		WebElement selectImportButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		selectImportButton.click();
		sleep(2000);

		// Validation

		WebElement errorMessage = driver.findElement(By.className("MuiFormHelperText-root"));
		String expectedErrorMessage = "Please select a region";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
						+ expectedErrorMessage);
		driver.close();

	}

	// Test Case:5 Importing Environment for PROD Type
	@Test(priority=5)
	public void ImportingEnvironmentForProd() {

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
		System.out.println("Test Case:5 Importing Environment for PROD Type");
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
		System.out.println("Importing Environment for PROD Type");

		// Click on the Environment Tab
		WebElement clickOnEnvironmentTab = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
		clickOnEnvironmentTab.click();

		sleep(2000);

		// Select Import Environment
		WebElement clickOnImportEnvironmentTab = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[1]"));
		clickOnImportEnvironmentTab.click();

		sleep(2000);
		// Enter Valid Environment Name
		WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
		enterEnvironmentName.sendKeys("AT-Imported-ENV-Prod");
		sleep(2000);

		// Select Type as Production
		WebElement selectingTypeASNonProd = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[2]/div/button[2]"));
		selectingTypeASNonProd.click();
		sleep(2000);

		// selecting Region Dropdown
		WebElement selectingRegion = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[3]/div/div/div"));
		selectingRegion.click();
		sleep(2000);

		// selecting Region from the dropdown
		WebElement selectingRegionFromDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[15]"));
		selectingRegionFromDropdown.click();
		sleep(2000);

		// Selecting VPC Import Dropdown
		WebElement selectingVpcDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[2]/div[4]/div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
		selectingVpcDropdown.click();
		sleep(2000);

		// Wait for the VPC to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		By successMessageLocator = By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[@role='option']");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));

		// Selecting VPC from Dropdown
		WebElement selectingVpcFromDropdown = driver
				.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[@role='option']"));
		selectingVpcFromDropdown.click();
		sleep(2000);

		// Click on Import Button
		WebElement selectImportButton = driver.findElement(By.xpath(
				"/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		selectImportButton.click();
		sleep(2000);

		// Validation

		// Wait for the "Success" message to be displayed
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(300));
		By successMessageLocator2 = By.xpath(
				"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[4]/p");
		WebElement successMessage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator2));

		WebElement createdEnvironment = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[1]/p"));
		String expectedEnvironment = "AT-Imported-ENV-Prod";
		String actualEnvironment = createdEnvironment.getText();

		WebElement statusOfCreatedEnvironment = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[2]/div[4]/p"));
		String expectdedStatusOfCreatedEnvironment = "Success";
		String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();

		Assert.assertTrue(
				actualEnvironment.contains(expectedEnvironment)
						&& actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
				"Environment and status were not created successfully. \nActual environment: " + actualEnvironment
						+ "\nExpected environment: " + expectedEnvironment + "\nActual status: "
						+ actualStatusOfCreatedEnvironment + "\nExpected status: "
						+ expectdedStatusOfCreatedEnvironment);

		System.out.println("Environment is successfully created");
		
		driver.close();

	}

	
	// Test Case 6 Keeping Public Subnet Text Box Empty

	@Test(priority=6)
	public void TestingForEmptyPublicSubnetsTextBox() {

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
		System.out.println("Test Case 6 Keeping Public Subnet Text Box Empty");
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
		System.out.println("Keeping Public Subnet Text Box Empty");

		// Click on the Environment Tab
		WebElement clickOnEnvironmentTab = driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[2]"));
		clickOnEnvironmentTab.click();

		sleep(2000);

		// Select Import Environment
		WebElement clickOnImportEnvironmentTab = driver.findElement(By.xpath(
				"/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div/div[1]/button[1]"));
		clickOnImportEnvironmentTab.click();

		sleep(2000);
		// Enter Valid Environment Name
		WebElement enterEnvironmentName = driver.findElement(By.className("MuiInputBase-input"));
		enterEnvironmentName.sendKeys("Empty-Public-Subnet");
		sleep(2000);

		// Select Type as Non Production
		WebElement selectingTypeASNonProd = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]/div[2]/div[2]/div/button[1]"));
		selectingTypeASNonProd.click();
		sleep(2000);

		// selecting Region Dropdown
		WebElement selectingRegion = driver
				.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/div[2]/div[3]/div/div/div"));
		selectingRegion.click();
		sleep(2000);

		// selecting Region from the dropdown
		WebElement selectingRegionFromDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]//div[@role='presentation']//ul[@role='listbox']/li[5]"));
		selectingRegionFromDropdown.click();
		sleep(2000);

		// Selecting VPC Import Dropdown
		WebElement selectingVpcDropdown = driver.findElement(By.xpath(
				"/html/body/div[@role='presentation']/div[3]/div[2]/div[4]/div[@class='MuiFormControl-root css-13sljp9']/div/div[@role='button']"));
		selectingVpcDropdown.click();
		sleep(2000);

		// Wait for the VPC to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		By successMessageLocator = By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]");
		WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));

		// Selecting VPC from Dropdown
		WebElement selectingVpcFromDropdown = driver
				.findElement(By.xpath("//div[@id='menu-']//ul[@role='listbox']/li[2]"));
		selectingVpcFromDropdown.click();
		sleep(2000);
		
		//Clicking on Import Environment Button
		WebElement clickOnImportEnvironmentButton = driver
				.findElement(By.xpath("/html//div[@role='presentation']/div[3]//div[@class='Drawer_headerBtnContainer__NGrfg']/button[2]"));
		clickOnImportEnvironmentButton.click();
		sleep(2000);
		
		// Validation

		WebElement errorMessage = driver.findElement(By.className("MuiFormHelperText-root"));
		String expectedErrorMessage = "Please select at least one public subnet";
		String actualErrorMessage = errorMessage.getText();

		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
						+ expectedErrorMessage);
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
