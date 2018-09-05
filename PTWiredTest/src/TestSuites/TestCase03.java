package TestSuites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

public class TestCase03 {


		WebDriver driver;
		
		@Test(priority=10)
		
		public void aStartBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\veenaramakrishnan\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
			Reporter.log("---------------------Browser has started----------------");
			
		}
			
		 @Test(priority=11,dependsOnMethods="aStartBrowser",description="This test is to verify if Login page accepts username")
		 
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

		 @Test(priority=12,dependsOnMethods="bLogin",description="This test is to add new patient")
		 
		 public void cAddNewPatient() throws IOException
		 
		 
		 {
			 WebDriverWait wait11 = new WebDriverWait(driver,40);
			 
			 WebElement element11 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[2]/div/a/button")));
			
			 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[2]/div/a/button")).isEnabled());
			 
			 Reporter.log("-----------------------Asserted:--Add New Patient button is available in home page----------------");
			 
			 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div[1]/div[2]/div/a/button")).click();
			 	 
			 String Firstname;
			 String Lastname;
			 String DateOfBirth;
			 String Email;
			 
			 File src=new File("C:\\Users\\veenaramakrishnan\\TestSuites\\PTWired\\AddNewPatient.xlsx");
			 
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
			
			 Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/button[1]")).isEnabled());
			 
			 Reporter.log("-----------------------------Asserted:--Save and Add Prescription button is enabled--------------------------");
			 
			 
			 //Take snapshot
			 File source11 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			 File screenshotName11 = new File ("C:\\Users\\veenaramakrishnan\\git\\PTWired\\PTWiredTest\\Screenshots\\AddNewPatient\\01"+driver.getTitle()+".png");

			 FileUtils.copyFile(source11, screenshotName11);


			 Reporter.log("<br><img src='"+screenshotName11+"' height='400' width='850'/><br>");

			 
			 
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div/div/div/button[2]")).click();
			 
			 
			 
		 }
		 
		 
}
