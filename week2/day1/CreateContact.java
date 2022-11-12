package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
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
		//Enter user name
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
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		//Title
		System.out.println(driver.getTitle());
		//Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Principal");		
		//Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("edward");
		//Click Create Contact Button	
		driver.findElement(By.name("submitButton")).click();
		//title
		System.out.println(driver.getTitle());
	}
}