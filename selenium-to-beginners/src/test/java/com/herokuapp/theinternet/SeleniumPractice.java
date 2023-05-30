package com.herokuapp.theinternet;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumPractice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");//opens the URL
	System.out.println(driver.getTitle());//returns title of the page
	System.out.println(driver.getCurrentUrl());//returns the URL of the page
	String text=driver.findElement(By.xpath("//div[@id='mainContent']/h1[.='Webdriver Commands Example']")).getText();
	//get.Text() --> returns the value present on the element
	
	System.out.println(text);
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------	
	
	//Basic Commands to close Window
	driver.close();  //close one window
	driver.quit();  //--closes multiple windows
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------		
	
	//Basic Commands to navigate from one page to another
	driver.navigate().to("");
	driver.navigate().back("");
	driver.navigate().forward("");
	driver.navigate().refresh("");
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------		
	//Conditional Commands
	isDisplayed(); //checks whether the element is displayed on the page or not,,if displayed it returns true else returns false
	isEnabled();  //Always used for text box,checks whether the textBox is displayed on the page or not,,if enabled it returns true else returns false
	isSelected(); //Always used for radio buttons ,checks whether the radio buttons is selected on the page or not,,if radio buttons is enabled  it returns true else returns false
	//eg:1   System.out.println=driver.findElement(By.xpath("")).isDisplayed(); ==>returns true if displayed else returns false
//--------------------------------------------------------------------------------------------------------------------------------------------------	
	//Locators
	id
	name
	linktext
	cssselector
	xpath
//---------------------------------------------------------------------------------------------------------------------------------------------------	
	
	//Clear the content from the Text Field
	WebElement includeDirectory = driver.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]/main/div[2]/div[2]/div/div/input"));
	includeDirectory.sendKeys(Keys.CONTROL, "a",Keys.DELETE);

	includeDirectory.sendKeys("usr/bin");
	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
	//You can scroll  to the particular element  of a page using the following code in Selenium:
	
	WebElement element = driver
			.findElement(By.xpath("/html/body/div[@role='presentation']/div[3]//span[.='Amazon VPC CNI']"));
	sleep(1000);
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("arguments[0].scrollIntoView(false)", element);
	sleep(2000);
	
	//Scroll back to top of the page
	JavascriptExecutor je = (JavascriptExecutor) driver;
	je.executeScript("window.scrollTo(0, 0)");
	
	// Scroll till the web Element is Visible
			JavascriptExecutor je = (JavascriptExecutor) driver;
			WebElement element3 = driver
					.findElement(By.xpath("/html//div[@role='presentation']/div[3]//p[.='Add-On Agents']"));
			sleep(1000);
			je.executeScript("arguments[0].scrollIntoView(true)", element3);
			sleep(1000);
	
	
//---------------------------------------------------------------------------------------------------------------------------------------------------		
	
	
	// Validation

			WebElement errorMessage = driver
					.findElement(By.xpath("/html//p[@id=':r1r:-helper-text']"));
			String expectedErrorMessage = "Invalid cluster name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
			String actualErrorMessage = errorMessage.getText();

			Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
			"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
			+ expectedErrorMessage);
			
