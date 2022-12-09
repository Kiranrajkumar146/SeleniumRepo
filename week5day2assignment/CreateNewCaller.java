package week5day2assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CreateNewCaller {
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
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("callers");
		shadow.findElementByXPath("//mark[text()='Caller']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("raj kumar");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("A new caller");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("kiranrajkumar146@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("0123456789");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		String verification = driver.findElement(By.xpath("//div[@class='outputmsg_text']")).getText();
		System.out.println(verification);
	}
}