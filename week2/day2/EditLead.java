package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Launch the browser
	driver.get("http://leaftaps.com/opentaps/control/login");
	//Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Enter username
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	// Enter password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	//Click login
	driver.findElement(By.className("decorativeSubmit")).click();
	//title
	System.out.println(driver.getTitle());
	//Click CRM/SFA
	driver.findElement(By.linkText("CRM/SFA")).click();
	//Title
	System.out.println(driver.getTitle());
	//Click Leads
	driver.findElement(By.linkText("Leads")).click();
	//Title
	System.out.println(driver.getTitle());
	//Click Find leads
	driver.findElement(By.linkText("Find Leads")).click();
	//Title
	System.out.println(driver.getTitle());
	//Enter first name
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("principal");
	//Click Find leads button
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	//Click on first resulting lead
	driver.findElement(By.linkText("principal")).click();
	//Verify title of the page
	System.out.println(driver.getTitle());
	//Click Edit
	driver.findElement(By.linkText("Edit")).click();
	//Change the company name
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf1");
	//Click Update
	driver.findElement(By.name("submitButton")).click();
	//Confirm the changed name appears
	System.out.println(driver.getTitle());
	//Close the browser (Do not log out)*/
	}
}