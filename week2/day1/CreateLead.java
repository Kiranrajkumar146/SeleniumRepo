package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		//Setup
		WebDriverManager.chromedriver().setup();
		//Object
		ChromeDriver driver = new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		//Load URL
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
		//Click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Title
		System.out.println(driver.getTitle());
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("principal");
		//Enter las tname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("edward");
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("principal");
		//Enter Department Field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		//Enter Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is testing based institution");
		//Enter your email in the E-mail address Field
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kiranrajkumar146@gmail.com");
		//click create lead
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle()); 
		
	}
}