package TestSuites;

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

public class TestCase01 {

	
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
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("Password234");
		 
		 
		 //Take snapshot
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\loginTest1\\01"+driver.getTitle()+".png");

		 FileUtils.copyFile(source, screenshotName);


		 Reporter.log("<br><img src='"+screenshotName+"' height='400' width='850'/><br>");

		 
	 }
	
	@Test(priority=4,dependsOnMethods="cPasswordInputField",description="This test is to verify if Login button in Login page is enabled")
	
	public void dLoginButton() throws IOException
	
	{
		WebDriverWait wait=new WebDriverWait(driver,40);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button"))));
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")).isEnabled());
		
		Reporter.log("----------------Asserted--Login button is enabled------------------");
		
		//Click on Login
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")).click();
		
		 WebDriverWait wait1 = new WebDriverWait(driver,40);
		 
		 WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[2]/div/a/button")));
		 
		Reporter.log("--------------------------------------Log in is successful--------------------------");
		
		 //Take snapshot
		 File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName1 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\loginTest1\\02"+driver.getTitle()+".png");

		 FileUtils.copyFile(source1, screenshotName1);


		 Reporter.log("<br><img src='"+screenshotName1+"' height='400' width='850'/><br>");

		
	}
	
	
	@Test(priority=5,dependsOnMethods="dLoginButton",description="This test is to verify if user can successfully Logout")
	
	public void eLogout() throws IOException
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver,40);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]"))));
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]")).isEnabled());
		
		Reporter.log("-------------Assert: User's name is available in homescreen to click--------------------------");
		
		driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]")).click();
		
		 //Take snapshot
		 File source11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName11 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\loginTest1\\03"+driver.getTitle()+".png");

		 FileUtils.copyFile(source11, screenshotName11);


		 Reporter.log("<br><img src='"+screenshotName11+"' height='400' width='850'/><br>");
		
		 //Logout
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/div/div/ul/div/a")).click();
		
		WebDriverWait wait1=new WebDriverWait(driver,40);
		WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/h4"))));
		
				
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/h4")).isDisplayed());
		
		Reporter.log("---------------------Asserted:--Log out is successful---------------------------------");
		
		//Take snapshot
		 File source111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\loginTest1\\04"+driver.getTitle()+".png");

		 FileUtils.copyFile(source111, screenshotName111);


		 Reporter.log("<br><img src='"+screenshotName111+"' height='400' width='850'/><br>");
		
		 driver.quit();
		 
		 
		
	}
	
	
	
	
	
	
	
	
	
	
}
