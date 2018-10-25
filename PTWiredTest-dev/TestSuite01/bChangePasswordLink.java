package TestSuite01;

import java.io.File;
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
import org.testng.annotations.Test;

import junit.framework.Assert;

public class bChangePasswordLink {

	WebDriver driver;
	
	@Test(priority=6)
	
	public void aStartBrowser()
	{
		
		Reporter.log("This test case is to verify change password link is available in users profile page");
		
		Reporter.log("------------------------------------------------------------------------------");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		
		driver=new ChromeDriver();
	
		
	}
		
	 @Test(priority=7,dependsOnMethods="aStartBrowser",description="This test is to verify if Login page accepts username")
	 
	 public void bLogin()
	 {
		 
		 //Open url
		 driver.get("https://ptwired.ptwired.com/#/");
		 
		 //Maximize browser window
		 driver.manage().window().maximize();
		 
		 //Wait for login button to be clickable
		 
		 WebDriverWait wait = new WebDriverWait(driver,40);
		 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[1]/input")));
		 
		 //Send Values to field Login
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("veena@ptwired.com");
		 
		 //Send values to password field
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("Password234");
	 
		WebDriverWait wait1=new WebDriverWait(driver,40);
		WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button"))));
		
		//Click on Login
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")).click();
		
		 WebDriverWait wait11 = new WebDriverWait(driver,40);
		 
		 WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button")));
		
		 Reporter.log("---------------------Login is successful--------------------");
	}
	
	 @Test(priority=8,dependsOnMethods="bLogin",description="This test is to verify password reset in users profile page works")
	 
	 public void cMyProfilePage() throws IOException
	 
	 {
		WebDriverWait wait = new WebDriverWait(driver,40);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]"))));
		
		driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]")).click();
		
		 //Take snapshot
		 File source11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName11 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase02\\03"+driver.getTitle()+".png");

		 FileUtils.copyFile(source11, screenshotName11);


		 Reporter.log("<br><img src='"+screenshotName11+"' height='400' width='850'/><br>");

		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/div/ul/a[2]")).click();
	 
	    WebDriverWait wait1 = new WebDriverWait(driver,40);
		WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/a"))));
		
	//Take snapshot
	 File source111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	 File screenshotName111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase02\\04"+driver.getTitle()+".png");

	 FileUtils.copyFile(source111, screenshotName111);


	 Reporter.log("<br><img src='"+screenshotName111+"' height='400' width='850'/><br>");
	 
	 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/a")).isEnabled());
	 
	 Reporter.log("-------------------------Asserted:-Change Password link is available-----------------------------");
	 
	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div/a")).click();
	
	 }
	 
	@Test(priority=9,dependsOnMethods="cMyProfilePage",description="This test is to verify if user can set new password")
	
	public void dChangePassword() throws IOException
	
	{
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("Password234");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Change456");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys("Change456");
		
		//Take snapshot
		 File source1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase02\\05"+driver.getTitle()+".png");

		 FileUtils.copyFile(source1111, screenshotName1111);


		 Reporter.log("<br><img src='"+screenshotName1111+"' height='400' width='850'/><br>");
		 

		WebDriverWait wait1 = new WebDriverWait(driver,40);
		WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[5]/button"))));
			 
		 
		 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/form/div[5]/button")).isEnabled());
		 
		 Reporter.log("-------------------------Asserted:-Password change 'Submit' button is available-----------------------------");
		
		 	
		 
		 //Logout and Quit
		 WebDriverWait wait = new WebDriverWait(driver,40);
			WebElement element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]"))));
			
			driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]")).click();
			
			 //Logout
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/div/ul/div/a")).click();

			WebDriverWait wait11=new WebDriverWait(driver,40);
			WebElement element11=wait11.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/h4"))));

			driver.quit();
			
		
	}
	 
	 
	 
	 
}
