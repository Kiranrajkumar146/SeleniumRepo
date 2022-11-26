package week4Day1Assignments;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
			driver.get("http://leaftaps.com/opentaps/control/login");
		//Enter UserName and Password Using Id Locator
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator
			driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
			driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on contacts Button
			driver.findElement(By.linkText("Contacts")).click();
		//Click on Merge Contacts using Xpath Locator
			driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on Widget of From Contact
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		//Click on First Resulting Contact
			Set<String> windowHandles = driver.getWindowHandles();
			ArrayList<String> list = new ArrayList<String>(windowHandles);
			driver.switchTo().window(list.get(1));
		//Click on First Resulting Contact
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//Click on Widget of To Contact
			driver.switchTo().window(list.get(0));
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		//Click on Second Resulting Contact
			driver.switchTo().window(list.get(1));
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		//Click on Merge button using Xpath Locator
			driver.switchTo().window(list.get(0));
			driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//Accept the Alert
			driver.switchTo().alert().accept();
		//Verify the title of the page
			String title = driver.getTitle();
			System.out.println(title);
	}
}