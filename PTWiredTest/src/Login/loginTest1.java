package Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class loginTest1 {

	
	WebDriver driver;
	
	@Test(priority=1)
	
	public void StartBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Reporter.log("---------------------Browser has started----------------");
		
	}
	
	
	
	 @Test(dependsOnMethods="StartBrowser",description="This test is to verify if Login page accepts username")
	 
	 public void EmailInputField()
	 {
		 
		 //Open url
		 driver.get("https://ptwired.ptwired.com/#/");
		 
		 //Maximize browser window
		 driver.manage().window().maximize();
		 
		 //Wait for login button to be clickable
		 
		 WebDriverWait wait = new WebDriverWait(driver,40);
		 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[1]/input")));
		 
		 //Assert Login Page, email address field is enabled
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[1]/input")).isEnabled());
		 
		 Reporter.log("-----------------Asserted--Email field in login page is enabled----------------------");
		 
		 //Send Values to field Login
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("veena@ptwired.com");
	 
		 
	 }
	 
	
	
	 @Test(dependsOnMethods="EmailInputField",description="This test is to verify if Login page accepts password")
	 
	 public void PasswordInputField() throws IOException
	 
	 {
		 //Assert pasword field in Login page is enabled
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).isEnabled());
		 
		 Reporter.log("----------------Asserted--Password field in login page is enabled");
		 
		 //Send values to password field
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("Password123");
		 
		 
		 //Take snapshot
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName = new File ("C:\\Users\\veenaramakrishnan\\git\\Coaching-Nexus\\CNX_TestSuites-QA\\Screenshots\\Suite02a\\01"+driver.getTitle()+".png");

		 FileUtils.copyFile(source, screenshotName);


		 Reporter.log("<br><img src='"+screenshotName+"' height='400' width='850'/><br>");

		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
