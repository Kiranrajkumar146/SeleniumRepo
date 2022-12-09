package week5day2assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;


public class CreateNewProposal {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev61526.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("AuZZk$bE5=a3");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("sysverb_login")).click();
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//div[text()='All']").click();
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("proposals");
		shadow.findElementByXPath("//span[text()='My ']").click();
		WebElement frame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		List<WebElement> existing_proposals = driver.findElements(By.xpath("//table[@id = 'std_change_proposal_table']//tbody//tr"));
		int existing_proposals_count = existing_proposals.size();
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("Another new proposal");
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		List<WebElement> updated_proposals = driver.findElements(By.xpath("//table[@id = 'std_change_proposal_table']//tbody//tr"));
		int updated_proposals_count = updated_proposals.size();
		if(updated_proposals_count > existing_proposals_count) {
			System.out.println("New proposal updated");
			String new_proposal_template_description = driver.findElement(By.xpath("//table[@id = 'std_change_proposal_table']//tbody//tr[1]//td[4]")).getText();
			System.out.println(new_proposal_template_description);
		}
		else {
			System.out.println("No new updates");
		}
	}
}