//---------------------------------------------------------------------------------------------------------------------------------------------------
		//Locators:	
			
			//Locating by the Link Text
			webElement element=driver.findElement(By.linkText("Register")).click();
			
			//Locators with CSS Selector-Tag & ID,,,, input==>tag name,,,,email==>id
			webElement element=driver.findElement(By.cssSelector("TAGNAME#id")).sendKeys("pavan123@gmail.com");
			
			//Locators with tag & class
			webElement element=driver.findElement(By.cssSelector("TAGNAME.className")).sendKeys("pavan123@gmail.com");
			
			////Locators with tag & Attribute  ,,input==>tagname,,, [name=lastName] is attribute
			webElement element=driver.findElement(By.cssSelector("input[name=lastName]")).sendKeys("kumar");
			
			//Locators with Tag,class & attribute,,attribute to be mentioned inside Square bracket,,input is tag Name and .inputtext is class name
			webElement element=driver.findElement(By.cssSelector("input.inputtext[tabindex=2]").sendkeys("xxxxx");
			
			//Locators with CSS Selector--Inner Text ,,,font: is tag name
			webElement element=driver.findElement(By.cssSelector("font:contains("Password:")");
			
			//Locating by ID,,,,email==>id value
			webElement element=driver.findElement(By.id("email")).sendKeys("pavan12@gmail.com");
			
			//Locating by the name
			webElement element=driver.findElement(By.name("userName")).sendKeys("mercury");
			
			//Handling mouse clicks
			WebElement button=driver.findElement(By.xpath(""));
			
			Actions act=new Actions(driver);
			
			act.contextClick(button).perform(); //Right click Action
			
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
			//Scrolling Example
			
		//// Select Instance Type
			WebElement clickOnSpotInstanceType= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[6]/div[3]/div//input[@role='combobox']"));
			clickOnSpotInstanceType.click();
			sleep(1000);
			
			
			//Scrolling till the Element is Visible(C4.4xlarge)
			WebElement element2 = driver
					.findElement(By.xpath("//body/div[3]//ul[@role='listbox']/div[21]/div"));
			sleep(1000);
			je.executeScript("arguments[0].scrollIntoView(false)", element2);
			sleep(2000);
			
			
			//select c 4.4xlarge Instance type
			WebElement clickOnSpotInstance2 = driver
					.findElement(By.xpath("//body/div[3]//ul[@role='listbox']/div[21]/div"));
			clickOnSpotInstance2.click();
			
			sleep(2000);
			
			
	//------------------------------------------------------------------------------------------------------------------------------------------------		
			
			// Wait for the "Success" message to be displayed
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
			By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p[text()='Success']");
			WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
			
//---------------------------------------------------------------------------------------------------------------------------------------------------			
		//Setting Sleep
			private void sleep(long m) {
				try {
					Thread.sleep(m);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
//---------------------------------------------------------------------------------------------------------------------------------------------------			
			
			//Waiting and Validating Environment creation 
			
			// Wait for the "Success" message to be displayed
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
			By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p[text()='Success']");
			WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
			
			
			// Validation

					// Wait for the "Success" message to be displayed
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
					By successMessageLocator = By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p[text()='Success']");
					WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(successMessageLocator));
		
					
					//check for the created Environment Name
					WebElement createdEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[1]/p"));
					String expectedEnvironment = "AT-ENV-ONE-Dev";
					String actualEnvironment = createdEnvironment.getText();
					
					//check for the created Status
					WebElement statusOfCreatedEnvironment = driver
							.findElement(By.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[@role='row']/div[4]/p"));
					String expectdedStatusOfCreatedEnvironment = "Success";
					String actualStatusOfCreatedEnvironment = statusOfCreatedEnvironment.getText();
					
					
			


			Assert.assertTrue(actualEnvironment.contains(expectedEnvironment) && actualStatusOfCreatedEnvironment.contains(expectdedStatusOfCreatedEnvironment),
					"Environment and status were not created successfully. \nActual environment: " + actualEnvironment + "\nExpected environment: " + expectedEnvironment + "\nActual status: " + actualStatusOfCreatedEnvironment + "\nExpected status: " + expectdedStatusOfCreatedEnvironment);

		
			System.out.println("Environment is successfully created");
	///========================================================================================================================================		
			
			//Validating Whether Type and Region on the page  is Visible or Not
			
			// Define an array of texts to locate
			String[] textsToLocate = {"Non Production","London (eu-west-2)","vpc-0ffa4871a65942e8b"};

			// Iterate over each text and perform validation
			for (String text : textsToLocate) {
			    // Locate the element based on the XPath containing the specific text
			    WebElement element = driver.findElement(By.className("MuiTypography-root"));

			    // Check if the element is present
			    if (element.isDisplayed()) {
			        System.out.println("Text '" + text + "' is present on the page.");
			    } else {
			        System.out.println("Text '" + text + "' is not present on the page.");
			    }
			}
			
			
			
	///=========================================================================================================================================		
			
			// Wait for the VPC ID to be displayed
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
			By vpcIdToBeDisplayed = By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//p[.='vpc-0ffa4871a65942e8b']");
			WebElement vpcIdPresentOnThePage = wait.until(ExpectedConditions.visibilityOfElementLocated(vpcIdToBeDisplayed));
			
			
			
			
			//Validating Whether Type,VPC-ID and Region  is Visible or Not on the page
			
			// Define an array of texts to locate
			String[] textsToLocate = {"Non Production","London (eu-west-2)","vpc-0ffa4871a65942e8b"};

			// Iterate over each text and perform validation
			for (String text : textsToLocate) {
			    // Locate the element based on the XPath containing the specific text
			    WebElement element = driver.findElement(By.className("MuiTypography-root"));

			    // Check if the element is present
			    if (element.isDisplayed()) {
			        System.out.println("Text '" + text + "' is present on the page.");
			    } else {
			        System.out.println("Text '" + text + "' is not present on the page.");
			    }
			}
			sleep(2000);
			
			//To validate Whether  Public and Private Subnets are Visible or not
			// Define an array of texts to locate
					String[] subnetsToLocate = {"subnet-05394b212ea127730","subnet-0290f016018e07082"};

					// Iterate over each text and perform validation
					for (String text : subnetsToLocate) {
					    // Locate the element based on the XPath containing the specific text
					    WebElement element = driver.findElement(By.className("MuiChip-label"));

					    // Check if the element is present
					    if (element.isDisplayed()) {
					        System.out.println("Text '" + text + "' is present on the page.");
					    } else {
					        System.out.println("Text '" + text + "' is not present on the page.");
					    }
					}
			
			
					sleep(2000);
					
					
					
					
					
					
					//List<WebElement> dynamicElements = driver.findElements(By.xpath("//p[@class='dynamic-text']"));
					WebElement element = driver.findElement(By.className("MuiTypography-root"));
					
					// Iterate over each dynamic element and print its text
					for (WebElement element : dynamicElements) {
					    String dynamicText = element.getText();
					    System.out.println("Dynamic Text: " + dynamicText);
					}
					
					
					
					
					
	//=======================================================================================================================================
			
	}
	
	
	package com.herokuapp.theinternet;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class DevSecOps {
		
		private WebDriver driver;
		
		@BeforeMethod(alwaysRun=true)
		private void setUp() {
			System.out.println("Logging in With  Username and Password Test");
			// Create driver
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			 driver = new ChromeDriver();

			// sleep for 3 seconds
			sleep(3000);

			// maximize browser window
			driver.manage().window().maximize();
			
		}
		
		@Test(priority=1,enabled=true)
		public void loginPage()
		{
			
		

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
			
			driver.quit();
		}
		
		
		@Test(priority=2,groups= {"smokeTests"})
		public void createUser()
		{
			
			//Navigate to Users Page
			  String url1 = "https://dashboard.optiq.ai/users"; 
			  driver.get(url1);
			  System.out.println("Page routed to users");
			  
			  sleep(2000);
			  
			
			
			  // click on Create User Button for 1st Iteration
			  
			  WebElement createUserButton = driver.findElement(By.xpath(
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
			  
	//=============================================================================================================================================		  
				//Important Validation Type:1 
			  
				//For Text: Validating Whether  Type is visible or not
				
				WebElement locatingText = driver
						.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div[2]/div/div[2]/p[.='Non Production']"));
				String expectedText = "Non Production";
				String actualText = locatingText.getText();
		
				Assert.assertTrue(actualText.contains(expectedText),
				"Expected Element Non Production is not Present. \nActual: " + actualText+ "\nExpected: "
				+expectedText);
				
				sleep(2000);
			  
			  
				//For Error Message: Validation

				WebElement errorMessage = driver
						.findElement(By.xpath("/html//p[@id=':r1r:-helper-text']"));
				String expectedErrorMessage = "Invalid cluster name. Use only alphabets, numbers and '-' with the first and last characters being alphabets.";
				String actualErrorMessage = errorMessage.getText();

				Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
				"Actual error message does not contain expected. \nActual: " + actualErrorMessage + "\nExpected: "
				+ expectedErrorMessage);
			  
			  
			  
			  //Validation Based On ClassName
				String[] subnetsToLocate = {"Monitoring: \r\n"
						+ "\r\n"
						+ "Cloud Watch","Logging: \r\n"
								+ "\r\n"
								+ "Cloud Watch"};

				// Iterate over each text and perform validation
				for (String text : subnetsToLocate) {
				    // Locate the element based on the XPath containing the specific text
				    WebElement element = driver.findElement(By.className("MuiTypography-root"));

				    // Check if the element is present
				    if (element.isDisplayed()) {
				        System.out.println("Text '" + text + "' is present on the page.");
				    } else {
				        System.out.println("Text '" + text + "' is not present on the page.");
				    }
				}
		
		
				sleep(2000);
			  
			  
			  
			  
			  
			  
			  //Important Validation Type 2
				
				Map<String, String> xpathTextMap = new HashMap<>();
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']", "At-Dev");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Elastic Container Service (ECS)']", "Elastic Container Service (ECS)");
				

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

}

