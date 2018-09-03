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
	
	public void aStartBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		Reporter.log("---------------------Browser has started----------------");
		
	}
	
	
	
	 @Test(priority=2,dependsOnMethods="aStartBrowser",description="This test is to verify if Login page accepts username")
	 
	 public void bEmailInputField()
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
	 
	
	
	 @Test(priority=3,dependsOnMethods="bEmailInputField",description="This test is to verify if Login page accepts password")
	 
	 public void cPasswordInputField() throws IOException
	 
	 {
		 //Assert password field in Login page is enabled
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).isEnabled());
		 
		 Reporter.log("----------------Asserted--Password field in login page is enabled-----------------------");
		 
		 //Send values to password field
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("Password123");
		 
		 
		 //Take snapshot
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\loginTest1\\01"+driver.getTitle()+".png");

		 FileUtils.copyFile(source, screenshotName);


		 Reporter.log("<br><img src='"+screenshotName+"' height='400' width='850'/><br>");

		 
	 }
	
	@Test(priority=4,dependsOnMethods="cPasswordInputField",description="This test is to verify if Login button in Login page is enabled")
	
	public void dLoginButton() throws IOException
	
	{
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")).isEnabled());
		
		Reporter.log("----------------Asserted--Login button is enabled------------------");
		
		//Click on Login
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")).click();
		
		 WebDriverWait wait = new WebDriverWait(driver,40);
		 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[2]/div/a/button")));
		 
		
		 //Take snapshot
		 File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName1 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\loginTest1\\02"+driver.getTitle()+".png");

		 FileUtils.copyFile(source1, screenshotName1);


		 Reporter.log("<br><img src='"+screenshotName1+"' height='400' width='850'/><br>");

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
