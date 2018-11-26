package TestSuite01;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class iEditPatientEmailValidation {

	
	WebDriver driver;
	
	@Test(priority=20)
	
	public void aTestSummary()
	{
		Reporter.log("This Test case is to search for a patient that has been previously prescribed with prescriptions, click on the patient name and verify if prescription is editable");	
	}
	
	@Test(priority=21,dependsOnMethods="aTestSummary",description="Login to the application and Search for a patient and select the patient")
	
	public void bSelectPatient() throws IOException, Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

		 //Open url
		 driver.get("http://ptwired-website-devel.s3-website-us-east-1.amazonaws.com/#/");
		 
		 //Maximize browser window
		 driver.manage().window().maximize();
		 
		 //Wait for login button to be clickable
		 
		 WebDriverWait wait = new WebDriverWait(driver,40);
		 
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[1]/input")));
		 
		 //Send Values to field Login
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[1]/input")).sendKeys("veena@ptwired.com");
		 
		 //Send values to password field
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys("Password234");
	 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					//Click on Login
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")).click();
	
		 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		 WebDriverWait wait21=new WebDriverWait(driver,40);
		WebElement element21=wait21.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button"))));

		
			driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[3]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[3]/div/input")).sendKeys("TestPatient07");	 
		 
	
	 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 
	 WebDriverWait wait211=new WebDriverWait(driver,40);
	WebElement element211=wait211.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a"))));

	driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a")).click();

	 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
		 //Take snapshot
		 File source11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName11 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\01"+driver.getTitle()+".png");

		 FileUtils.copyFile(source11, screenshotName11);


		 Reporter.log("<br><img src='"+screenshotName11+"' height='400' width='850'/><br>");
		 

		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 //Click on user name
		 driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]")).click();
		
		 //Logout
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/div/ul/div/a")).click();
			
			WebDriverWait wait1=new WebDriverWait(driver,40);
			WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/h4"))));

		 
			driver.quit();
			
		 
		 
		 
	}
	
} 
		 
		
	 
 

