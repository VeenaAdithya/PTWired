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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase03c {


		WebDriver driver;
		
		@Test(priority=17)
		
		public void aStartBrowser()
		{
			Reporter.log("This test case is to add a new patient, and clicking on save; then searching for the patient and continue to prescribe head and neck related therapy");
			
			Reporter.log("-------------------------------------------------------------------------------------");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			Reporter.log("---------------------Browser has started----------------");
			
		}
			
		 @Test(priority=18,dependsOnMethods="aStartBrowser",description="This test is to verify if Login page accepts username")
		 
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
			
			 
		}

		 @Test(priority=19,dependsOnMethods="bLogin",description="This test is to add new patient")
		 
		 public void cTestCase03c() throws IOException
		 
		 
		 {
			 WebDriverWait wait11 = new WebDriverWait(driver,40);
			 
			 WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button")));
			
			 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button")).isEnabled());
			 
			 Reporter.log("-----------------------Asserted:--Add New Patient button is available in home page----------------");
			 
			 driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[2]/div/a/button")).click();
			 	 
			 String Firstname;
			 String Lastname;
			 String DateOfBirth;
			 String Email;
			 
			 File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\PTWired\\TestSuite01\\TestCase03c.xlsx");
			 
			 FileInputStream fis=new FileInputStream(src);
			 
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet1=wb.getSheet("Sheet1");
			 
			XSSFRow row=sheet1.getRow(3);
			XSSFCell cell1=row.getCell(1);
			 
			XSSFRow row1=sheet1.getRow(4);
			XSSFCell cell2=row1.getCell(1);
			 
			XSSFRow row2=sheet1.getRow(5);
			XSSFCell cell3=row2.getCell(1);
			 
			XSSFRow row3=sheet1.getRow(6);
			XSSFCell cell4=row3.getCell(1);

			Firstname=cell1.toString();
			Lastname=cell2.toString();
			DateOfBirth=cell3.toString();
			Email=cell4.toString();
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[1]/div[1]/div/input")).sendKeys(Firstname);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[1]/div[2]/div/input")).sendKeys(Lastname);
			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[2]/div[1]/div/input")).sendKeys(DateOfBirth);
			 
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[1]/form/div[2]/div[2]/div/input")).sendKeys(Email);
			 
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 WebDriverWait wait111 = new WebDriverWait(driver,40);
			 
			 WebElement element111 = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/button[1]")));
			
			 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/button[2]")).isEnabled());
			 
			 Reporter.log("-----------------------------Asserted:--Save button is enabled--------------------------");
			 
			 
			 //Take snapshot
			 File source11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 File screenshotName11 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\01"+driver.getTitle()+".png");

			 FileUtils.copyFile(source11, screenshotName11);


			 Reporter.log("<br><img src='"+screenshotName11+"' height='400' width='850'/><br>");

			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/button[2]")).click();
			 

				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				//Save again
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/button[2]")).click();
				
				
			 	try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 	
			 //Take snapshot
			 File source111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 File screenshotName111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\02"+driver.getTitle()+".png");

			 FileUtils.copyFile(source111, screenshotName111);

			 Reporter.log("<br><img src='"+screenshotName111+"' height='400' width='850'/><br>");

				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
				//Search for the patient
				WebDriverWait wait21=new WebDriverWait(driver,40);
				WebElement element21=wait21.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[3]/div/input"))));

				
					driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[3]/div/input")).click();
					driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[1]/div[3]/div/input")).sendKeys(Firstname);	 
				 
			
			 try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			 
			WebDriverWait wait211=new WebDriverWait(driver,40);
			WebElement element211=wait211.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a"))));

			Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a")).isDisplayed());
			Reporter.log("---------------------------Patient is successfully added------------------------------");
			
			//Take snapshot
			 File source1112 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 File screenshotName1112 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\02a"+driver.getTitle()+".png");

			 FileUtils.copyFile(source1112, screenshotName1112);

			 Reporter.log("<br><img src='"+screenshotName1112+"' height='400' width='850'/><br>");

			 
			driver.findElement(By.xpath("//*[@id=\"pt-tab-layout-pane-1\"]/div/div/div/div[2]/div/div/div/div[2]/div[1]/a")).click();

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
				 
				 Reporter.log("Prescription 1 is selected");
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,300)");
				 
				 
				 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 
				 //Take snapshot
				 File source11122 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName11122 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\03"+driver.getTitle()+".png");

				 FileUtils.copyFile(source11122, screenshotName11122);

				 Reporter.log("<br><img src='"+screenshotName11122+"' height='400' width='850'/><br>");
				 
				 
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
				 
				 Reporter.log("Prescription 2 is selected");
				 
				 //Take snapshot
				 File source1111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName1111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\04"+driver.getTitle()+".png");

				 FileUtils.copyFile(source1111, screenshotName1111);

				 Reporter.log("<br><img src='"+screenshotName1111+"' height='400' width='850'/><br>");

				 
				 //Scroll down
				 JavascriptExecutor js11 = (JavascriptExecutor) driver;
				 js11.executeScript("window.scrollBy(0,800)");
				 
				 
				 try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 

				 WebDriverWait wait1111111 = new WebDriverWait(driver,80); 
				 WebElement element1111111 = wait1111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[62]/div/div/div/div[1]/img")));
				
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[62]/div/div/div/div[1]/img")).click();
				 
				 Reporter.log("Prescription 3 is selected");
				 
				 //Take snapshot
				 File source11111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName11111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\05"+driver.getTitle()+".png");

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

				 File screenshotName111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\06"+driver.getTitle()+".png");

				 FileUtils.copyFile(source111111, screenshotName111111);

				 Reporter.log("<br><img src='"+screenshotName111111+"' height='400' width='850'/><br>");
				 
				 //scroll up
				 JavascriptExecutor js1111 = (JavascriptExecutor) driver;
				 js1111.executeScript("window.scrollBy(3000,0)");
				 
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
								 
				 //filter for Head and neck
				 
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
				 
				 driver.findElement((By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/img"))).click();
					
				 Reporter.log("Prescription 4 is selected");				 
				 
				 //Take snapshot				 
				 File source11111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName11111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\08"+driver.getTitle()+".png");

				 FileUtils.copyFile(source11111111, screenshotName11111111);

				 Reporter.log("<br><img src='"+screenshotName11111111+"' height='400' width='850'/><br>");
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				 //click on next
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div/div[3]/button")).click();
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				//Scroll up
				 JavascriptExecutor js11111 = (JavascriptExecutor) driver;
				 js11111.executeScript("window.scrollBy(1000,0)");
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 //Enter frequency
				 WebDriverWait wait1111111111 = new WebDriverWait(driver,40); 
				 WebElement element1111111111 = wait1111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/form/div[1]/div[1]/div/div/input")));
				 
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/form/div[1]/div[1]/div/div/input")).sendKeys("4");
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 
				 //Assign
				//Scroll down
				 JavascriptExecutor js111111 = (JavascriptExecutor) driver;
				 js111111.executeScript("window.scrollBy(0,1000)");
				 
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/button")).click();
				 
				 WebDriverWait wait11111111111 = new WebDriverWait(driver,40); 
				 WebElement element11111111111 = wait11111111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div")));
				 
				Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div")).isDisplayed());
				Reporter.log("-------------Prescription for the patient is successfully completed-------------------");
				 
				 
				 //Take snapshot				 
				 File source111111111 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				 File screenshotName111111111 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\TestCase03c\\09"+driver.getTitle()+".png");

				 FileUtils.copyFile(source111111111, screenshotName111111111);

				 Reporter.log("<br><img src='"+screenshotName111111111+"' height='400' width='850'/><br>");

		 
		 }
		 
		 
		 
		 
		 
		 
		 
}
