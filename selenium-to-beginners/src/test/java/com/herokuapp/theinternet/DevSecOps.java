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
	
	@Test(priority=1)
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
