package com.herokuapp.theinternet;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPage {

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
		String url = "https://dashboard-stg.optiq.ai/login";
		driver.get(url);
		System.out.println("Page is Opened");

		// sleep for 1 seconds
		sleep(1000);

		// enter username
		WebElement username = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[1]/div/input"));
		username.sendKeys("mkg243001@gmail.com");

		sleep(1000);

		// enter password
		WebElement password = driver.findElement(By.xpath("/html//div[@id='inputsContainer']/div[2]/div/input"));
		password.sendKeys("manoj@123");

		sleep(1000);

		// click login button

		WebElement logInButton = driver.findElement(By.xpath(
				"//div[@id='root']//div[@class='Login_buttonContainer__+XM5o MuiBox-root css-0']/button[@type='submit']"));
		logInButton.click();

		sleep(2000);
		
		
		// Click on the Cluster  Tab
		WebElement clickOnEnvironmentTab=driver.findElement(By
				.xpath("/html//div[@id='root']//div[@class='MuiTabs-root css-12h56es']/div/div[@role='tablist']/a[3]"));
		clickOnEnvironmentTab.click();
		sleep(2000);
		
		
		//Click on Created Cluster Row
		WebElement clickOnCreatedClusterRow=driver.findElement(By
				.xpath("//div[@id='root']//div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//div[@role='grid']//div[@class='MuiDataGrid-virtualScroller css-1grl8tv']/div[@class='MuiDataGrid-virtualScrollerContent css-0']/div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']/div[3]/div[1]/p"));
		clickOnCreatedClusterRow.click();
		
		sleep(3000);
//		MuiTypography-root
		

		
		
		
		
		
//		boolean isElementDisplayed = driver.findElement(By.className("MuiTypography-root")).isDisplayed();
//		Assertions.assertTrue(isElementDisplayed, "The Element is not displayed on the page");
		
//		//Validating Whether  Type is visible or not
//		
//		WebElement locatingText = driver
//				.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]/div/div[2]/div/div[2]/p[.='Non Production']"));
//		String expectedText = "Non Production";
//		String actualText = locatingText.getText();
//
//		Assert.assertTrue(actualText.contains(expectedText),
//		"Expected Element Non Production is not Present. \nActual: " + actualText+ "\nExpected: "
//		+expectedText);
		
//		sleep(2000);
		
		
//		// Wait for the VPC ID to be displayed
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
//		By vpcIdToBeDisplayed = By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[3]//p[.='vpc-0ffa4871a65942e8b']");
//		WebElement vpcIdPresentOnThePage = wait.until(ExpectedConditions.visibilityOfElementLocated(vpcIdToBeDisplayed));
//		
		
		
		
//		//Validating Whether Type,VPC-ID and Region  is Visible or Not on the page
//		
//		// Define an array of texts to locate
//		String[] textsToLocate = {"Non Production","London (eu-west-2)","vpc"};
//
//		// Iterate over each text and perform validation
//		for (String text : textsToLocate) {
//		    // Locate the element based on the XPath containing the specific text
//		    WebElement element = driver.findElement(By.className("MuiTypography-root"));
//
//		    // Check if the element is present
//		    if (element.isDisplayed()) {
//		        System.out.println("Text '" + text + "' is present on the page.");
//		    } else {
//		        System.out.println("Text '" + text + "' is not present on the page.");
//		    }
//		}
//		sleep(2000);
//////		
		//To validate Whether  Public and Private Subnets are Visible or not
		// Define an array of texts to locate
//				String[] subnetsToLocate = {"Monitoring: \r\n"
//						+ "\r\n"
//						+ "Cloud Watch","Logging: \r\n"
//								+ "\r\n"
//								+ "Cloud Watch","Cluster Auto Scaling: \r\n"
//										+ "\r\n"
//										+ "AWS Auto Scaler","Pod Auto Scaling: \r\n"
//												+ "\r\n"
//												+ "HPA"};
//
//				// Iterate over each text and perform validation
//				for (String text : subnetsToLocate) {
//				    // Locate the element based on the XPath containing the specific text
//				    WebElement element = driver.findElement(By.className("MuiTypography-root"));
//
//				    // Check if the element is present
//				    if (element.isDisplayed()) {
//				        System.out.println("Text '" + text + "' is present on the page.");
//				    } else {
//				        System.out.println("Text '" + text + "' is not present on the page.");
//				    }
//				}
//		
//		
//				sleep(2000);
		
		
//		boolean isDisplayed = driver.findElement(By.className("MuiTypography-root")).isDisplayed();
//		
//		if(isDisplayed) {
//			System.out.println("Element is Displayed");
//		}else
//		{
//			System.out.println("Element is not Displayed ");
//		}
	
//		sleep(4000);
//		
//		WebElement element = driver.findElement(By.className("css-pyltgz")); // Replace "..." with the appropriate XPath expression to locate the element
//		int expectedLength = 21;
//
//		String text = element.getText();
//		int actualLength = text.length();
//
//		Assert.assertEquals(actualLength, expectedLength, "Text length does not match the expected length.");

		
//		// Validation
//		WebElement environmentText = driver.findElement(By.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']"));
//		String expectedText = "At-Dev";
//		String actualText = environmentText.getText();
//
//		if (actualText.contains(expectedText)) {
//		    System.out.println("Expected Environment At-Dev is Displayed on the Web Page");
//		    System.out.println("Actual: " + actualText);
//		    System.out.println("Expected: " + expectedText);
//		}
//
//		Assert.assertTrue(actualText.contains(expectedText),
//		        "Expected Environment At-Dev is not  Displayed on the Web Page. \nActual: " + actualText + "\nExpected: " + expectedText);

		//Validation type1
		
//		Map<String, String> expectedTextMap = new HashMap<>();
//		expectedTextMap.put("At-Dev", "/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']");
//		expectedTextMap.put("At-Stage", "/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Stage']");
//		expectedTextMap.put("At-Prod", "/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Prod']");
//
//		for (Map.Entry<String, String> entry : expectedTextMap.entrySet()) {
//		    String expectedText = entry.getKey();
//		    String xpathExpression = entry.getValue();
//
//		    WebElement environmentText = driver.findElement(By.xpath(xpathExpression));
//		    String actualText = environmentText.getText();
//
//		    if (actualText.contains(expectedText)) {
//		        System.out.println("Expected Environment " + expectedText + " is Displayed on the Web Page");
//		        System.out.println("Actual: " + actualText);
//		        System.out.println("Expected: " + expectedText);
//		    }
//
//		    Assert.assertTrue(actualText.contains(expectedText),
//		            "Expected Environment " + expectedText + " is not Displayed on the Web Page. \nActual: " + actualText + "\nExpected: " + expectedText);
//		}
//	
		
		
//		//Validation Type 2
//		
//		Map<String, String> xpathTextMap = new HashMap<>();
//		xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']", "At-Dev");
//		xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Elastic Kubernetes Service (EKS)']", "Elastic Kubernetes Service (EKS)");
//		xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[1]/p[.='Cloud Watch']", "Monitoring: \r\n"
//				+ "\r\n"
//				+ "Cloud Watch");
//		xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[2]/p[.='Cloud Watch']", "Logging: \r\n"
//				+ "\r\n"
//				+ "Cloud Watch");
//		xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Cluster Auto Scaling: ']", "Cluster Auto Scaling: \r\n"
//				+ "\r\n"
//				+ "AWS Auto Scaler");
//		
//		xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Pod Auto Scaling: ']", "Pod Auto Scaling: \r\n"
//				+ "\r\n"
//				+ "HPA");
//
//		for (Map.Entry<String, String> entry : xpathTextMap.entrySet()) {
//		    String xpathExpression = entry.getKey();
//		    String expectedText = entry.getValue();
//
//		    WebElement element = driver.findElement(By.xpath(xpathExpression));
//		    String actualText = element.getText();
//
//		    if (actualText.contains(expectedText)) {
//		        System.out.println("Expected Text: " + expectedText + " is displayed on the web page.");
//		        System.out.println("Actual: " + actualText);
//		        System.out.println("Expected: " + expectedText);
//		    }
//
//		    Assert.assertTrue(actualText.contains(expectedText),
//		            "Expected Text: " + expectedText + " is not displayed on the web page. \nActual: " + actualText + "\nExpected: " + expectedText);
//		}

		
				
				//Validation:1, to check whether the elements are displayed on the web page or not i.e Environment and Deployment Agent
				
				//Important Validation Type 2
				
				Map<String, String> xpathTextMap = new HashMap<>();
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[3]/p[.='At-Dev']", "At-Dev");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Elastic Kubernetes Service (EKS)']", "Elastic Kubernetes Service (EKS)");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Monitoring: ']", "Monitoring:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[1]/p[.='Cloud Watch']", "Cloud Watch");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Logging: ']", "Logging:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[7]/div[2]/p[.='Cloud Watch']", "Cloud Watch");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Cluster Auto Scaling: ']", "Cluster Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='AWS Auto Scaler']", "AWS Auto Scaler");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='Pod Auto Scaling: ']", "Pod Auto Scaling:");
				xpathTextMap.put("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]//p[.='HPA']", "HPA");

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
			  
				
				
				sleep(2000);
				
