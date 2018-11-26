package TestSuite01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class gPatientFormEmailValidation {


		WebDriver driver;
		
		@Test(priority=10)
		
		public void aStartBrowser()
		{
			
			Reporter.log("This Test case is to ensure email validation is accurate in Add patient form" );
			
			Reporter.log("------------------------------------------------------------------------------------------------");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			Reporter.log("---------------------Browser has started----------------");
			
		}
			
		 @Test(priority=11,dependsOnMethods="aStartBrowser")
		 
		 public void bLogin()
		 {
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
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			WebDriverWait wait1=new WebDriverWait(driver,40);
			WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button"))));
			
			//Click on Login
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div[2]/div/div[2]/form/div[3]/button")).click();
			
			 
		}

		 @Test(priority=12,dependsOnMethods="bLogin")
		 
		 public void cAddNewPatient() throws IOException
		 
		 
		 {
			 WebDriverWait wait11 = new WebDriverWait(driver,40);
			 
			 WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button")));
			
			 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button")).isEnabled());
			 
			 Reporter.log("-----------------------Asserted:--Add New Patient button is available in home page----------------");
			 
			 Reporter.log("                                                                                  ");
			 Reporter.log("                                                                                  ");
			 Reporter.log("=====================================================================");
			 
			 driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button")).click();
			
			 WebDriverWait wait111 = new WebDriverWait(driver,40);
			 
			 WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input")));
			
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input")).sendKeys("FirstName");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input")).sendKeys("LastName");
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[2]/div[1]/div/input")).sendKeys("testpatient11@example.com");
			 

			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 			
			 			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input")).click();
			 			try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
			 			String actualerror_message11111=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[2]/div/div/span[2]")).getAttribute("innerHTML");
						
					 	Reporter.log("-------------Error message displayed is---------"+actualerror_message11111);
					 	Reporter.log("                                                                                  ");
					 	
					 	String expectederror_message11111="Email must be unique";
						
						Assert.assertEquals(actualerror_message11111, expectederror_message11111);
						
						Reporter.log("--------------Asserted:--Email is validated and doesnot allow me to add an existing patient------------------------");
						Reporter.log("                                                                                  ");
						Reporter.log("                                                                                  ");
					
						Reporter.log("=====================================================================");
						
						
						//Take snapshot
					 File source1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

					 File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase06\\02"+driver.getTitle()+".png");

					 FileUtils.copyFile(source1111, screenshotName1111);

					 Reporter.log("<br><img src='"+screenshotName1111+"' height='400' width='850'/><br>");

						
					 try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/a/button")).click();
					 
					 try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[3]/button[1]")).click();
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	
//					 //Click on user name
					 driver.findElement(By.xpath("//*[@id=\"bg-nested-dropdown\"]")).click();
					
					 //Logout
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div/div/div/div/div[1]/div/div/ul/div/a")).click();
//						
						WebDriverWait wait1=new WebDriverWait(driver,40);
						WebElement element1=wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/h4"))));
//
//					 
						driver.quit();
						
		 }
		 
		 
		 
}
