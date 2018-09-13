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

public class sample {

	
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

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 WebDriverWait wait1111 = new WebDriverWait(driver,40); 
				 WebElement element1111 = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/input")));
				  
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/input")).sendKeys("Spine");
			 
				 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
				 WebDriverWait wait11111 = new WebDriverWait(driver,40); 
				 WebElement element11111 = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[3]/div/div/div/div[1]/img")));
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[3]/div/div/div/div[1]/img")).click();
				 
				 System.out.println("image1 selected");
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,300)");
				 
				 
				 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 
				 //Take snapshot
				 File source111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\AddNewPatienPass\\03"+driver.getTitle()+".png");

				 FileUtils.copyFile(source111, screenshotName111);

				 Reporter.log("<br><img src='"+screenshotName111+"' height='400' width='850'/><br>");
				 
				 
				 //Scroll down
				 JavascriptExecutor js1 = (JavascriptExecutor) driver;
				 js1.executeScript("window.scrollBy(0,600)");
				 
				 
				 try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				 
				 
				 WebDriverWait wait111111 = new WebDriverWait(driver,40); 
				 WebElement element111111 = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[12]/div/div/div/div[1]/img")));
				
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[12]/div/div/div/div[1]/img")).click();
				 
				 System.out.println("image 2 selected");
				 //Take snapshot
				 File source1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\AddNewPatienPass\\04"+driver.getTitle()+".png");

				 FileUtils.copyFile(source1111, screenshotName1111);

				 Reporter.log("<br><img src='"+screenshotName1111+"' height='400' width='850'/><br>");

				 
				 //Scroll down
				 JavascriptExecutor js11 = (JavascriptExecutor) driver;
				 js11.executeScript("window.scrollBy(0,800)");
				 
				 
				 try {
						Thread.sleep(7000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 

				 WebDriverWait wait1111111 = new WebDriverWait(driver,40); 
				 WebElement element1111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[62]/div/div/div/div[1]/img")));
				
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[62]/div/div/div/div[1]/img")).click();
				 
				 System.out.println("image 3 selected");
				 //Take snapshot
				 File source11111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName11111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\AddNewPatienPass\\05"+driver.getTitle()+".png");

				 FileUtils.copyFile(source11111, screenshotName11111);

				 Reporter.log("<br><img src='"+screenshotName11111+"' height='400' width='850'/><br>");

				//Scroll down
				 JavascriptExecutor js111 = (JavascriptExecutor) driver;
				 js111.executeScript("window.scrollBy(0,2000)");
				 
				 
				 try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				//Take snapshot
				 File source111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\AddNewPatienPass\\06"+driver.getTitle()+".png");

				 FileUtils.copyFile(source111111, screenshotName111111);

				 Reporter.log("<br><img src='"+screenshotName111111+"' height='400' width='850'/><br>");
				 
				 //scroll up
				 JavascriptExecutor js1111 = (JavascriptExecutor) driver;
				 js1111.executeScript("window.scrollBy(3000,0)");
				 
				 //Clear search
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/input")).clear();
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				 driver.navigate().refresh();
				 
				//Take snapshot
				 File source1111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName1111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\AddNewPatienPass\\07"+driver.getTitle()+".png");

				 FileUtils.copyFile(source1111111, screenshotName1111111);

				 Reporter.log("<br><img src='"+screenshotName1111111+"' height='400' width='850'/><br>");
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				   
				 
				 //Search for Spine and then filter for Head and neck
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[3]/div/input")).sendKeys("spine");
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				 

				 WebDriverWait wait11111111 = new WebDriverWait(driver,40); 
				 WebElement element11111111 = wait11111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/button")));
				 
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/button")).click();
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				  
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/ul/li[1]/a")).click();
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				 WebDriverWait wait111111111 = new WebDriverWait(driver,40); 
				 WebElement element111111111 = wait111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/img")));
				 
				 //Take snapshot				 
				 File source11111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName11111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\AddNewPatienPass\\08"+driver.getTitle()+".png");

				 FileUtils.copyFile(source11111111, screenshotName11111111);

				 Reporter.log("<br><img src='"+screenshotName11111111+"' height='400' width='850'/><br>");
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/img")).click();
				 
				 
				 //click on next
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div/div[3]/button")).click();
				 
				 
				 
	}
	
} 
		 
		
	 
 