//Validation:2, to check whether the Instances are being displayed or not on the Page
				
				//Click on Node Groups to Varify
				WebElement clickOnNodeGroupDropDown=driver.findElement(By
						.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[@role='button']//p[.='(On-Demand)']"));
				clickOnNodeGroupDropDown.click();
				
				sleep(3000);
				//Important Validation Type 2
				
				Map<String, String> xpathTextMap2 = new HashMap<>();
				xpathTextMap2.put("/html//input[@id=':rl:']", "1");
				xpathTextMap2.put("/html//input[@id=':rm:']", "10");
				xpathTextMap2.put("/html//input[@id=':rn:']", "5");
				xpathTextMap2.put("/html//input[@id=':ro:']", "23");
		

				for (Map.Entry<String, String> entry : xpathTextMap2.entrySet()) {
				    String xpathExpression = entry.getKey();
				    String expectedInstanceValue = entry.getValue();

				    WebElement element = driver.findElement(By.xpath(xpathExpression));
				    String actualInstanceValue = element.getAttribute("value");

				    if (actualInstanceValue.contains(expectedInstanceValue)) {
				        System.out.println("Expected Instance: " + expectedInstanceValue + " is displayed on the web page.");
				        System.out.println("Actual Instance: " + actualInstanceValue);
				        System.out.println("Expected Instance: " + expectedInstanceValue);
				    }

				    Assert.assertTrue(actualInstanceValue.contains(expectedInstanceValue),
				            "Expected Instance Value: " + expectedInstanceValue + " is not displayed on the web page. \nActual: " + actualInstanceValue + "\nExpected: " + expectedInstanceValue);
				}

				
				
				
				
				
				
				
				
				
				
				
//				//Validation:2, to check whether the elements are displayed on the web page or not  ,Monitoring Agent, Logging Agent, Cluster Auto Scaling and Pod Auto Scaling
//				String[] subnetsToLocate = {"Monitoring: \r\n"
//						+ "\r\n"
//						+ "Cloud Watch","Logging: \r\n"
//								+ "\r\n"
//								+ "Cloud Watch","Cluster Auto Scaling: \r\n"
//										+ "\r\n"
//										+ "AWS Auto Scaler","Pod Auto Scaling: \r\n"
//												+ "\r\n"
//												+ "HPA"};
//
//				// Iterate over each text and perform validation
//				for (String text : subnetsToLocate) {
//				    // Locate the element based on the XPath containing the specific text
//				    WebElement element = driver.findElement(By.className("MuiTypography-root"));
//
//				    // Check if the element is present
//				    if (element.isDisplayed()) {
//				        System.out.println("Text '" + text + "' is present on the page.");
//				    } else {
//				        System.out.println("Text '" + text + "' is not present on the page.");
//				    }
//				}
//		
//		
//				sleep(2000);
		
//				
//			//Validation :3 to Check Node Groups
//				
//				//Click on Node group DropDown
//				WebElement clickOnNodeGroupDropDown=driver.findElement(By
//						.xpath("/html//div[@id='root']/div[@class='MuiBox-root css-k008qs']/div[@class='MuiBox-root css-1rr4qq7']/div/div[4]/div/div[2]/div/div[6]/div/div[@role='button']/div[@class='MuiAccordionSummary-content MuiAccordionSummary-contentGutters css-17o5nyn']"));
//				clickOnNodeGroupDropDown.click();
//				
//				//Validation:2, to check whether the Node Groups are being Displayed or not on the Page
//				String[] instancesToLocate = {"1","10","5","23","25"};
//
//				// Iterate over each text and perform validation
//				for (String text :instancesToLocate) {
//				    // Locate the element based on the XPath containing the specific text
//				    WebElement element = driver.findElement(By.className("MuiInputBase-input"));
//
//				    // Check if the element is present
//				    if (element.isDisplayed()) {
//				        System.out.println("Instance '" + text + "' is present on the page.");
//				    } else {
//				        System.out.println("Instance '" + text + "' is not present on the page.");
//				    }
//				}
//		
//				
				
		
		
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
