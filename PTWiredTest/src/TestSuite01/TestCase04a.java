package TestSuite01;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
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

public class TestCase04a {

	
	WebDriver driver;
	
	@Test(priority=1)
	
	public void aTestSummary()
	{
		Reporter.log("This Test case is to search for a patient, click on the patient name and verify filter options available, and ensure all filters and end results work for the option Head and Neck");	
	}
	
	@Test(priority=2,dependsOnMethods="aTestSummary",description="Login to the application and Search for a patient and select the patient")
	
	public void bSelectPatient() throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();

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
		WebElement element21=wait21.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[2]/div/a/button"))));

		
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[3]/div/input")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[3]/div/input")).sendKeys("TestPatient06");	 
		 
	
	 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	 
	 WebDriverWait wait211=new WebDriverWait(driver,40);
	WebElement element211=wait211.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/a"))));

	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/a")).click();

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
		
		//filter
			
			 WebDriverWait wait2111=new WebDriverWait(driver,40);
			WebElement element2111=wait2111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/button"))));
	
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		Reporter.log("-----------------------Options available in dropdown are-----------------");
		 for(int i=0; i<list.size(); i++)
		 	
		 {		
			WebElement elements=list.get(i); 
			
			String values=elements.getAttribute("innerHTML");
		 	Reporter.log(values);
	
		 }


		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/button")).click();

		 //Take snapshot
		 File source111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\02"+driver.getTitle()+".png");

		 FileUtils.copyFile(source111, screenshotName111);


		 Reporter.log("<br><img src='"+screenshotName111+"' height='400' width='850'/><br>");
		 

		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		//head and neck
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/a")).click();

		

		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
		//filter

			List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
			Reporter.log("-----------------------Options available within Head and Neck are-----------------");
			 for(int i=4; i<list1.size(); i++)
			 	
			 {		
				WebElement elements=list1.get(i); 
				
				String values=elements.getAttribute("innerHTML");
			 	Reporter.log(values);
		
			 }

		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/button")).click();

		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 //Take snapshot
		 File source1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\03"+driver.getTitle()+".png");

		 FileUtils.copyFile(source1111, screenshotName1111);


		 Reporter.log("<br><img src='"+screenshotName1111+"' height='400' width='850'/><br>");
		 

		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		 //Select Cervical and spine
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[2]/ul/li[1]/a")).click();
		 
		 
		//filter

			List<WebElement> list11=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
			Reporter.log("-----------------------Options available within Cervical and Spine are-----------------");
			 for(int i=7; i<list11.size(); i++)
			 	
			 {		
				WebElement elements=list11.get(i); 
				
				String values=elements.getAttribute("innerHTML");
			 	Reporter.log(values);
		
			 }

		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/button")).click();

		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 //Take snapshot
		 File source11111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName11111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\04"+driver.getTitle()+".png");

		 FileUtils.copyFile(source11111, screenshotName11111);


		 Reporter.log("<br><img src='"+screenshotName11111+"' height='400' width='850'/><br>");
		 

		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //Select Cervical Spine extensors
		 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/ul/li[1]/a")).click();
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		//Take snapshot
		 File source111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\05"+driver.getTitle()+".png");

		 FileUtils.copyFile(source111111, screenshotName111111);


		 Reporter.log("<br><img src='"+screenshotName111111+"' height='400' width='850'/><br>");
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //Select Cervical spine flexors
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/ul/li[2]/a")).click();
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		//Take snapshot
		 File source1111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName1111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\06"+driver.getTitle()+".png");

		 FileUtils.copyFile(source1111111, screenshotName1111111);


		 Reporter.log("<br><img src='"+screenshotName1111111+"' height='400' width='850'/><br>");
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		//Select Cervical spine Rotators
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/ul/li[3]/a")).click();
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		//Take snapshot
		 File source11111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName11111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\07"+driver.getTitle()+".png");

		 FileUtils.copyFile(source11111111, screenshotName11111111);


		 Reporter.log("<br><img src='"+screenshotName11111111+"' height='400' width='850'/><br>");
		 
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		//Select Cervical spine Side Flexors
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[3]/ul/li[4]/a")).click();
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		//Take snapshot
		 File source111111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName111111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\VerifyLinks\\08"+driver.getTitle()+".png");

		 FileUtils.copyFile(source111111111, screenshotName111111111);


		 Reporter.log("<br><img src='"+screenshotName111111111+"' height='400' width='850'/><br>");
		 
		 
		 
		 
		 
		 
	}
	
} 
		 
		
	 
 

