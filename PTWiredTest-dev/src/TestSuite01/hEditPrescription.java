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

public class hEditPrescription {

	
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
		
	 
	 
	 	WebDriverWait wait2111=new WebDriverWait(driver,40);
		WebElement element2111=wait2111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[3]"))));
 
	 
		Reporter.log("                                                                                 ");
		Reporter.log("Patient prescription page is open, snapshot is taken to verify elements on the page");
			
		//Take snapshot
		 File source11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName11 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\01"+driver.getTitle()+".png");

		 FileUtils.copyFile(source11, screenshotName11);

		 Reporter.log("<br><img src='"+screenshotName11+"' height='400' width='850'/><br>");
		 
	 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
		 //Click on the slick arrows to validate display
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[3]")).click();
		
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[3]")).click();
		
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[1]")).click();
		
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/div/div/div[1]")).click();
		 
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		 //Scroll down and click on Edit prescription button
		 JavascriptExecutor js111111 = (JavascriptExecutor) driver;
		 js111111.executeScript("window.scrollBy(0,1000)");
		
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		
		 
		 Reporter.log("                                                                                              ");
		 
		 Reporter.log("Scroll down and take snapshot and verify elements for edit and print icons");
		 
		 //take snapshot
		 
		 File source111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\02"+driver.getTitle()+".png");

		 FileUtils.copyFile(source111, screenshotName111);

		 Reporter.log("<br><img src='"+screenshotName111+"' height='400' width='850'/><br>");
		 	 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div[1]/div/span[1]/i")).click();
		 
		 
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //Delete first prescription available
		 
		 	WebDriverWait wait21111=new WebDriverWait(driver,40);
			WebElement element21111=wait21111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/a/i"))));
	 	 
		//Take snaphot
			
			Reporter.log("                                                                                ");
			Reporter.log("---------------------Snapshot before adding a new prescription-------------");
			
			 File source1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\03"+driver.getTitle()+".png");

			 FileUtils.copyFile(source1111, screenshotName1111);

			 Reporter.log("<br><img src='"+screenshotName1111+"' height='400' width='850'/><br>");
		
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		//Filter and add another prescription
		
		Reporter.log("---------New Prescription is added; validate list of prescription in the right side also displays new prescription--------");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div/button")).click();
		 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/ul/li[3]/a")).click();
		
		 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	 
		
