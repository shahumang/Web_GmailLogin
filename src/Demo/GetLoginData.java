package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Filepath;
import util.ReadData;

public class GetLoginData {
	public static void getCredentials(WebDriver driver) throws Exception
	{
		WebElement email = driver.findElement(By.xpath("//input[@id='identifierId']"));													 
		ReadData.setExcelFile(Filepath.filepath + Filepath.filename ,"Login");
		String getEmail = ReadData.getCellData(1, 0);
		System.out.println(getEmail);
		email.sendKeys(getEmail);
		
		WebElement nxt_btn = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
		nxt_btn.click();
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));													 
		ReadData.setExcelFile(Filepath.filepath + Filepath.filename ,"Login");
		String getPass = ReadData.getCellData(1, 1);
		System.out.println(getPass);
		pass.sendKeys(getPass);
		
		WebElement nxt_btn1 = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		nxt_btn1.click();
		
	}
}
