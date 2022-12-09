package week5day2assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class FillMandatoryFields {
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
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge");
		shadow.findElementByXPath("//mark[text()='Knowledge']").click();
	    WebElement element = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//input[@class='form-control element_reference_input']")).sendKeys("IT",Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys("java",Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("A new article");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
	}
}