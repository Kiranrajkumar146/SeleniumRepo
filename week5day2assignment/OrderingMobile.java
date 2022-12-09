package week5day2assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;


public class OrderingMobile {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev61526.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("AuZZk$bE5=a3");
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Service catalog");
		shadow.findElementByXPath("(//mark[text()='Service Catalog'])[1]").click();
		WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		driver.findElement(By.xpath("(//h2//strong)[1]")).click();
		driver.findElement(By.xpath("//label[text()='No']")).click();
		
		//MonthlyDataAllowance
			WebElement monthly_data_allowance = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
			Select options = new Select(monthly_data_allowance);
			options.selectByIndex(2);
		
		driver.findElement(By.xpath("//label[text()='Starlight']")).click();
		driver.findElement(By.xpath("//label[text()='128 GB']")).click();		
		driver.findElement(By.id("oi_order_now_button")).click();
		String order_status = driver.findElement(By.xpath("//span[@aria-live='assertive']")).getText();
		if (order_status.contentEquals("Thank you, your request has been submitted")) {
			System.out.println("Order placed");
		} 
		else {
			System.out.println("Order not placed");
		}
		String request_number = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(request_number);
	}
}