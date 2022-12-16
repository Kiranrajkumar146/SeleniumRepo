package week7day1assignment;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends LaunchBrowser {
	
	@Test(dataProvider = "fetchdata")
	public void createlead(String Company, String FirstName, String LastName, String PhoneNumber) {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(PhoneNumber);
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	@BeforeTest
	public void file() {
		excel = "CreateLead";
	} 
}