	 	WebDriverWait wait211111=new WebDriverWait(driver,40);
		WebElement element211111=wait211111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/img"))));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/img")).click();
		 
		//Take snaphot
		
				Reporter.log("Snapshot after adding a new prescription");
			
				
				 File source11111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName11111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\04"+driver.getTitle()+".png");

				 FileUtils.copyFile(source11111, screenshotName11111);

				 Reporter.log("<br><img src='"+screenshotName11111+"' height='400' width='850'/><br>");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 	 
	//scroll down
		
		 JavascriptExecutor js1111111 = (JavascriptExecutor) driver;
		 js1111111.executeScript("window.scrollBy(0,10000)");
		
		 
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 	WebDriverWait wait2111111=new WebDriverWait(driver,40);
			WebElement element2111111=wait2111111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[176]/div/div/div/div[1]/img"))));
			//select another prescription
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[176]/div/div/div/div[1]/img")).click();
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 Reporter.log("-----Scroll down and add another prescription; validate prescription is added to the list");
		 
		 //take snapshot
		 
		 File source111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\05"+driver.getTitle()+".png");

		 FileUtils.copyFile(source111111, screenshotName111111);

		 Reporter.log("<br><img src='"+screenshotName111111+"' height='400' width='850'/><br>");
		 		 
		 //Remove one of the added prescriptions

		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[6]/div/div[1]/div/a/i")).click();
		  
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 Reporter.log("------Remove the last prescription added, by clicking on the 'x' button; validate it is removed-------");
		 //take snapshot
		 
		 File source2111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName2111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\05a"+driver.getTitle()+".png");

		 FileUtils.copyFile(source2111111, screenshotName2111111);

		 Reporter.log("<br><img src='"+screenshotName2111111+"' height='400' width='850'/><br>");
		
		//click on next
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div/div[4]/button")).click();
		 
		 WebDriverWait wait22111111=new WebDriverWait(driver,40);
		WebElement element22111111=wait22111111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/button"))));
	 	  
		 //scroll down and click on assign
		
		 JavascriptExecutor js11111111 = (JavascriptExecutor) driver;
		 js11111111.executeScript("window.scrollBy(0,4000)");
		
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div[4]/button")).click();
		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 
		 //take snapshot of confirmation snackbar
		 Reporter.log("------------------snapshot with confirmation snack bar--------------------");
		 

		 File source1111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName1111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\06"+driver.getTitle()+".png");

		 FileUtils.copyFile(source1111111, screenshotName1111111);

		 Reporter.log("<br><img src='"+screenshotName1111111+"' height='400' width='850'/><br>");
		 	 
		
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 
		  
		 
		 
		 
		 
		 
		 
		 
		 //******************************
		 
		 //Click on edit again and remove the other prescription added
		 
		 
		 Reporter.log("                                                                                        ");
		 
		 Reporter.log("-----------Click on Edit button; to remove the other prescription added-------------");
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div[1]/div/span[1]/i")).click();
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //snapshot before removing prescription
		 
		 Reporter.log("------Snapshot before removing 90-90 excercise prescription----------");
		 
		 File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName1 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\06a"+driver.getTitle()+".png");

		 FileUtils.copyFile(source1, screenshotName1);

		 Reporter.log("<br><img src='"+screenshotName1+"' height='400' width='850'/><br>");
		 
		 	WebDriverWait wait321111=new WebDriverWait(driver,40);
			WebElement element321111=wait321111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/a/i"))));
		 
		 //Remove prescription
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[2]/div[5]/div/div[1]/div/a/i")).click();
		
		 //snapshot after removing prescription
		 
		 Reporter.log("------Snapshot after removing 90-90 excercise prescription----------");
		 
		 File source3111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		 File screenshotName3111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\06b"+driver.getTitle()+".png");

		 FileUtils.copyFile(source3111, screenshotName3111);

		 Reporter.log("<br><img src='"+screenshotName3111+"' height='400' width='850'/><br>");
		 
			//scroll down
			
		 JavascriptExecutor js111111111 = (JavascriptExecutor) driver;
		 js111111111.executeScript("window.scrollBy(0,10000)");
		
		 
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 	WebDriverWait wait21111111=new WebDriverWait(driver,40);
			WebElement element21111111=wait21111111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div/div[4]/button"))));

			//click on next
			 
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div/div[4]/button")).click();
			 
			 WebDriverWait wait221111111=new WebDriverWait(driver,40);
			WebElement element221111111=wait221111111.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/div/div/button"))));
		 	  
			 //scroll down and click on assign
			
			 JavascriptExecutor js1111111111 = (JavascriptExecutor) driver;
			 js1111111111.executeScript("window.scrollBy(0,4000)");
			
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div[4]/button")).click();
			 try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		 	 
				 	 
			 //take snapshot of confirmation snackbar
			 Reporter.log("------------------snapshot of confirmation snack bar--------------------");
			 

			 File source11111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 File screenshotName11111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\EditPrescription\\07"+driver.getTitle()+".png");

			 FileUtils.copyFile(source11111111, screenshotName11111111);

			 Reporter.log("<br><img src='"+screenshotName11111111+"' height='400' width='850'/><br>");

		 
 
		 
		 //Scroll up
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("scroll(4000, 0)");
		 
		 //Click on user name

		 try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	
		 driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]")).click();
		
		 //Logout
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/div/ul/div/a")).click();
			
			WebDriverWait wait1=new WebDriverWait(driver,40);
			WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/h4"))));

		 
			driver.quit();
			
		 
		 
			
		 
	}
	
} 
		 
		
	 
 

