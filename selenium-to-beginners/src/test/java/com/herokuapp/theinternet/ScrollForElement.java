package com.herokuapp.theinternet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 

public class ScrollForElement {

	@Test(priority=2)
	public void scrolling()
	{	
		
		System.out.println("Logging in With  Username and Password Test");
		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "https://testng.org/doc/";
		driver.get(url);
		System.out.println("Page is Opened");
		
		
		sleep(5000);
		JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement element= driver.findElement (By.xpath("//body/ul[4]//a[@href='https://github.com/cbeust/testng/']"));
		je.executeScript("arguments[0].scrollIntoView(true)", element);
		
		WebElement clickTestNG = driver.findElement(By.xpath(
				"//body/ul[4]//a[@href='https://github.com/cbeust/testng/']"));
		clickTestNG.click();
		driver.quit();
	}
	
	@Test (priority=1, enabled=false)
	public void openingTheReactPage() {
		System.out.println("Starting LoginTest");
		// Create driver
		System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
				
				String url = "https://react.dev/";
				driver.get(url);
				System.out.println("Page is Opened");
				
				sleep(3000);

				
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



